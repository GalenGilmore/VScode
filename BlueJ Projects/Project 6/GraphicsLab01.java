// GraphicsLab01st.java
// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsLab01 extends JPanel
{

    public void paintComponent(Graphics g)
    {
        //Cube
        g.drawRect(50,50,200,200);
        g.drawRect(100,100,200,200);
        g.drawLine(50,50,100,100);
        g.drawLine(50,250,100,300);
        g.drawLine(250,50,300,100);
        g.drawLine(250,250,300,300);
        
        //Sphere
        g.drawOval(50,325,250,250);
        g.drawOval(150,325,50,250);
        g.drawOval(100,325,150,250);
        g.drawOval(75,325,200,250);
        
        g.drawOval(50,425,250,50);
        g.drawOval(50,375,250,150);
        g.drawOval(50,350,250,200);
        
        //INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(350,50,200,200);
        g.drawLine(350,150,530,90);
        g.drawLine(530,90,450,250);
        g.drawLine(450,250,350,150);
        g.drawOval(390,123,95,95);

        // DRAW APCS
        g.fillRect(350,400,20,100);
        g.fillRect(350,400,40,20);
        g.fillRect(350,430,40,20);
        g.fillRect(390,400,20,100);
        
        g.fillRect(420,400,20,100);
        g.fillRect(430,400,40,20);
        g.fillRect(430,430,40,20);
        g.fillRect(460,400,20,50);
        
        g.fillRect(490,400,20,100);
        g.fillRect(500,400,40,20);
        g.fillRect(500,480,40,20);
        
        g.fillRect(550,400,60,20);
        g.fillRect(550,400,20,50);
        g.fillRect(550,480,60,20);
        g.fillRect(590,450,20,50);
        g.fillRect(550,440,60,20);

        // DRAW PACMEN FLOWER
        g.fillArc(650,200,100,100,90,270);
        g.fillArc(650,295,100,100,0,270);
        g.fillArc(555,200,100,100,180,270);
        g.fillArc(555,295,100,100,270,270);


    }

    
    public static void main(String[] args){
          JFrame frame = new JFrame("GraphicsLab01");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setBounds(100, 100, 800, 600);
          frame.setContentPane(new GraphicsLab01());
          frame.setVisible(true);

          
        
    }
}

