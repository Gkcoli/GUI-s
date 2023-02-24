package kaka;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



	public class App {
	    public static void main(String[] args) throws Exception {
	    	
	    	JFrame frame = new JFrame();
	    	frame.setTitle("Frame Na Ewan");
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	frame.setResizable(false);
	    	frame.setSize(420,420);
	    	frame.setVisible(true);
	    	
	    	ImageIcon image = new ImageIcon("skullpng.parspng.com-6.png");
	    	frame.setIconImage(image.getImage());
	    	frame.getContentPane().setBackground(Color.black);
	    	 	
	    }
	    
	   }

	    
	    
