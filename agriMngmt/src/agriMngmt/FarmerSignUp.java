package agriMngmt;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextArea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JPasswordField;


public class FarmerSignUp extends JFrame {
	
	 private static Connection conn = null;
	
	{
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        

        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_creds", "root", "root");
		
//		FarmerSignUp frame = new FarmerSignUp();
//		frame.setVisible(true);
		 
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	JFrame f;
	UserPage e1 = new UserPage();
//    private static Connection conn = null;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static List<List<String>> details = new ArrayList<>();
	static List<String> det;
	static String name,email,username,password,address,phnum1,area1,passconf;
	static int phnNum,area;
	private JButton btnNewButton;
	static PreparedStatement preparedstatement_FarmOwner,preparedstatement_FarmWorker; 
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	/**
	 * Launch the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        

        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_creds", "root", "root");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					
					FarmerSignUp frame = new FarmerSignUp();
					frame.setVisible(true);
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FarmerSignUp()  throws SQLException {
        
        preparedstatement_FarmOwner = conn.prepareStatement("insert into farm_owner(owner_Name,phn_num,farm_address,farm_area_in_sqm,owner_email,owner_username,owner_password) values(?,?,?,?,?,?,?)");
        preparedstatement_FarmWorker = conn.prepareStatement("insert into farm_worker(Name,phoneNum,Email,Username,password) values(?,?,?,?,?)");
        
		det = new ArrayList<>();
		f = new JFrame();
		f.setTitle("Sign Up Page");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(226, 33, 168, 56);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textField.getText();
				det.add(name);
//				System.out.println(det);
				try {
					if (UserPage.fo==1)
						preparedstatement_FarmOwner.setString(1, name);
					else if (UserPage.fw==1)
						preparedstatement_FarmWorker.setString(1, name);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textField_6.requestFocusInWindow();
			}
		});
		textField.setBounds(167, 100, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email = textField_1.getText();
				det.add(email);
				try {
					if (UserPage.fo==1)
						preparedstatement_FarmOwner.setString(5, email);
					else if (UserPage.fw==1)
						preparedstatement_FarmWorker.setString(3, email);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				System.out.println(det);
			    textField_2.requestFocusInWindow();
			}
		});
		textField_1.setBounds(167, 191, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = textField_2.getText();
				det.add(username);
				try {
					if (UserPage.fo==1)
						preparedstatement_FarmOwner.setString(6, username);
					else if (UserPage.fw==1)
						preparedstatement_FarmWorker.setString(4, username);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				System.out.println(det);
				passwordField_1.requestFocusInWindow();
			}
		});
		textField_2.setBounds(167, 235, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(79, 100, 78, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(41, 194, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("USERNAME");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setBounds(19, 238, 138, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CREATE PASSWORD");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setBounds(24, 286, 133, 14);
		contentPane.add(lblNewLabel_4);
		
		btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserPage.fo=0;
				UserPage.fw=0;
				e1.setVisible(true);
				dispose();
				
			}
		});
	
		btnNewButton.setBounds(453, 422, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area1 = textField_4.getText();
				area = Integer.parseInt(area1);
				try {
					preparedstatement_FarmOwner.setLong(4, area);
					textField_1.requestFocusInWindow();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		textField_4.setBounds(432, 191, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				address = textField_5.getText();
				try {
					preparedstatement_FarmOwner.setString(3, address);
					textField_4.requestFocusInWindow();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		textField_5.setBounds(432, 100, 168, 49);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
//		textField_5.setVisible(false);
//		textField_4.setVisible(false);
//		System.out.println(UserPage.fo+" fo1");
//		System.out.println(UserPage.fw+"fw1");
		
		
		
		textField_6 = new JTextField();
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phnum1 = textField_6.getText();
				phnNum = Integer.parseInt(phnum1);
				try {
					if (UserPage.fo==1) {
						preparedstatement_FarmOwner.setLong(2, phnNum);
						textField_5.requestFocusInWindow();
					}
					else if(UserPage.fw==1) {
						preparedstatement_FarmWorker.setLong(2, phnNum);
						textField_1.requestFocusInWindow();
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		textField_6.setBounds(167, 145, 96, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("FARM AREA IN SQM.");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setBounds(289, 194, 133, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ADDRESS");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setBounds(306, 117, 116, 14);
		contentPane.add(lblNewLabel_6);
		if (UserPage.fw==1) {
			textField_5.setVisible(false);
			textField_4.setVisible(false);
			lblNewLabel_5.setVisible(false);
			lblNewLabel_6.setVisible(false);
		}
		
		JLabel lblNewLabel_7 = new JLabel("PHONE NO.");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setBounds(60, 148, 96, 14);
		contentPane.add(lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] pcf = passwordField.getPassword();
				
				for(char i :pcf){
					passconf+=i;
				}
				try {
					if (password==passconf) {
						if (UserPage.fo==1) {
							preparedstatement_FarmOwner.setString(7, passconf);
							preparedstatement_FarmOwner.executeUpdate();
						}
						else if(UserPage.fw==1) {
							preparedstatement_FarmWorker.setString(5, passconf);
							preparedstatement_FarmWorker.executeUpdate();
						}
						JOptionPane.showMessageDialog(null, "Sign Up Complete");
//						if ()
					}
					else {
						JOptionPane.showMessageDialog(null, "Password doesn't match");
						passwordField.requestFocusInWindow();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		passwordField.setBounds(167, 332, 96, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4_1 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4_1.setBounds(24, 335, 133, 14);
		contentPane.add(lblNewLabel_4_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] psw = passwordField_1.getPassword();
				
				for(char i :psw){
					password+=i;
				}
				System.out.println(password);
				passwordField.requestFocusInWindow();
//				try {
//					if (UserPage.fo==1) {
//						preparedstatement_FarmOwner.setString(4, password);
////						preparedstatement_FarmOwner.executeUpdate();
//					}
//					else if (UserPage.fw==1) {
//						preparedstatement_FarmWorker.setString(4, password);
////						preparedstatement_FarmWorker.executeUpdate();
//					}
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}
		});
		passwordField_1.setBounds(167, 283, 96, 20);
		contentPane.add(passwordField_1);
		
		
		
	}
}
