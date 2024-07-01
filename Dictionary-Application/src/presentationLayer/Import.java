package presentationLayer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import businessLayer.BL;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Import extends JFrame {

	private JPanel contentPane;
	
	private JTextField textField;
	BL bl = new BL();
	private JTextField textField1;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Import frame = new Import();
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
	public Import() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnImport = new JButton("Import");
		btnImport.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnImport.setForeground(Color.WHITE);
		btnImport.setBackground(Color.DARK_GRAY);
		btnImport.setBorderPainted(false);
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bl.createDatabase();
					bl.createTable();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				
				if(e.getSource() == btnImport) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setMultiSelectionEnabled(true);
					fileChooser.setCurrentDirectory(new File("C:\\Users\\SOFTAGE\\Desktop"));
					int response = fileChooser.showSaveDialog(null);
					if(response == JFileChooser.APPROVE_OPTION) {
						File file [] = fileChooser.getSelectedFiles();
						try {
							for(int i=0;i<file.length;i++) {
								bl.displayFiles(file[i]);
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}	
				}
			}
		});
		btnImport.setBounds(58, 354, 117, 23);
		contentPane.add(btnImport);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		textField.setBackground(Color.DARK_GRAY);
		textField.setForeground(Color.WHITE);
		textField.setBounds(65, 170, 165, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		textField1.setBackground(Color.DARK_GRAY);
		textField1.setForeground(Color.WHITE);
		textField1.setBounds(24, 293, 152, 34);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		btnNewButton = new JButton("←");
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome obj = new Welcome();
				obj.show();
				dispose();
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(10, 11, 51, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Import.class.getResource("/images/image02.png")));
		lblNewLabel.setBounds(0, -27, 256, 482);
		contentPane.add(lblNewLabel);
	}
}
