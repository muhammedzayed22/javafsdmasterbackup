package agriMngmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class FrontPage extends JFrame {
	static int fo=0,c=0,a=0;
	private JPanel contentPane;
//	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage frame = new FrontPage();
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
	public FrontPage() throws SQLException  {
//		f=0;c=0;a=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1291, 685);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setExtendedState(MAXIMIZED_BOTH);

		setContentPane(contentPane);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(816, 471, 89, 23);
		btnNewButton_2.setBackground(SystemColor.inactiveCaption);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2);
		
		String country[]={"-Select-","Owner","Worker"};        
		JComboBox comboBox_1 = new JComboBox(country);
		comboBox_1.setBounds(706, 182, 100, 22);
		contentPane.add(comboBox_1);
		
		comboBox_1.setVisible(false);
		
		  ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
	            @Override
	            public void actionPerformed(ActionEvent e) {

	                String s = (String) comboBox_1.getSelectedItem();//get the selected item

	                switch (s) {//check for a match
	                    case "Owner":
						try {
							fo=1;
							ExsOrNew e1;
							e1 = new ExsOrNew();
							e1.setVisible(true);
							dispose();
							break;
						} catch (SQLException e21) {
							
							e21.printStackTrace();
						}						
	                    case "Worker":
	                    	try {
	        					c=1;
//	        					LogOrSignCus l1 = new LogOrSignCus();
//	        					l1.setVisible(true);
	        					ExsOrNew e1 = new ExsOrNew();
	        					e1.setVisible(true);
	        					dispose();
	        				}
	        				catch(Exception e2) {
	        					e2.printStackTrace();
	        				}
	                        break;
	              
	                }
	            }
	        };

	        comboBox_1.addActionListener(cbActionListener);
		
		JButton btnNewButton = new JButton("Farmer");
		btnNewButton.setBounds(528, 168, 122, 49);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
//				try {
//					f=1;
//					ExsOrNew e1 = new ExsOrNew();
//					e1.setVisible(true);
//					
//					dispose();
//				}
//				catch(Exception e2) {
//					e2.printStackTrace();
//				}
//				if (btnNewButton.isSelected()) {
					
					comboBox_1.setVisible(true);
//				String country[]={"-Select-","Owner","Worker"};        
//				JComboBox comboBox_1 = new JComboBox(country);
//				comboBox_1.setBounds(706, 182, 100, 22);
//				contentPane.add(comboBox_1);
//				
//				  ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
//			            @Override
//			            public void actionPerformed(ActionEvent e) {
//
//			                String s = (String) comboBox_1.getSelectedItem();//get the selected item
//
//			                switch (s) {//check for a match
//			                    case "Owner":
//								try {
//									f=1;
//									ExsOrNew e1;
//									e1 = new ExsOrNew();
//									e1.setVisible(true);
//									dispose();
//									break;
//								} catch (SQLException e21) {
//									
//									e21.printStackTrace();
//								}						
//			                    case "Worker":
//			                    	try {
//			        					c=1;
//			        					
//			        					ExsOrNew e1 = new ExsOrNew();
//			        					e1.setVisible(true);
//			        					dispose();
//			        				}
//			        				catch(Exception e2) {
//			        					e2.printStackTrace();
//			        				}
//			                        break;
//			              
//			                }
//			            }
//			        };
//
//			        comboBox_1.addActionListener(cbActionListener);
//				}
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Customer");
		btnNewButton_1.setBounds(528, 239, 122, 49);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					c=1;
//					LogOrSignCus l1 = new LogOrSignCus();
//					l1.setVisible(true);
					ExsOrNew e1 = new ExsOrNew();
					e1.setVisible(true);
					dispose();
				}
				catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBackground(SystemColor.inactiveCaption);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Admin");
		btnNewButton_3.setBounds(528, 395, 122, 49);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					a=1;
					Admin e1 = new Admin();
					e1.setVisible(true);
					dispose();
				}
				catch(Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBackground(SystemColor.inactiveCaption);
		contentPane.add(btnNewButton_3);
		
		JList list = new JList();
		list.setBounds(808, 257, -124, -111);
		contentPane.add(list);
		
		JButton btnNewButton_4 = new JButton("Retailer");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(528, 313, 122, 49);
		contentPane.add(btnNewButton_4);
		
//		JComboBox comboBox = new JComboBox();
//		comboBox.setBounds(581, 191, 30, 22);
//		contentPane.add(comboBox);
		
		 
		  
		
		
		
		
	}
	@SuppressWarnings("unused")
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
