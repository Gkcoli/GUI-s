import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DiscountSystemPractice {

	private JFrame frmDiscountSystem;
	private JTextField txtIDNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtTuitionFee;
	private JTextField txtMiscellaneousFee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscountSystemPractice window = new DiscountSystemPractice();
					window.frmDiscountSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiscountSystemPractice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[][] feesPerCourse = {{null, null}, 
				{"10000.00", "22500.00"}, 
				{"15600.00", "15000.00"}, 
				{"25000.00", "23000.00"}, 
				{"30000.00", "25000.00"}, 
				{"20000.00", "25000.00"}};
		frmDiscountSystem = new JFrame();
		frmDiscountSystem.setTitle("Honorato National School - Online Enrolment");
		frmDiscountSystem.setFont(new Font("Open Sans", Font.PLAIN, 16));
		frmDiscountSystem.setBounds(100, 100, 800, 600);
		frmDiscountSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiscountSystem.getContentPane().setLayout(null);
		
		JLabel lblidNumber = new JLabel("ID Number");
		lblidNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblidNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidNumber.setBounds(142, 57, 130, 21);
		frmDiscountSystem.getContentPane().add(lblidNumber);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(142, 128, 130, 21);
		frmDiscountSystem.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(142, 199, 130, 21);
		frmDiscountSystem.getContentPane().add(lblLastName);
		
		JLabel lblStudentType = new JLabel("Student Type");
		lblStudentType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentType.setBounds(142, 270, 130, 21);
		frmDiscountSystem.getContentPane().add(lblStudentType);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCourseName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCourseName.setBounds(142, 341, 130, 21);
		frmDiscountSystem.getContentPane().add(lblCourseName);
		
		JLabel lblTuitionFee = new JLabel("Tuition Fee");
		lblTuitionFee.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTuitionFee.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTuitionFee.setBounds(142, 412, 130, 21);
		frmDiscountSystem.getContentPane().add(lblTuitionFee);
		
		JLabel lblMiscellaneous = new JLabel("Miscellaneous");
		lblMiscellaneous.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMiscellaneous.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiscellaneous.setBounds(142, 483, 130, 21);
		frmDiscountSystem.getContentPane().add(lblMiscellaneous);
		
		JLabel lblTitle = new JLabel("HONORATO NATIONAL SCHOOL");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitle.setBounds(252, 11, 267, 14);
		frmDiscountSystem.getContentPane().add(lblTitle);
		
		txtIDNumber = new JTextField();
		txtIDNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIDNumber.setBounds(294, 57, 243, 20);
		frmDiscountSystem.getContentPane().add(txtIDNumber);
		txtIDNumber.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFirstName.setBounds(294, 128, 243, 20);
		frmDiscountSystem.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLastName.setBounds(294, 199, 243, 20);
		frmDiscountSystem.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtTuitionFee = new JTextField();
		txtTuitionFee.setEditable(false);
		txtTuitionFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTuitionFee.setBounds(294, 412, 243, 20);
		frmDiscountSystem.getContentPane().add(txtTuitionFee);
		txtTuitionFee.setColumns(10);
		
		txtMiscellaneousFee = new JTextField();
		txtMiscellaneousFee.setEditable(false);
		txtMiscellaneousFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMiscellaneousFee.setBounds(294, 483, 243, 20);
		frmDiscountSystem.getContentPane().add(txtMiscellaneousFee);
		txtMiscellaneousFee.setColumns(10);
		
		JComboBox cmbStudentType = new JComboBox();
		cmbStudentType.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cmbStudentType.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cmbStudentType.setBackground(Color.WHITE);
			}
		});
		
		cmbStudentType.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbStudentType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cmbStudentType.setModel(new DefaultComboBoxModel(new String[] {"- Select Student Type -", "GOLD", "WHITE", "BLUE", "WALK-IN", "CONTINUING"}));
		cmbStudentType.setSelectedIndex(0);
		cmbStudentType.setBounds(294, 269, 243, 22);
		frmDiscountSystem.getContentPane().add(cmbStudentType);
		
		JComboBox cmbCourseName = new JComboBox();
		cmbCourseName.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				txtTuitionFee.setText(feesPerCourse[cmbCourseName.getSelectedIndex()][0]);
				txtMiscellaneousFee.setText(feesPerCourse[cmbCourseName.getSelectedIndex()][1]);
			}
		});
		cmbCourseName.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbCourseName.setModel(new DefaultComboBoxModel(new String[] {"- Select Course Name -", "TOURISM", "NURSING", "ARCHITECTURE", "ENGINEERING", "COMPUTER SCIENCE"}));
		cmbCourseName.setSelectedIndex(0);
		cmbCourseName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cmbCourseName.setBounds(294, 340, 243, 22);
		frmDiscountSystem.getContentPane().add(cmbCourseName);
		
		JButton btnNewButton = new JButton("COMPUTE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtIDNumber.getText().trim().length() == 0 || txtFirstName.getText().trim().length() == 0 || txtLastName.getText().trim().length() == 0)
					JOptionPane.showMessageDialog(frmDiscountSystem, "Fill empty fields", "Empty Fields Detected", JOptionPane.INFORMATION_MESSAGE);
				if(cmbCourseName.getSelectedIndex() == 0 || cmbStudentType.getSelectedIndex() == 0)
					JOptionPane.showMessageDialog(frmDiscountSystem, "Please select your course/student type", "Unselected Fields Detected", JOptionPane.INFORMATION_MESSAGE);
				else {
					double tuitionFee = Double.parseDouble(txtTuitionFee.getText());
					double miscellaneousFee = Double.parseDouble(txtMiscellaneousFee.getText());
					double discount = 0;
					double total = 0;
					switch(cmbStudentType.getSelectedItem().toString()) {
						case "GOLD":
							discount = 0.5;
							break;
						case "WHITE":
							discount = 0.3;
							break;
						case "BLUE":
						case "CONTINUING":
							discount = 0.1;
					}
					if(cmbStudentType.getSelectedItem().toString() == "CONTINUING")
						total = tuitionFee * (1 - discount) + miscellaneousFee;
					else
						total = (tuitionFee + miscellaneousFee) * (1 - discount);
					
					JOptionPane.showMessageDialog(frmDiscountSystem, "Tuition (Computed): PHP " + String.format("%.2f", total), "Breakdown of Fees", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(592, 223, 109, 23);
		frmDiscountSystem.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIDNumber.setText(null);
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtTuitionFee.setText(null);
				txtMiscellaneousFee.setText(null);
				cmbStudentType.setSelectedIndex(0);
				cmbCourseName.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(592, 294, 109, 23);
		frmDiscountSystem.getContentPane().add(btnNewButton_1);
	}
}
