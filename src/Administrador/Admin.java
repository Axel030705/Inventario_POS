
package Administrador;


import Formularios.Login_Viejo;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class Admin extends javax.swing.JFrame {

    public Admin() {
        
        //Poner imagen como icono 
        try {
            Image img = ImageIO.read(getClass().getResource("/img/Logo_Splash_Screen.png"));
            setIconImage(img);
        } catch (IOException e) {
        }
        
        initComponents();
        //setSize(600,500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setTitle("Sistema Administrador");
        Boton_Menu.setContentAreaFilled(false);
        PanelD.setVisible(false);
        Btn_Registrar_Menu.setContentAreaFilled(false);
        Btn_Salir.setContentAreaFilled(false);
        Btn_Admin_Usuarios.setContentAreaFilled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Imagen = new javax.swing.JLabel();
        PanelB = new javax.swing.JPanel();
        Boton_Menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelD = new javax.swing.JPanel();
        Administrar = new javax.swing.JLabel();
        Btn_Registrar_Menu = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Btn_Admin_Usuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 151, 0), 3));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gerente.png"))); // NOI18N

        PanelB.setBackground(new java.awt.Color(255, 151, 0));

        Boton_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        Boton_Menu.setBorder(null);
        Boton_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_MenuActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu - Administrador");

        javax.swing.GroupLayout PanelBLayout = new javax.swing.GroupLayout(PanelB);
        PanelB.setLayout(PanelBLayout);
        PanelBLayout.setHorizontalGroup(
            PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBLayout.createSequentialGroup()
                .addComponent(Boton_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBLayout.setVerticalGroup(
            PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton_Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelD.setBackground(new java.awt.Color(255, 255, 255));
        PanelD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 151, 0), 2));

        Administrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Administrar.setForeground(new java.awt.Color(0, 0, 0));
        Administrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administrar.setText("Administrar");

        Btn_Registrar_Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_Registrar_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        Btn_Registrar_Menu.setText("Registrar usuario");
        Btn_Registrar_Menu.setBorder(null);
        Btn_Registrar_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Registrar_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Registrar_MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Registrar_MenuMouseExited(evt);
            }
        });
        Btn_Registrar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Registrar_MenuActionPerformed(evt);
            }
        });

        Btn_Salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida-de-emergencia.png"))); // NOI18N
        Btn_Salir.setText("Regresar al login");
        Btn_Salir.setBorder(null);
        Btn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_SalirMouseExited(evt);
            }
        });
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        Btn_Admin_Usuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_Admin_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios.png"))); // NOI18N
        Btn_Admin_Usuarios.setText("Administrar usuarios");
        Btn_Admin_Usuarios.setBorder(null);
        Btn_Admin_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Admin_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Admin_UsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Admin_UsuariosMouseExited(evt);
            }
        });
        Btn_Admin_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Admin_UsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDLayout = new javax.swing.GroupLayout(PanelD);
        PanelD.setLayout(PanelDLayout);
        PanelDLayout.setHorizontalGroup(
            PanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Administrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Registrar_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Admin_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelDLayout.setVerticalGroup(
            PanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Administrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Registrar_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Admin_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(PanelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Imagen)
                .addGap(36, 36, 36))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(PanelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Imagen)
                        .addGap(0, 220, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_MenuActionPerformed
        int posicion = PanelD.getX();
        if (posicion == 0) {
            Animacion.Animacion.mover_izquierda(0, -310, 2, 2, PanelD);
        } else {
            Animacion.Animacion.mover_derecha(-284, 0, 2, 2, PanelD);
            PanelD.setVisible(true);
        }


    }//GEN-LAST:event_Boton_MenuActionPerformed

    private void Btn_Registrar_MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Registrar_MenuMouseEntered
        Btn_Registrar_Menu.setContentAreaFilled(true);
        Btn_Registrar_Menu.setBackground(new Color(0xFF9800));
        Btn_Registrar_Menu.setForeground(Color.white);

    }//GEN-LAST:event_Btn_Registrar_MenuMouseEntered

    private void Btn_Registrar_MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Registrar_MenuMouseExited
        Btn_Registrar_Menu.setContentAreaFilled(false);
        Btn_Registrar_Menu.setForeground(Color.black);
    }//GEN-LAST:event_Btn_Registrar_MenuMouseExited

    private void Btn_Registrar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Registrar_MenuActionPerformed
        RegistrarUsuariosAdmin RUA = new RegistrarUsuariosAdmin();
        RUA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_Registrar_MenuActionPerformed

    private void Btn_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SalirMouseEntered
        Btn_Salir.setContentAreaFilled(true);
        Btn_Salir.setBackground(new Color(0xFF9800));
        Btn_Salir.setForeground(Color.white);
    }//GEN-LAST:event_Btn_SalirMouseEntered

    private void Btn_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SalirMouseExited
        Btn_Salir.setContentAreaFilled(false);
        Btn_Salir.setForeground(Color.black);
    }//GEN-LAST:event_Btn_SalirMouseExited

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        Login_Viejo login = new Login_Viejo();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_Admin_UsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Admin_UsuariosMouseEntered
        Btn_Admin_Usuarios.setContentAreaFilled(true);
        Btn_Admin_Usuarios.setBackground(new Color(0xFF9800));
        Btn_Admin_Usuarios.setForeground(Color.white);
    }//GEN-LAST:event_Btn_Admin_UsuariosMouseEntered

    private void Btn_Admin_UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Admin_UsuariosMouseExited
        Btn_Admin_Usuarios.setContentAreaFilled(false);
        Btn_Admin_Usuarios.setForeground(Color.black);
    }//GEN-LAST:event_Btn_Admin_UsuariosMouseExited

    private void Btn_Admin_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Admin_UsuariosActionPerformed
        UsuariosRegistrados usrRegistrados = new UsuariosRegistrados();
        usrRegistrados.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_Admin_UsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrar;
    private javax.swing.JButton Boton_Menu;
    private javax.swing.JButton Btn_Admin_Usuarios;
    private javax.swing.JButton Btn_Registrar_Menu;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Imagen;
    private javax.swing.JPanel PanelB;
    private javax.swing.JPanel PanelD;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
