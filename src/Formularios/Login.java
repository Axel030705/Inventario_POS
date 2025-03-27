/* Axel */
package Formularios;

import Administrador.Admin;
import Avisos.Cerrar;
import Conexion.Conexion_BD;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String fechaString = fechaActual.format(formato);

    Conexion.Conexion_BD cc = new Conexion_BD();
    Connection con = cc.getConnection();
    public String usuario;

    public Login() {
        setTitle("Login");
        //setSize(330, 523);
        setSize(888, 556);
        //getContentPane().setBackground(new Color(0x0087FF));
        getContentPane().setBackground(Color.WHITE);
        setIconImage(new ImageIcon(getClass().getResource("")).getImage());
        setLocationRelativeTo(null);
        initComponents();

        //Btn_ingresar.setContentAreaFilled(false);
        Btn_ingresar.setBorderPainted(false);
        //Btn_salir.setContentAreaFilled(false);
        Btn_salir.setBorderPainted(false);

        //rsscalelabel.RSScaleLabel.setScaleLabel(Label_Logo, "src/img/Logo.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_ingresar = new javax.swing.JButton();
        usuario_txt = new javax.swing.JTextField();
        pass_txt = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        Label_Logo = new javax.swing.JLabel();
        Btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        Btn_ingresar.setBackground(new java.awt.Color(255, 151, 0));
        Btn_ingresar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_ingresar.setText("Ingresar");
        Btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_ingresar.setPreferredSize(new java.awt.Dimension(80, 35));
        Btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ingresarMouseEntered(evt);
            }
        });
        Btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ingresarActionPerformed(evt);
            }
        });

        usuario_txt.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        pass_txt.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 151, 0));

        Label_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        Btn_salir.setBackground(new java.awt.Color(153, 0, 0));
        Btn_salir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_salir.setText("Salir");
        Btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_salirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Todos los derechos reservados ©");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pass_txt)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(150, 150, 150))
                    .addComponent(usuario_txt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(Btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ingresarActionPerformed
        validarUsuario();
    }//GEN-LAST:event_Btn_ingresarActionPerformed

    private void Btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_salirActionPerformed
        Cerrar cerrar = new Cerrar();
        cerrar.setVisible(true);
    }//GEN-LAST:event_Btn_salirActionPerformed

    private void Btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ingresarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ingresarMouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.ejemplo.com"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    public void validarUsuario() {
        String User = "root", Password = "root";
        String usuario = usuario_txt.getText();
        String pass = String.valueOf(pass_txt.getPassword());

        // Si el usuario es "root", validar directamente
        if (usuario.equals(User) && pass.equals(Password)) {
            Admin sistemaAdmin = new Admin();
            sistemaAdmin.setVisible(true);
            this.dispose();
            return; // Termina la ejecución aquí
        }

        // Si no es root, verificar en la base de datos con PreparedStatement
        String SQL = "SELECT * FROM usuarios WHERE Usuario = ? AND Contraseña = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, usuario);
            pst.setString(2, pass);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Sistema form = new Sistema();
                form.setVisible(true);
                this.dispose();
                form.LabelUsuario.setText(usuario);
                form.LabelFecha.setText(fechaString);
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO NO REGISTRADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ingresar;
    private javax.swing.JButton Btn_salir;
    private javax.swing.JLabel Label_Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass_txt;
    private javax.swing.JTextField usuario_txt;
    // End of variables declaration//GEN-END:variables
}
