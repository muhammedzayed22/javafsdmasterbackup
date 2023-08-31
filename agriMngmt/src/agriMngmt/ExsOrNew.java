package agriMngmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ExsOrNew extends JFrame {
	FrontPage f = new FrontPage();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExsOrNew frame = new ExsOrNew();
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
	public ExsOrNew() throws SQLException  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton LoginB = new JRadioButton("Sign In");
		LoginB.setBounds(139, 49, 111, 23);
		contentPane.add(LoginB);
		
		JRadioButton SignUp = new JRadioButton("Sign Up");
		SignUp.setBounds(139, 123, 111, 23);
		contentPane.add(SignUp);
		
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(LoginB);
		b1.add(SignUp);

		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
//					System.out.print(FrontPage.f);
//					System.out.println(FrontPage.c);
					if (LoginB.isSelected()) {
//						if (FrontPage.f==1) {
						FarmerLogin f1 = new FarmerLogin();
						f1.setVisible(true);
//						else if (FrontPage.c==1){
//							CustomerLogin f1 = new CustomerLogin();
//							f1.setVisible(true);
//						}
					}
					else {
//						if(FrontPage.f==1) {
							FarmerSignUp f2 = new FarmerSignUp();
							f2.setVisible(true);
//						}
//						else if(FrontPage.c==1) {
//							CustomerSignUp f2 = new CustomerSignUp();
//							f2.setVisible(true);
//						}
						
					}
					
					dispose();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(152, 197, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(337, 229, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
	}
}
