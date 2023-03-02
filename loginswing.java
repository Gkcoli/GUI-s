package logiiin;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class wegoo {

	private JFrame Login;
	private JTextField txtuserName;
	private JPasswordField passField;
    private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wegoo window = new wegoo();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wegoo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
        ImageIcon image = new ImageIcon("C:\\Users\\Ryujin\\Downloads\\login.png");
		
		Login = new JFrame();
		Login.getContentPane().setBackground(Color.LIGHT_GRAY);
		Login.setTitle("Login Module");
		Login.setIconImage(image.getImage());
		Login.setBounds(100, 100, 450, 300);
		Login.setVisible(true);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.getContentPane().setLayout(null);
		
		JLabel lbluserName = new JLabel("Username");
		lbluserName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbluserName.setBounds(10, 79, 81, 14);
		Login.getContentPane().add(lbluserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(10, 134, 75, 14);
		Login.getContentPane().add(lblPassword);
		
		txtuserName = new JTextField();
		txtuserName.setBounds(101, 76, 115, 20);
		Login.getContentPane().add(txtuserName);
		txtuserName.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== btnLogin) {
					String userText;
					String pwdText;
					userText = txtuserName.getText();
					pwdText = passField.getText();
					if(userText.equalsIgnoreCase("Colee")&& pwdText.equalsIgnoreCase("Ryujin123")) {
						JOptionPane.showMessageDialog(btnLogin, "Login Successfully");
					}else {
						JOptionPane.showMessageDialog(btnLogin, "Invalid Username or Password");
					}
				}
			}
		});
		btnLogin.setBounds(101, 200, 89, 23);
		Login.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnReset) {
					txtuserName.setText("");
					passField.setText("");
				}
				
			}
		});
		btnReset.setBounds(201, 200, 89, 23);
		Login.getContentPane().add(btnReset);
		
		JCheckBox chckbxshowPassword = new JCheckBox("Show Password");
		chckbxshowPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxshowPassword.setBackground(Color.LIGHT_GRAY);
		chckbxshowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxshowPassword.isSelected()) {
					passField.setEchoChar((char)0);
				}else {
					passField.setEchoChar('*');
				}
			}
		});
		chckbxshowPassword.setBounds(101, 158, 131, 23);
		Login.getContentPane().add(chckbxshowPassword);
		
		passField = new JPasswordField();
		passField.setBounds(101, 131, 121, 20);
		Login.getContentPane().add(passField);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(131, 36, 85, 14);
		Login.getContentPane().add(lblNewLabel);
	}
}

