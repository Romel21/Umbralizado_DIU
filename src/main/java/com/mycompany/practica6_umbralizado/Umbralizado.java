/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica6_umbralizado;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author romel
 */
public class Umbralizado extends javax.swing.JFrame {

    /**
     * Creates new form Umbralizado
     */
    
    JFileChooser fc = new JFileChooser("");
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen", "jpg", "jpeg");
    private static BufferedImage imagen = null;
    
    public Umbralizado() {
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        initComponents();
        guardar.setEnabled(false);
        umbralizar.setEnabled(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelImagen2 = new com.mycompany.practica6_umbralizado.PanelImagen();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenu();
        umbralizar = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelImagen2Layout = new javax.swing.GroupLayout(panelImagen2);
        panelImagen2.setLayout(panelImagen2Layout);
        panelImagen2Layout.setHorizontalGroup(
            panelImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImagen2Layout.setVerticalGroup(
            panelImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grupo 22 Marlon Alexis Ochoa Álvarez y Romel Pino de Paz");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Umbralizado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(panelImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel2)
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(panelImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        archivo.setBorder(null);
        archivo.setText("Archivo");
        archivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivo.add(abrir);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivo.add(guardar);
        archivo.add(jSeparator1);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        jMenuBar1.add(archivo);

        editar.setText("Editar");

        umbralizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        umbralizar.setText("Umbralizar");
        umbralizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umbralizarActionPerformed(evt);
            }
        });
        editar.add(umbralizar);

        jMenuBar1.add(editar);

        ayuda.setText("Ayuda");

        help.setText("Acerda de...");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        ayuda.add(help);

        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        
        fc.addChoosableFileFilter(filtro);
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            String ruta = "" + fc.getSelectedFile();
            try {
                File fichero = new File(ruta);
                imagen = ImageIO.read(fichero);
                if(imagen.getWidth() > 1024 || imagen.getHeight() > 768){
                    fichero = null;
                    imagen = null;
                    JOptionPane.showMessageDialog(this, "La imagen debe de ser 1024x768 máximo", "Error cargando la imagen", JOptionPane.ERROR_MESSAGE);
                }else{
                    int jpg = ruta.lastIndexOf(".jpg");
                    if (jpg == -1) {
                        JOptionPane.showMessageDialog(rootPane, "Formato de archivo erróneo, por favor\n"
                                + "seleccione un archivo con formato JPG.", "Extenión no válida", JOptionPane.ERROR_MESSAGE);
                    } else {
                        Mat imagen = Imgcodecs.imread(ruta);
                        panelImagen2.setImagenMat(imagen);
                        panelImagen2.repaint();
                    }
                    guardar.setEnabled(true);
                    umbralizar.setEnabled(true);
                }
            } catch (IOException ex) {}
        }
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        fc.addChoosableFileFilter(filtro);
        int res = fc.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            try {
                File file = new File(fc.getSelectedFile() + ".jpg");
                Imgcodecs.imwrite(file.getAbsolutePath(), panelImagen2.getImagenMat());
            } catch (Exception e) {}
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void umbralizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umbralizarActionPerformed
        try{
            int valor = parseInt((String) JOptionPane.showInputDialog(rootPane,"Introdizca un valor para el umbralizado: ",
            "Umbralizado",JOptionPane.PLAIN_MESSAGE, null, null, "150"));
            if (JOptionPane.OK_OPTION == 0) {
                if(valor <= 255 || valor >= 0){
                    panelImagen2.setUmbral(valor);
                }
            }
            panelImagen2.repaint();
            umbralizar.setEnabled(false);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Para umbralizar la imagen debe introducir \n"
                    + "un número entero entre 0 y 255, inténtelo de nuevo.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_umbralizarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane,"¿Desea salir de la aplicacion?","Salir",JOptionPane.YES_NO_OPTION);
        if (res == 0){
          this.dispose(); 
        }
    }//GEN-LAST:event_salirActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Esta aplicacion permite umbralizar una imagen, "
                + "para ello, abra la imagen que desee umbralizar, es decir: \n"
                + "Abra el apartado 'Archivo' y en dicho apartado selecione 'Abrir'. \n"
                + "Para umbralizar vaya al apartado 'Editar' y seleccione 'Umbralizar' e introduzca"
                + " un entero para umbralizar.\n"
                + "Para guardar la imagen vaya a 'Archivo' y seleccione 'Guardar'. \n\n",
                "Acerca de",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_helpActionPerformed

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
            java.util.logging.Logger.getLogger(Umbralizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Umbralizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Umbralizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Umbralizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Umbralizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private com.mycompany.practica6_umbralizado.PanelImagen panelImagen2;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem umbralizar;
    // End of variables declaration//GEN-END:variables
}