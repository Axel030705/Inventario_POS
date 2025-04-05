package Formularios;

//Realizado por Axel Onofre
import Avisos.Cerrar;
import Avisos.Info;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sistema_Nuevo extends javax.swing.JFrame {

    public Sistema_Nuevo() {

        //Poner imagen como icono 
        try {
            Image img = ImageIO.read(getClass().getResource("/img/Logo_Splash_Screen.png"));
            setIconImage(img);
        } catch (IOException e) {
        }

        setTitle("Menú de Operaciones");
        setSize(1280, 800);
        setLocationRelativeTo(null);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_Panel_Info = new javax.swing.JLabel();
        Btn_Panel_Salir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Panel_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_Panel_Info.png"))); // NOI18N
        Btn_Panel_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Panel_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_Panel_InfoMousePressed(evt);
            }
        });
        jPanel1.add(Btn_Panel_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, 120));

        Btn_Panel_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Boton_Panel_Salir.png"))); // NOI18N
        Btn_Panel_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Panel_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_Panel_SalirMousePressed(evt);
            }
        });
        jPanel1.add(Btn_Panel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Panel de navegación.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Panel_SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Panel_SalirMousePressed
        Cerrar cerrar = new Cerrar();
        cerrar.setVisible(true);
    }//GEN-LAST:event_Btn_Panel_SalirMousePressed

    private void Btn_Panel_InfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Panel_InfoMousePressed
        Info info = new Info();
        info.setVisible(true);
    }//GEN-LAST:event_Btn_Panel_InfoMousePressed

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
            java.util.logging.Logger.getLogger(Sistema_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema_Nuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Panel_Info;
    private javax.swing.JLabel Btn_Panel_Salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
