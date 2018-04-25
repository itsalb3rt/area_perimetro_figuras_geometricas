/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Usuario
 */
public class menu_principal extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public menu_principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono_matematicas.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_cerrar = new javax.swing.JButton();
        jLabel_encabezado = new javax.swing.JLabel();
        jButton_cuadrado = new javax.swing.JButton();
        jButton_rectangulo = new javax.swing.JButton();
        jButton_trapecio = new javax.swing.JButton();
        jButton_triangulo = new javax.swing.JButton();
        jLabel_icon_info = new javax.swing.JLabel();
        jLabel_informacion = new javax.swing.JLabel();
        jLabel_copyright = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setName("Calcular area y perimetro"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_cerrar.setBackground(new java.awt.Color(183, 28, 28));
        jButton_cerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cerrar.setText("X");
        jButton_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel_encabezado.setFont(new java.awt.Font("Lemon/Milk", 1, 24)); // NOI18N
        jLabel_encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_encabezado.setText("Calcula el area y perimetro");
        jLabel_encabezado.setToolTipText("");
        getContentPane().add(jLabel_encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jButton_cuadrado.setBackground(new java.awt.Color(33, 33, 33));
        jButton_cuadrado.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jButton_cuadrado.setForeground(new java.awt.Color(245, 245, 245));
        jButton_cuadrado.setText("Cuadrado");
        jButton_cuadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_cuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cuadradoMouseClicked(evt);
            }
        });
        jButton_cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cuadradoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 50));

        jButton_rectangulo.setBackground(new java.awt.Color(33, 33, 33));
        jButton_rectangulo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jButton_rectangulo.setForeground(new java.awt.Color(245, 245, 245));
        jButton_rectangulo.setText("Rectangulo");
        jButton_rectangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_rectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_rectanguloMouseClicked(evt);
            }
        });
        jButton_rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rectanguloActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_rectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 150, 50));

        jButton_trapecio.setBackground(new java.awt.Color(33, 33, 33));
        jButton_trapecio.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jButton_trapecio.setForeground(new java.awt.Color(245, 245, 245));
        jButton_trapecio.setText("Trapecio");
        jButton_trapecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_trapecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_trapecioMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_trapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 150, 50));

        jButton_triangulo.setBackground(new java.awt.Color(33, 33, 33));
        jButton_triangulo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jButton_triangulo.setForeground(new java.awt.Color(245, 245, 245));
        jButton_triangulo.setText("Triangulo");
        jButton_triangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_triangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_trianguloMouseClicked(evt);
            }
        });
        jButton_triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_trianguloActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_triangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 150, 50));

        jLabel_icon_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info_icon.png"))); // NOI18N
        getContentPane().add(jLabel_icon_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel_informacion.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_informacion.setText("Calcula el área y el perímetro de las figuras geométricas que aparecen en el recuadro de manera precisa.");
        getContentPane().add(jLabel_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 610, 20));

        jLabel_copyright.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel_copyright.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_copyright.setText("Copyright 2017  Albert E. Hidalgo Taveras. Todos los Derechos Reservados.");
        getContentPane().add(jLabel_copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 670, 10));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_blanco.png"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, 524));

        getAccessibleContext().setAccessibleName("Calcular area y perimetro");
        getAccessibleContext().setAccessibleDescription("Calcula area y perimetro de varias figuras geomtricas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void jButton_cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cuadradoActionPerformed

    private void jButton_cuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cuadradoMouseClicked
        // Al pulsar el boton de la opcion "Cuadrado" abrira la ventana del cuadrado
        Cuadrado_ventana cuadrado_ventana = new Cuadrado_ventana();
        cuadrado_ventana.setVisible(true); //Hace la ventana visible
        this.dispose(); //Para que cierre la ventana anterior
    }//GEN-LAST:event_jButton_cuadradoMouseClicked

    private void jButton_rectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_rectanguloMouseClicked
       // Al pulsar el boton de la opcion "Rectangulo" abrira la ventana del cuadrado
        Rectangulo_ventana rectangulo_ventana = new Rectangulo_ventana();
        rectangulo_ventana.setVisible(true); //Hace la ventana visible
        this.dispose(); //Para que cierre la ventana anterior
    }//GEN-LAST:event_jButton_rectanguloMouseClicked

    private void jButton_trianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_trianguloMouseClicked
       // Al pulsar el boton de la opcion "Triangulo" abrira la ventana del cuadrado
        Triangulo_ventana triangulo_ventana = new Triangulo_ventana();
        triangulo_ventana.setVisible(true); //Hace la ventana visible
        this.dispose(); //Para que cierre la ventana anterior
    }//GEN-LAST:event_jButton_trianguloMouseClicked

    private void jButton_rectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_rectanguloActionPerformed

    private void jButton_trapecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_trapecioMouseClicked
        // Al pulsar el boton de la opcion "Triangulo" abrira la ventana del cuadrado
        Trapecio_ventana trapecio_ventana = new Trapecio_ventana();
        trapecio_ventana.setVisible(true); //Hace la ventana visible
        this.dispose(); //Para que cierre la ventana anterior
    }//GEN-LAST:event_jButton_trapecioMouseClicked

    private void jButton_trianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_trianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_trianguloActionPerformed

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
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_cuadrado;
    private javax.swing.JButton jButton_rectangulo;
    private javax.swing.JButton jButton_trapecio;
    private javax.swing.JButton jButton_triangulo;
    private javax.swing.JLabel jLabel_copyright;
    private javax.swing.JLabel jLabel_encabezado;
    private javax.swing.JLabel jLabel_icon_info;
    private javax.swing.JLabel jLabel_informacion;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}