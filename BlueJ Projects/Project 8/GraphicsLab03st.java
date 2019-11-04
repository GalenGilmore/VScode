
import javax.swing.JFrame;
import javax.swing.JPanel;                                      
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;

public class GraphicsLab03st extends JPanel
{

    public void paintComponent(Graphics g)  
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
        
        // Draw Random Lines
        for(int i = 0; i < 100; i++){
            g.setColor(randColor());
            g.drawLine(randBetween(10,400),randBetween(10,300),randBetween(10,400),randBetween(10,300));
        }

        
        // Draw Random Squares
        for(int i = 0; i < 100; i++){
            g.setColor(randColor());
            g.fillRect(randBetween(400,740),randBetween(10,250),50,50);
        }
        
        
        // Draw Random Circles
        for(int i = 0; i < 100; i++){
            g.setColor(randColor());
            int Diameter = randBetween(0,200);
            int xCircleCoor = 400 - Diameter;
            int yCircleCoor = 580 - Diameter;
            g.drawOval(randBetween(10,xCircleCoor),randBetween(301,yCircleCoor),Diameter,Diameter);
        }
        
        int xCoordinate = 400;
        int circleWidth = 390;
        for(int i = 1; i < 20; i++){
            g.setColor(randColor());
            g.setColor(randColor());
            g.drawOval(xCoordinate, 300, circleWidth, 290);
            xCoordinate += 11;
            circleWidth -= 22;
        }
        
    
    }
    
    private int randBetween(int low, int high){
        return(int)(Math.random() * (high - low + 1)) + low;
    }
    
    private Color randColor(){
        int r = randBetween(0, 255);
        int g = randBetween(0, 255);
        int b = randBetween(0, 255);
        return new Color(r, g, b);
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Graphics Lab 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 850, 650);
        JPanel panel = new GraphicsLab03st();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}


 