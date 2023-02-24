import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


	public class App {
	    public static void main(String[] args) throws Exception {
	    	ImageIcon image = new ImageIcon("C:\\Users\\Ryujin\\Downloads\\itzy.png");
	        Border border = BorderFactory.createLineBorder(new Color(0xFFFDD0));

	        JLabel label = new JLabel();
	        label.setText("YEJI, LIA, RYUJIN, CHAERYEONG, YUNA");
	        label.setIcon(image);
	        label.setHorizontalTextPosition(JLabel.CENTER);
	        label.setVerticalTextPosition(JLabel.TOP);
	        label.setForeground(Color.black);
	        label.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,25));
	        label.setBackground(new Color(0xFFD1DC));
	        label.setOpaque(true);
	        label.setBorder(border);
	        label.setVerticalAlignment(JLabel.CENTER);
	        label.setHorizontalAlignment(JLabel.CENTER);
	        

	        ImageIcon image2 = new ImageIcon("7bc503ac695137150a4951e7265892bc.png");

	        JFrame frame = new JFrame();
	        frame.setIconImage(image2.getImage());
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(500,500);
	        frame.setVisible(true);
	        frame.add(label);
	    	
	    }
	    
	    }

	    

