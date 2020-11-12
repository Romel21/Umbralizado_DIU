/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica6_umbralizado;

import java.awt.Graphics;
import javax.swing.JPanel;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author romel
 */
public class PanelImagen extends JPanel {
    private int u=-1;
    
    private Mat imageMat = null;
    
    public void setImagenMat(Mat img) {
        this.imageMat = img;
    }
    
    public Mat getImagenMat () {
        return imageMat;
    }
    
    public void setUmbral(int u){
        this.u=u;
    }
     
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imageMat != null){
            try {
                if(u>=0){
                    imageMat = umbralizar(imageMat, u);
                }
                g.drawImage(HighGui.toBufferedImage(imageMat),0,0,this.getWidth(),this.getHeight(),this.getBackground(),this);
            } catch (Exception e) {}
        }
    }
    
    private Mat umbralizar(Mat imagen_original, Integer umbral) {
        // crear dos imágenes en niveles de gris con el mismo
        // tamaño que la original
        Mat imagenGris = new Mat(imagen_original.rows(),
                                    imagen_original.cols(),
                                    CvType.CV_8U);
        Mat imagenUmbralizada = new Mat(imagen_original.rows(),
                                        imagen_original.cols(),
                                        CvType.CV_8U);
        
        // convierte a niveles de grises la imagen original
        Imgproc.cvtColor(imagen_original,
                            imagenGris,
                            Imgproc.COLOR_BGR2GRAY);
        
        // umbraliza la imagen:
        // - píxeles con nivel de gris > umbral se ponen a 1
        // - píxeles con nivel de gris <= umbra se ponen a 0
        Imgproc.threshold(imagenGris,
                            imagenUmbralizada,
                            umbral,
                            255,
                            Imgproc.THRESH_BINARY);
        
        return imagenUmbralizada;
    }
}
