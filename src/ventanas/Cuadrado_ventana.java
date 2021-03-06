/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import objetogeometrico.Cuadrado;

/**
 *
 * @author Usuario
 */
public class Cuadrado_ventana extends javax.swing.JFrame {

    /**
     * Creates new form Cuadrado_ventana
     */
    public Cuadrado_ventana() {
    initComponents();       
    this.setLocationRelativeTo(null); //Poner la ventana en mitad de la pantalla
    }
    
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono_matematicas.png")); //Colocar el icono en la barra de tareas
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
        jButton_volver_menu = new javax.swing.JButton();
        jTextField_ladoA = new javax.swing.JTextField();
        jLabel_resultado_perimetro = new javax.swing.JLabel();
        jLabel_area_encabezado = new javax.swing.JLabel();
        jLabel_area_encabezado1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_perimetro = new javax.swing.JLabel();
        jLabel_resultado_area = new javax.swing.JLabel();
        jButton_calcular_area_cuadrado = new javax.swing.JButton();
        jTextField_lado_perimetro = new javax.swing.JTextField();
        jLabel_icon_info = new javax.swing.JLabel();
        jLabel_icon_info1 = new javax.swing.JLabel();
        jButton_calcular_perimetro_cuadrado = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_formula_area_cuadrado = new javax.swing.JLabel();
        jLabel_formula_perimetro_cuadrado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_descripcion_area1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_descripcion_area = new javax.swing.JTextArea();
        jLabel_copyright = new javax.swing.JLabel();
        jLabel_encabezado = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(800, 400));
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

        jButton_volver_menu.setBackground(new java.awt.Color(33, 33, 33));
        jButton_volver_menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_volver_menu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_volver_menu.setText("< Volver al menu");
        jButton_volver_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_volver_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_volver_menuMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_volver_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextField_ladoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ladoAActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_ladoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 80, 40));

        jLabel_resultado_perimetro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(jLabel_resultado_perimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 260, 30));

        jLabel_area_encabezado.setFont(new java.awt.Font("Lemon/Milk", 1, 18)); // NOI18N
        jLabel_area_encabezado.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_area_encabezado.setText("AREA");
        getContentPane().add(jLabel_area_encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel_area_encabezado1.setFont(new java.awt.Font("Lemon/Milk", 1, 18)); // NOI18N
        jLabel_area_encabezado1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_area_encabezado1.setText("Perimetro");
        getContentPane().add(jLabel_area_encabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Lado conocido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel_perimetro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_perimetro.setText("Lado conocido:");
        getContentPane().add(jLabel_perimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel_resultado_area.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(jLabel_resultado_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 260, 30));

        jButton_calcular_area_cuadrado.setBackground(new java.awt.Color(3, 169, 244));
        jButton_calcular_area_cuadrado.setForeground(new java.awt.Color(255, 255, 255));
        jButton_calcular_area_cuadrado.setText("Calcular");
        jButton_calcular_area_cuadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_calcular_area_cuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_calcular_area_cuadradoMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_calcular_area_cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 40));

        jTextField_lado_perimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lado_perimetroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_lado_perimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 80, 40));

        jLabel_icon_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info_icon.png"))); // NOI18N
        getContentPane().add(jLabel_icon_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel_icon_info1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info_icon.png"))); // NOI18N
        getContentPane().add(jLabel_icon_info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jButton_calcular_perimetro_cuadrado.setBackground(new java.awt.Color(3, 169, 244));
        jButton_calcular_perimetro_cuadrado.setForeground(new java.awt.Color(255, 255, 255));
        jButton_calcular_perimetro_cuadrado.setText("Calcular");
        jButton_calcular_perimetro_cuadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_calcular_perimetro_cuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_calcular_perimetro_cuadradoMouseClicked(evt);
            }
        });
        getContentPane().add(jButton_calcular_perimetro_cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 50, 370));

        jLabel_formula_area_cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/area_cuadrado.png"))); // NOI18N
        getContentPane().add(jLabel_formula_area_cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 300, -1));

        jLabel_formula_perimetro_cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/formula_perimetro.png"))); // NOI18N
        getContentPane().add(jLabel_formula_perimetro_cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jScrollPane2.setBorder(null);

        jTextArea_descripcion_area1.setEditable(false);
        jTextArea_descripcion_area1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_descripcion_area1.setColumns(20);
        jTextArea_descripcion_area1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea_descripcion_area1.setRows(5);
        jTextArea_descripcion_area1.setText("El perímetro de un cuadrado es cuatro veces uno de \nsus lados, ya que el cuadrado tiene los cuatro lados iguales.");
        jTextArea_descripcion_area1.setAutoscrolls(false);
        jTextArea_descripcion_area1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jTextArea_descripcion_area1.setFocusable(false);
        jTextArea_descripcion_area1.setRequestFocusEnabled(false);
        jTextArea_descripcion_area1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTextArea_descripcion_area1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 370, 200));

        jScrollPane1.setBorder(null);

        jTextArea_descripcion_area.setEditable(false);
        jTextArea_descripcion_area.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_descripcion_area.setColumns(20);
        jTextArea_descripcion_area.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea_descripcion_area.setRows(5);
        jTextArea_descripcion_area.setText("El área de un cuadrado se calcula a partir de uno de sus\nlados (a). Es el producto de la base por la altura del \ncuadrado, ya que al ser ambas iguales, el área será un\nlado al cuadrado.");
        jTextArea_descripcion_area.setAutoscrolls(false);
        jTextArea_descripcion_area.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jTextArea_descripcion_area.setFocusable(false);
        jTextArea_descripcion_area.setRequestFocusEnabled(false);
        jTextArea_descripcion_area.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea_descripcion_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 350, 200));

        jLabel_copyright.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel_copyright.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_copyright.setText("Copyright 2018  Albert E. Hidalgo Taveras. Todos los Derechos Reservados.");
        getContentPane().add(jLabel_copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        jLabel_encabezado.setFont(new java.awt.Font("Lemon/Milk", 1, 24)); // NOI18N
        jLabel_encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_encabezado.setText("Cuadrado");
        jLabel_encabezado.setToolTipText("");
        getContentPane().add(jLabel_encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 670, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_blanco.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1500, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1500, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void jButton_volver_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_volver_menuMouseClicked
        // Volver al menu
        menu_principal menuprincipal = new menu_principal();
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_volver_menuMouseClicked

    private void jTextField_ladoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ladoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ladoAActionPerformed

    private void jButton_calcular_area_cuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_calcular_area_cuadradoMouseClicked
       // Calcular el area del cuadrado
        double resultado;
        Double numero = new Double(this.jTextField_ladoA.getText()); //Convirtiendo los datos de entrada a double       
        
        Cuadrado cuadrado = new Cuadrado(); //Nuevo objeto de tipo cuadrado
        cuadrado.setArea_conocida(numero); //Enviadno el valor a calcular al set del cuadrado
        resultado = cuadrado.calcularArea(); //Almacenando resultaod del calculo en una variable resultado
        
        String salida = String.valueOf(resultado); //Pasando el resultaod a string para luego imprimirlo en ventana por un campo label jframe
        
        this.jLabel_resultado_area.setText("Resultado: "+salida); //Enviando el resultado al label
    }//GEN-LAST:event_jButton_calcular_area_cuadradoMouseClicked

    private void jTextField_lado_perimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lado_perimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lado_perimetroActionPerformed
    /**
     * Evento al hacer click en el boton calcular ubicado en la seccion del perimetro
     * @param evt 
     */
    private void jButton_calcular_perimetro_cuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_calcular_perimetro_cuadradoMouseClicked
        // Calcular el perimetro del cuadrado
        // Calcular el area del cuadrado
        double resultado;
        Double numero = new Double(this.jTextField_lado_perimetro.getText()); //Convirtiendo los datos de entrada a double       
        
        Cuadrado cuadrado = new Cuadrado(); //Nuevo objeto de tipo cuadrado
        cuadrado.setLado_conocido(numero); //Enviadno el valor a calcular al set del cuadrado
        resultado = cuadrado.calcularPerimetro(); //Almacenando resultaod del calculo en una variable resultado
        
        String salida = String.valueOf(resultado); //Pasando el resultaod a string para luego imprimirlo en ventana por un campo label jframe
        
        this.jLabel_resultado_perimetro.setText("Resultado: "+salida); //Enviando el resultado al label
    }//GEN-LAST:event_jButton_calcular_perimetro_cuadradoMouseClicked

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
            java.util.logging.Logger.getLogger(Cuadrado_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuadrado_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuadrado_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuadrado_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuadrado_ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_calcular_area_cuadrado;
    private javax.swing.JButton jButton_calcular_perimetro_cuadrado;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_volver_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_area_encabezado;
    private javax.swing.JLabel jLabel_area_encabezado1;
    private javax.swing.JLabel jLabel_copyright;
    private javax.swing.JLabel jLabel_encabezado;
    private javax.swing.JLabel jLabel_formula_area_cuadrado;
    private javax.swing.JLabel jLabel_formula_perimetro_cuadrado;
    private javax.swing.JLabel jLabel_icon_info;
    private javax.swing.JLabel jLabel_icon_info1;
    private javax.swing.JLabel jLabel_perimetro;
    private javax.swing.JLabel jLabel_resultado_area;
    private javax.swing.JLabel jLabel_resultado_perimetro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea_descripcion_area;
    private javax.swing.JTextArea jTextArea_descripcion_area1;
    private javax.swing.JTextField jTextField_ladoA;
    private javax.swing.JTextField jTextField_lado_perimetro;
    // End of variables declaration//GEN-END:variables
}
