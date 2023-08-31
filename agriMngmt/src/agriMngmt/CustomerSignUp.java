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


public class CustomerSignUp extends JFrame {
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
	LogOrSignCus l1 = new LogOrSignCus();
    private static Connection conn = null;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	static List<List<String>> details = new ArrayList<>();
	static List<String> det;
	String name,email,username,password;
	private JButton btnNewButton;
	static PreparedStatement preparedstatement; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
			        

			        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_creds", "root", "root");
					
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
	public CustomerSignUp()  throws SQLException {
		
		String sql = "insert into Customer_SignUp(CustomerName,CustomerEmail,CustomerUsername,Customerpassword) values(?,?,?,?)";

        preparedstatement = conn.prepareStatement(sql);
		
		det = new ArrayList<>();
		f = new JFrame();
		f.setTitle("Sign Up Page");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1332, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER SIGN UP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(406, 56, 168, 56);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textField.getText();
				det.add(name);
//				System.out.println(det);
				try {
					preparedstatement.setString(1, name);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textField_1.requestFocusInWindow();
			}
		});
		textField.setBounds(425, 186, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email = textField_1.getText();
				det.add(email);
				try {
					preparedstatement.setString(2, email);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				System.out.println(det);
			    textField_2.requestFocusInWindow();
			}
		});
		textField_1.setBounds(425, 251, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = textField_2.getText();
				det.add(username);
				try {
					preparedstatement.setString(3, username);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				System.out.println(det);
				textField_3.requestFocusInWindow();
			}
		});
		textField_2.setBounds(425, 320, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				password = textField_3.getText();
				det.add(password);
				details.add(det);
				try {
					preparedstatement.setString(4, password);
					preparedstatement.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
//				System.out.println(det);
//				System.out.println(details);
//				if(password.length()>0)
				JOptionPane.showMessageDialog(null, "Sign Up Complete");
				det = new ArrayList<>();
			}
		});
		textField_3.setBounds(425, 376, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(326, 186, 78, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(296, 254, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("USERNAME");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setBounds(277, 323, 138, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CREATE PASSWORD");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setBounds(230, 379, 185, 14);
		contentPane.add(lblNewLabel_4);
		
		btnNewButton = new JButton("BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				l1.setVisible(true);;
				dispose();
				
			}
		});
	
		btnNewButton.setBounds(853, 452, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
	}
}
