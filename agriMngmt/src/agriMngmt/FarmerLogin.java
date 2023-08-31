package agriMngmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;

public class FarmerLogin extends JFrame {
	ExsOrNew e1 = new ExsOrNew();
	private static Connection conn = null;
	static PreparedStatement preparedstatement1,preparedstatement2,preparedstatement3; 
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_creds", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	static String a;
	static int b,c;
	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(Object object) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//        
//
//		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_creds", "root", "root");
		try {
			
			System.out.println("yes");
		}
		catch(Exception e)
		{	
			e.printStackTrace();
			
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					
					FarmerLogin frame = new FarmerLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public FarmerLogin() throws SQLException {
		
		a=new String();
		
		
        preparedstatement1 = conn.prepareStatement("select FarmerPassword from Farmer_SignUp where FarmerUsername = ?");
        preparedstatement2 = conn.prepareStatement("SELECT COUNT(*) FROM Farmer_SignUp WHERE Farmer_SignUp.FarmerUsername = ?");
        preparedstatement3 = conn.prepareStatement("select FarmerUsername from Farmer_SignUp where FarmerUsername = ?");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				 && a.equals(preparedstatement3.executeQuery(a))
				try {
					char[] psw = passwordField.getPassword();
					String psw1 = "";
					System.out.print(psw1);
					for(char i :psw){
						psw1+=i;
					}
					while(true) {

						preparedstatement1.setString(1, a);
						ResultSet rs1 = preparedstatement1.executeQuery();
						System.out.println(rs1+" password");
						String PassCheck="";
						if(rs1.next())
						{
							PassCheck = rs1.getString(1);
							System.out.println(rs1.getString(1)+"Ps2");
						}
						System.out.println(PassCheck);
						if(psw1.equals(PassCheck)){
							JOptionPane.showMessageDialog(null, "Login Succesfull");
							break;
						}
						else {
							
							JOptionPane.showMessageDialog(null, "Incorrect Password");
							passwordField.requestFocusInWindow();
							break;
						}
					}
				}
				catch (HeadlessException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		passwordField.setAction(null);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(409, 304, 141, 51);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(904, 35, 108, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("FARMER LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(370, 47, 207, 57);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ENTER PASSWORD   ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(178, 288, 221, 78);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				e1.setVisible(true);;
				dispose();
			}
		});
		btnNewButton_1.setBounds(428, 441, 108, 39);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("USERNAME   ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(267, 207, 134, 39);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
//				preparedstatement2.getResultSet();
				
				try {
				
					a=textField.getText();
				while(true) {
					
//					for(int i=0;i<FarmerSignUp.details.size();i++) {
//						if(FarmerSignUp.details.get(i).contains(a)) {
//							b=i;
//							c++;
//							break;
//						}
//						
//					}
					 
						preparedstatement2.setString(1, a);
					  ResultSet rs = preparedstatement2.executeQuery();
					  System.out.println(rs+" username");
					  int checker=0;
					  if(rs.next())
						 checker = rs.getInt(1);
						
					  if (checker==1) {
							JOptionPane.showMessageDialog(null, "Username valid");
							passwordField.requestFocusInWindow();
							break;
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Username Invalid");
							textField.requestFocusInWindow();
							break;
						}
					} 
				}
				catch (HeadlessException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		textField.setBounds(409, 207, 141, 51);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
