import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Paint extends Canvas {
		javax.swing.JFrame frame;
		int width=400;
		int height=300;
		int x=180;
		int y=180;
		public Paint(){
			Dimension dim = new Dimension(width, height);
			setPreferredSize(dim);
			frame= new JFrame("Rita");
			frame.add(this);
			frame.addKeyListener(new MyKeyListener());
			frame.pack();
			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.setVisible(true);
	}	
	
		public void paint(Graphics g){
		
		g.setColor(Color.GREEN);
		g.fillRect(20,40,240,250);
		g.setColor(Color.RED);
		g.fillRect(90, 175, 100, 100);
		g.setColor(Color.BLACK);
		
			 int xpoints[] = {222, 52, 142};
			 int ypoints[] = {x, y, 120};
			 int npoints = 3;
			 
			 g.fillPolygon (xpoints, ypoints, npoints);
		}
			 public static void main(String[] args) {
			        Paint mittPRG = new Paint();
	}	 	
 
 
 private class MyKeyListener extends KeyAdapter {

     public void keyPressed(KeyEvent e) {
         if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        	 x--;
        	 repaint();
         }
         else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        	 x++;
        	 repaint();
         }
         else if (e.getKeyCode() == KeyEvent.VK_UP) {
        	 y--;
        	 repaint();
         }
         else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
        	 y++;
        	 repaint();
         }
         
     }
 }
public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
   	 y++;
   	 repaint();
    }
    
}
}