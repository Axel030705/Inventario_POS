package Formularios;

import Avisos.Cerrar;
import Avisos.ConfiguracionAviso;
import Avisos.Info;
import Avisos.ProductosAviso;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Sistema extends javax.swing.JFrame {

    public Sistema() {
        setTitle("Inicio");
        setSize(900, 650);
        //getContentPane().setBackground(new Color(0x0087FF));
        getContentPane().setBackground(Color.WHITE);
        setIconImage(new ImageIcon(getClass().getResource("")).getImage());
        setLocationRelativeTo(null);
        initComponents();

        Btn_Info.setContentAreaFilled(false);
        //Btn_Info.setBorderPainted(false);
        Btn_Salir.setContentAreaFilled(false);
        //Btn_Salir.setBorderPainted(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Info = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Panel_Info_Usuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        btn_salidas = new javax.swing.JLabel();
        btn_productos = new javax.swing.JLabel();
        btn_configuracion = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JLabel();
        btn_entradas = new javax.swing.JLabel();
        btn_ventas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 151, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PIZZA DUCK");

        Btn_Info.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        Btn_Info.setText("Info");
        Btn_Info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Btn_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Info.setFocusable(false);
        Btn_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InfoActionPerformed(evt);
            }
        });

        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opcion-de-cerrar-sesion.png"))); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Btn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Salir.setFocusable(false);
        Btn_Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(Btn_Info, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Panel_Info_Usuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de Usuario:");

        LabelUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de Ingreso:");

        LabelFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout Panel_Info_UsuarioLayout = new javax.swing.GroupLayout(Panel_Info_Usuario);
        Panel_Info_Usuario.setLayout(Panel_Info_UsuarioLayout);
        Panel_Info_UsuarioLayout.setHorizontalGroup(
            Panel_Info_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Info_UsuarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(LabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Info_UsuarioLayout.setVerticalGroup(
            Panel_Info_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_Info_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_salidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salidas.png"))); // NOI18N
        btn_salidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salidasMouseClicked(evt);
            }
        });

        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Productos.png"))); // NOI18N
        btn_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productosMouseClicked(evt);
            }
        });

        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Configuracion.png"))); // NOI18N
        btn_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseClicked(evt);
            }
        });

        btn_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inventario.png"))); // NOI18N
        btn_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inventarioMouseClicked(evt);
            }
        });

        btn_entradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Entradas.png"))); // NOI18N
        btn_entradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entradasMouseClicked(evt);
            }
        });

        btn_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ventas.png"))); // NOI18N
        btn_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ventasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel_Info_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_ventas)
                    .addComponent(btn_salidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_entradas)
                    .addComponent(btn_inventario))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_productos)
                    .addComponent(btn_configuracion))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Info_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_entradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_salidas)
                    .addComponent(btn_inventario)
                    .addComponent(btn_configuracion))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InfoActionPerformed
    Info info = new Info();
    info.setVisible(true);
    }//GEN-LAST:event_Btn_InfoActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        Cerrar cerrar = new Cerrar();
        cerrar.setVisible(true);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void btn_salidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salidasMouseClicked
        
    }//GEN-LAST:event_btn_salidasMouseClicked

    private void btn_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMouseClicked
        ProductosAviso PA = new ProductosAviso();
        PA.setVisible(true);
    }//GEN-LAST:event_btn_productosMouseClicked

    private void btn_configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseClicked
        ConfiguracionAviso CA = new ConfiguracionAviso();
        CA.setVisible(true);
    }//GEN-LAST:event_btn_configuracionMouseClicked

    private void btn_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventarioMouseClicked
        
    }//GEN-LAST:event_btn_inventarioMouseClicked

    private void btn_entradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entradasMouseClicked
        
    }//GEN-LAST:event_btn_entradasMouseClicked

    private void btn_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseClicked
        
    }//GEN-LAST:event_btn_ventasMouseClicked

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Info;
    private javax.swing.JButton Btn_Salir;
    public javax.swing.JLabel LabelFecha;
    public javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel Panel_Info_Usuario;
    private javax.swing.JLabel btn_configuracion;
    private javax.swing.JLabel btn_entradas;
    private javax.swing.JLabel btn_inventario;
    private javax.swing.JLabel btn_productos;
    private javax.swing.JLabel btn_salidas;
    private javax.swing.JLabel btn_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
