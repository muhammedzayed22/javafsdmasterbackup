// Packages to import
package agriMngmt;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExamples {
	// frame
	JFrame f;
	// Table
	JTable j;

	// Constructor
	JTableExamples()
	{
		// Frame initialization
		f = new JFrame();

		// Frame Title
		f.setTitle("JTable Example");

		// Data to be displayed in the JTable
		String[][] data = {
			{ "Kundan Kumar Jha", "4031", "CSE" , "A" },
			{ "Anand Jha", "6014", "IT" ,"B" }
		};

		// Column Names
		String[] columnNames = { "Name", "Roll Number", "Department", "Section"};

		// Initializing the JTable
		j = new JTable(data, columnNames);
		j.setCellSelectionEnabled(true);
		j.setColumnSelectionAllowed(true);
		j.setBounds(30, 40, 200, 300);

		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(j);
		f.getContentPane().add(sp);
		// Frame Size
		f.setSize(604, 332);
		// Frame Visible = true
		f.setVisible(true);
	}

	// Driver method
	public static void main(String[] args)
	{
		new JTableExamples();
	}
}

