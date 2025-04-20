
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

        jPanel2 = new javax.swing.JPanel();
        Panel_Superior_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_rebanadas = new javax.swing.JButton();
        btn_pizzas = new javax.swing.JButton();
        btn_combos = new javax.swing.JButton();
        btn_bebidas = new javax.swing.JButton();
        btn_otras_comidas = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        Panel = new javax.swing.JLabel();
        Panel_Populares_Panel = new javax.swing.JPanel();
        Titulo_Panel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Label_Producto1 = new javax.swing.JLabel();
        Label_Producto2 = new javax.swing.JLabel();
        Label_Producto3 = new javax.swing.JLabel();
        Label_Producto4 = new javax.swing.JLabel();
        Producto1 = new javax.swing.JLabel();
        Producto2 = new javax.swing.JLabel();
        Producto3 = new javax.swing.JLabel();
        Producto4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Superior_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Superior_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Texto_ventas.png"))); // NOI18N
        Panel_Superior_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 158, 140));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Logo_ventas.png"))); // NOI18N
        Panel_Superior_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 113, 113));

        btn_rebanadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_rebanadas.png"))); // NOI18N
        btn_rebanadas.setBorder(null);
        btn_rebanadas.setBorderPainted(false);
        btn_rebanadas.setContentAreaFilled(false);
        btn_rebanadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Superior_Panel.add(btn_rebanadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 200, 140));

        btn_pizzas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_pizzas.png"))); // NOI18N
        btn_pizzas.setBorder(null);
        btn_pizzas.setBorderPainted(false);
        btn_pizzas.setContentAreaFilled(false);
        btn_pizzas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Superior_Panel.add(btn_pizzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 140));

        btn_combos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_combos.png"))); // NOI18N
        btn_combos.setBorder(null);
        btn_combos.setBorderPainted(false);
        btn_combos.setContentAreaFilled(false);
        btn_combos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Superior_Panel.add(btn_combos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 140));

        btn_bebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Boton_bebidas.png"))); // NOI18N
        btn_bebidas.setBorder(null);
        btn_bebidas.setBorderPainted(false);
        btn_bebidas.setContentAreaFilled(false);
        btn_bebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Superior_Panel.add(btn_bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, 140));

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
        Panel_Superior_Panel.add(btn_otras_comidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 140));

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
        Panel_Superior_Panel.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 2, 110, 140));

        Panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelSuperior/Panel_superior_ventas.png"))); // NOI18N
        Panel_Superior_Panel.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Panel_Populares_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Populares_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_Panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Titulo panel (Populares).png"))); // NOI18N
        Panel_Populares_Panel.add(Titulo_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(252, 255, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Producto1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Label_Producto1.setForeground(new java.awt.Color(0, 0, 0));
        Label_Producto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Producto1.setText("PEPERONI");
        Label_Producto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Label_Producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 290, 60));

        Label_Producto2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Label_Producto2.setForeground(new java.awt.Color(0, 0, 0));
        Label_Producto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Producto2.setText("JAMÓN Y TOCINO");
        Label_Producto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Label_Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, 60));

        Label_Producto3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Label_Producto3.setForeground(new java.awt.Color(0, 0, 0));
        Label_Producto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Producto3.setText("MEXICANA");
        Label_Producto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Label_Producto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 290, 60));

        Label_Producto4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Label_Producto4.setForeground(new java.awt.Color(0, 0, 0));
        Label_Producto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Producto4.setText("HAWAIANA");
        Label_Producto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Label_Producto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 290, 50));

        Producto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Producto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Rectangulo_Producto_Popular.png"))); // NOI18N
        jPanel1.add(Producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 310, -1));

        Producto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Producto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Rectangulo_Producto_Popular.png"))); // NOI18N
        jPanel1.add(Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 310, -1));

        Producto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Producto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Rectangulo_Producto_Popular.png"))); // NOI18N
        jPanel1.add(Producto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 178, 310, -1));

        Producto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Producto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Rectangulo_Producto_Popular.png"))); // NOI18N
        jPanel1.add(Producto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 264, 310, -1));

        Panel_Populares_Panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 360));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Panel de populares.png"))); // NOI18N
        Panel_Populares_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Boton (En espera).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TomarOrdenes_PanelPopulares/Boton (Ultima orden).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Superior_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Panel_Populares_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Superior_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_Populares_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 341, Short.MAX_VALUE))
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
    private javax.swing.JLabel Label_Producto1;
    private javax.swing.JLabel Label_Producto2;
    private javax.swing.JLabel Label_Producto3;
    private javax.swing.JLabel Label_Producto4;
    private javax.swing.JLabel Panel;
    private javax.swing.JPanel Panel_Populares_Panel;
    private javax.swing.JPanel Panel_Superior_Panel;
    private javax.swing.JLabel Producto1;
    private javax.swing.JLabel Producto2;
    private javax.swing.JLabel Producto3;
    private javax.swing.JLabel Producto4;
    private javax.swing.JLabel Titulo_Panel;
    private javax.swing.JButton btn_bebidas;
    private javax.swing.JButton btn_combos;
    private javax.swing.JButton btn_otras_comidas;
    private javax.swing.JButton btn_pizzas;
    private javax.swing.JButton btn_rebanadas;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
