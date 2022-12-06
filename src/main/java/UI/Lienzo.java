/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;


/**
 *
 * @author raulv
 */
public class Lienzo extends JPanel{

    private BufferedImage imagen;

    public Lienzo() {
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagen != null){       
            g.drawImage(imagen, 0, 0, null);   
        }
    }

    public BufferedImage getImagen() {
        return imagen;
    }
    
    public void drawImage(BufferedImage imagen) {
        this.imagen=imagen;
        repaint();
    }
}
