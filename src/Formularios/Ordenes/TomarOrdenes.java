
package Formularios.Ordenes;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;



public class TomarOrdenes extends javax.swing.JFrame {

    
    
    public TomarOrdenes() {
        //Poner imagen como icono 
        try {
            Image img = ImageIO.read(getClass().getResource("/img/Logo_Splash_Screen.png"));
            setIconImage(img);
        } catch (IOException e) {
        }

        setTitle("Tomar ordenes.");
        setSize(1500, 900);
        setLocationRelativeTo(null);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_rebanadas = new javax.swing.JButton();
        btn_pizzas = new javax.swing.JButton();
        btn_combos = new javax.swing.JButton();
        btn_bebidas = new javax.swing.JButton();
        btn_otras_comidas = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        Panel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Texto_ventas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 158, 140));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Logo_ventas.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 113, 113));

        btn_rebanadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_rebanadas.png"))); // NOI18N
        btn_rebanadas.setBorder(null);
        btn_rebanadas.setBorderPainted(false);
        btn_rebanadas.setContentAreaFilled(false);
        btn_rebanadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_rebanadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 200, 140));

        btn_pizzas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_pizzas.png"))); // NOI18N
        btn_pizzas.setBorder(null);
        btn_pizzas.setBorderPainted(false);
        btn_pizzas.setContentAreaFilled(false);
        btn_pizzas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_pizzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 140));

        btn_combos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_combos.png"))); // NOI18N
        btn_combos.setBorder(null);
        btn_combos.setBorderPainted(false);
        btn_combos.setContentAreaFilled(false);
        btn_combos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_combos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 140));

        btn_bebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_bebidas.png"))); // NOI18N
        btn_bebidas.setBorder(null);
        btn_bebidas.setBorderPainted(false);
        btn_bebidas.setContentAreaFilled(false);
        btn_bebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, 140));

        btn_otras_comidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_otras_comidas.png"))); // NOI18N
        btn_otras_comidas.setBorder(null);
        btn_otras_comidas.setBorderPainted(false);
        btn_otras_comidas.setContentAreaFilled(false);
        btn_otras_comidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_otras_comidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_otras_comidasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_otras_comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 140));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton salir.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 2, 110, 140));

        Panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Panel_superior_ventas.png"))); // NOI18N
        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 754, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_otras_comidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_otras_comidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_otras_comidasActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       Avisos.Cerrar salir = new Avisos.Cerrar();
       salir.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(TomarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TomarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TomarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TomarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TomarOrdenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Panel;
    private javax.swing.JButton btn_bebidas;
    private javax.swing.JButton btn_combos;
    private javax.swing.JButton btn_otras_comidas;
    private javax.swing.JButton btn_pizzas;
    private javax.swing.JButton btn_rebanadas;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
