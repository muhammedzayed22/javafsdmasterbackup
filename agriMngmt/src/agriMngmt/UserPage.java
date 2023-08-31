package agriMngmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserPage extends JFrame {

	private JPanel contentPane;
	static int fo=0,fw=0,r=0,c=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage frame = new UserPage();
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
	public UserPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton FOwner = new JRadioButton("Farm Owner");
		FOwner.setBounds(177, 60, 111, 23);
		contentPane.add(FOwner);
		
		JRadioButton FWorker = new JRadioButton("Farm Worker");
		FWorker.setBounds(177, 114, 111, 23);
		contentPane.add(FWorker);
		
		JRadioButton RetailerS = new JRadioButton("Retailer");
		RetailerS.setBounds(177, 160, 111, 23);
		contentPane.add(RetailerS);
		
		JRadioButton CustomerS = new JRadioButton("Customer");
		CustomerS.setBounds(177, 209, 111, 23);
		contentPane.add(CustomerS);
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(FOwner);
		b1.add(FWorker);
		b1.add(RetailerS);
		b1.add(CustomerS);
		
		
		JButton sUP = new JButton("Sign up");
		sUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				FarmerSignUp f1;
				try {
					
					if (FOwner.isSelected()) {
						fo=1;
//						System.out.println(fo+" fo");
						f1 = new FarmerSignUp();
						f1.setVisible(true);
					}
					else if(FWorker.isSelected()) {
						fw=1;
//						System.out.println(fw+" fw");
						f1 = new FarmerSignUp();
						f1.setVisible(true);
					}
					else if (RetailerS.isSelected()) {
						r=1;
						
					}
					else {
						c=1;
						
					}
					
					
					dispose();
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		sUP.setBounds(73, 276, 89, 23);
		contentPane.add(sUP);
		
		JButton sIN = new JButton("Sign in");
		sIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FarmerLogin f2;
				try {
					f2 = new FarmerLogin();
					if (FOwner.isSelected()) {
						fo=1;
						f2.setVisible(true);
					}
					else if(FWorker.isSelected()) {
						fw=1;
						f2.setVisible(true);
					}
					else if (RetailerS.isSelected()) {
						r=1;
						f2.setVisible(true);
					}
					else {
						c=1;
						f2.setVisible(true);
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		sIN.setBounds(317, 276, 89, 23);
		contentPane.add(sIN);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LoginPage l1 = new LoginPage();
					l1.setVisible(true);
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton.setBounds(177, 326, 89, 23);
		contentPane.add(btnNewButton);
	}
}
