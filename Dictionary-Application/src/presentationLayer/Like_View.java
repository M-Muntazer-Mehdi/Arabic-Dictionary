package presentationLayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.w3c.dom.Text;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import businessLayer.BL;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Like_View extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;

	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Like_View frame = new Like_View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Like_View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton Search = new JButton("Search");
		Search.setBounds(40, 47, 214, 32);
		Search.setFont(new Font("Times New Roman", Font.BOLD, 26));
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					BL b = new BL();
				ResultSet rs = null; 
				rs = b.Find_like_view(textField.getText());
				
				ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0;i<cols;i++)
					colName[i] = rsmd.getColumnName(i+1);
				model.setColumnIdentifiers(colName);
				String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11;
				while(rs.next())
				{
					a1 = rs.getString(1);
					a2 = rs.getString(2);
					a3 = rs.getString(3);
					a4 = rs.getString(4);
					a5 = rs.getString(5);
					a6 = rs.getString(6);
					a7 = rs.getString(7);
					a8 = rs.getString(8);
					a9 = rs.getString(9);
					a10 = rs.getString(10);
					a11 = rs.getString(11);
					String[] row = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11};
					model.addRow(row);
				}
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
		
		btnNewButton = new JButton("←");
		btnNewButton.setBounds(10, 7, 65, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Search_View S = new Search_View();
				S.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnNewButton.setBackground(Color.DARK_GRAY);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Fast Dictionary");
		lblNewLabel_1.setBounds(193, 8, 184, 27);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		contentPane.add(Search);
		
		textField = new JTextField();
		textField.setBounds(264, 46, 259, 30);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 23));
		contentPane.add(textField);
		textField.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 545, 220);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setBackground(Color.LIGHT_GRAY);
		table_1.setForeground(Color.black);
		table_1.setFont(new Font("Time New Roman", Font.PLAIN, 12));
		scrollPane.setViewportView(table_1);
		
		JTableHeader table_header = table_1.getTableHeader();
		table_header.setBackground(Color.DARK_GRAY);
		table_header.setForeground(Color.white);
		table_header.setFont(new Font("Time New Roman", Font.BOLD, 15));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 578, 321);
		lblNewLabel.setIcon(new ImageIcon(Like_View.class.getResource("/images/images2.png")));
		
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(98, 19, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
