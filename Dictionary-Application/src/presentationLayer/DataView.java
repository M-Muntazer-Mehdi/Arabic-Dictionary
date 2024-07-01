package presentationLayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import businessLayer.BL;
import word.Word;
import javax.swing.JTextField;

public class DataView extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTable table;
    private ArrayList<Word> meaning = new ArrayList<Word>();
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private String [] column = new String[11];
	private String []col  = new String [11];
	BL bl = new BL();
	private JTextField sample;
	private JTextField id;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public void call(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataView frame = new DataView();
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
	public DataView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DICTINORY");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setBounds(222, 11, 124, 26);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Click to Edit/Update");
		lblNewLabel_1.setBounds(235, 33, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		}
		});
		scrollPane.setBounds(10, 58, 630, 290);
		contentPane.add(scrollPane);
		
		
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setForeground(Color.black);
		table.setFont(new Font("Time New Roman", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		
		JTableHeader table_header = table.getTableHeader();
		table_header.setBackground(Color.DARK_GRAY);
		table_header.setForeground(Color.white);
		table_header.setFont(new Font("Time New Roman", Font.BOLD, 15));
		
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
DefaultTableModel model = (DefaultTableModel)table.getModel();
				
				int selectedRowIndex = table.getSelectedRow();
				sample.setText(model.getValueAt(selectedRowIndex, 10).toString());
				id.setText(model.getValueAt(selectedRowIndex, 0).toString());
				sample.setVisible(false);
				id.setVisible(false);
				
				BL b = new BL();
                   ResultSet rs1 = null, rs = null; 
				
				try {
					rs = b.Find_search_root(sample.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				try
				{
					while(rs.next())
					{
						String r =rs.getString("جڑ");
						String[] arr = r.split(",");
						for (int i = 0; i<arr.length; i++)
						{
							comboBox.addItem(arr[i]);
						}
					}
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				
				
			}
			
			
		});
		
		
		btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setBounds(100, 100, 800, 400);
				
			    String str = comboBox.getSelectedItem().toString();
				//String str1 = comboBox.getSelectedItem().toString();
			    
				//System.out.print(str1);
				BL b = new BL();
				ResultSet rs = null; 
				
				try {
					//System.out.print("str"+ str);
					b.addUpdate(str,id.getText());
				    //sample.setText(rs.getString("رقم"));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			
				
			}
		});
		btnNewButton.setBounds(222, 359, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome obj = new Welcome();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 359, 89, 23);
		contentPane.add(btnNewButton_1);
		
		sample = new JTextField();
		sample.setBounds(398, 30, 86, 20);
		contentPane.add(sample);
		sample.setColumns(10);
		sample.setVisible(false);
		
		id = new JTextField();
		id.setColumns(10);
		id.setVisible(false);
		id.setBounds(481, 30, 86, 20);
		contentPane.add(id);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 35));
		comboBox.setBounds(659, 106, 198, 40);
		contentPane.add(comboBox);
		
		

		 DefaultTableModel model = (DefaultTableModel) table.getModel();
		 
	     
	     meaning = bl.wordArr();
	  
	     column[0] = "id";
	     column[1] = "رقم";
	     column[2] = "مشكول";
	     column[3] = "صنف";
	     column[4] = "أصل";
	     column[5] = "جنس";
	     column[6] = "عدد	";
	     column[7] = "غیرمشكول";
	     column[8] = "غیرأصل";
	     column[9] = "معنی";
	     column[10] = "جڑ";
	     
	     model.setColumnIdentifiers(column);
	     
	     
	     for (int i=0;i<meaning.size();i++) {
			col[0] = meaning.get(i).getId();
			col[1] = meaning.get(i).getRakam();
			col[2] = meaning.get(i).getMashkool();	
			col[3] = meaning.get(i).getSinf();
			col[4] = meaning.get(i).getAsal();
			col[5] = meaning.get(i).getJins();
			col[6] = meaning.get(i).getAdad();
			col[7] = meaning.get(i).getGhairMashkool();
			col[8] = meaning.get(i).getGhairAsal();
			col[9] = meaning.get(i).getMeaning();
			col[10] = meaning.get(i).getJarh();
			
			model.addRow(col);
			table.getColumnModel().getColumn(10);
			}
		
			model.addRow(col);
			
			//comboBox.addItem(col[10] = meaning.get(i).getJarh());
			
			
			
			//comboBox.setRenderer(new customComboBoxRenderer());
			table.getColumnModel().getColumn(10);
			
			
			
			//table.getColumnModel().getColumn(10);
			
			//break;
			}	    
	    
	
	}

