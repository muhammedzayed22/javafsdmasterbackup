package agriMngmt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class FarmerPage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmerPage frame = new FarmerPage();
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
	public FarmerPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		String[][] data = {
//				{ "Kundan Kumar Jha", "4031", "CSE" , "A" },
//				{ "Anand Jha", "6014", "IT" ,"B" }
//			};
//
//			// Column Names
//			String[] columnNames = { "Name", "Roll Number", "Department", "Section"};
//		
//		table = new JTable(data,columnNames);
//		table.setToolTipText("Table");
//		table.setCellSelectionEnabled(true);
//		table.setColumnSelectionAllowed(true);
//		table.setBounds(30, 40, 502, 320);
//		contentPane.add(table);
//		
//		JScrollPane sp = new JScrollPane(table);
//		getContentPane().add(sp);
//		setSize(1004, 595);
		
	}

}
