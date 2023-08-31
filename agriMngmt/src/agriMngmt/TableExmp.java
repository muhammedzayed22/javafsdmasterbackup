package agriMngmt;

/*import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

 

import com.mysql.cj.xdevapi.Statement;

 

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;

 

public class Stock_management extends JFrame {

 

    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    Stock_management frame = new Stock_management();
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
    /*public Stock_management() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 620, 417);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

 

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(30, 46, 364, 188);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        table.setRowHeight(50);
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
            },
            new String[] {
                "S.No", "Product Name", "Availability"
            }
        ));

        JButton btnNewButton = new JButton("Manage");
        btnNewButton.setBounds(410, 313, 89, 23);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel = new JLabel("STOCK STATUS");
        lblNewLabel.setBounds(92, 21, 197, 14);
        contentPane.add(lblNewLabel);
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_login", "root", "root");
        DefaultTableModel dt= (DefaultTableModel) table.getModel();
        //Connection con = customer_login.getCon();

 

        Statement st = (Statement) connection.createStatement();

 

        ResultSet rs = ((java.sql.Statement) st).executeQuery("select * from warehouse");

 

        while(rs.next())

 

        {

 

        dt.addRow(new Object[] { rs.getString(1),rs.getString(2),rs.getString(3)});

 

        //sno++;
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

 

        
    }
}*/

 

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

 

public class TableExmp extends JFrame {
  public TableExmp() throws Exception {
    ArrayList columnNames = new ArrayList();
    ArrayList data = new ArrayList();
    String url = "jdbc:mysql://localhost:3306/login_creds";
    String userid = "root";
    String password = "root";
    String sql = "SELECT * FROM Farmer_SignUp";

    Connection connection = DriverManager.getConnection(url, userid, password);
    Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    ResultSetMetaData md = rs.getMetaData();
    int columns = md.getColumnCount();
    for (int i = 1; i <= columns; i++) {
      columnNames.add(md.getColumnName(i));
    }
    while (rs.next()) {
      ArrayList row = new ArrayList(columns);
      for (int i = 1; i <= columns; i++) {
        row.add(rs.getObject(i));
      }
      data.add(row);
    }


    Vector columnNamesVector = new Vector();


 

    Vector dataVector = new Vector();
    for (int i = 0; i < data.size(); i++) {
      ArrayList subArray = (ArrayList) data.get(i);
      Vector subVector = new Vector();
      for (int j = 0; j < subArray.size(); j++) {
        subVector.add(subArray.get(j));
      }
      dataVector.add(subVector);
    }
    for (int i = 0; i < columnNames.size(); i++)
      columnNamesVector.add(columnNames.get(i));
    JTable table = new JTable(dataVector, columnNamesVector) {

      public Class getColumnClass(int column) {
          /*table.setRowHeight(20);

            table.setRowHeight(2,50);*/
        for (int row = 0; row < getRowCount(); row++) {
          Object o = getValueAt(row, column);
          if (o != null) {
            return o.getClass();
          }
        }

        return Object.class;
        //column.setPreferredWidth(150);


      }
    };
    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane);
    JPanel buttonPanel = new JPanel();
    getContentPane().add(buttonPanel, BorderLayout.SOUTH);

    JButton btnNewButton_1 = new JButton("Manage");
    btnNewButton_1.setBackground(Color.GRAY);
    btnNewButton_1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        }
    });
    buttonPanel.add(btnNewButton_1);

    JLabel lblNewLabel = new JLabel("New label");
    getContentPane().add(lblNewLabel, BorderLayout.NORTH);
  }
  public static void main(String[] args) throws Exception {
    TableExmp frame = new TableExmp();
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(600, 600);
    frame.setVisible(true);
  }
}