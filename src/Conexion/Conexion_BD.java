/*
    @Programa hecho por Axel Alvarez 
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion_BD {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "root";
    private static String URL = "jdbc:mysql://localhost:3306/inventario_bd"
            + "?useSSL=true&verifyServerCertificate=false"
            + "&requireSSL=true&sslMode=REQUIRED"
            + "&sslKey=/path/to/client-key.pem&sslCert=/path/to/client-cert.pem"
            + "&sslCa=/path/to/server-ca.pem";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            //JOptionPane.showMessageDialog(null, "ERROR EN EL DRIVER: " + e);
            System.out.println("ERROR EN EL DRIVER: " + e);
            System.exit(0);
        }
    }

    public Connection getConnection() {

        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Bienvenido la conexion a la Base de Datos fue exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXION " + e);
            JOptionPane.showMessageDialog(null, "Cerrando el programa");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                if (i == 4) {
                    System.exit(0);
                }
            }
        }
        return con;
    }

    public void registrarUsuario(String nombre, String contraseña) {
        // Verificar si el usuario ya existe
        if (usuarioYaRegistrado(nombre)) {
            System.out.println("El usuario ya está registrado");
        } else {
            // Si el usuario no existe, proceder con el registro
            String sql = "INSERT INTO usuarios (Usuario, Contraseña) VALUES (?, ?)";

            try (Connection con = getConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql)) {

                pstmt.setString(1, nombre);
                pstmt.setString(2, contraseña);

                int filasAfectadas = pstmt.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Usuario registrado exitosamente");
                } else {
                    System.out.println("No se pudo registrar el usuario");
                }

            } catch (SQLException e) {
                throw new RuntimeException("Error al intentar registrar el usuario: " + e.getMessage(), e);
            }
        }
    }

    public boolean usuarioYaRegistrado(String nombre) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE Usuario = ?";

        try (Connection con = getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nombre);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al verificar si el usuario ya está registrado: " + e.getMessage(), e);
        }

        return false;
    }

}
