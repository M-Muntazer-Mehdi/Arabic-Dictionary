package presentationLayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import businessLayer.BL;

public class Welcome extends JFrame {

	BL bl = new BL();
	/**
	 * Create the frame.
	 */
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("VIEW DATA");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bl.retrieveData();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				//obj.check();
				DataView disp = new DataView();
				disp.call(null);
				dispose();
			}
		});
		btnNewButton.setBounds(259, 110, 156, 45);
		contentPane.add(btnNewButton);
		
		JButton btnAddMeaning = new JButton("ADD MEANING");
		btnAddMeaning.setForeground(Color.WHITE);
		btnAddMeaning.setBackground(Color.DARK_GRAY);
		btnAddMeaning.setBorderPainted(false);
		btnAddMeaning.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAddMeaning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				meaning obj = new meaning();
				obj.call(null);
				dispose();
			}
		});
		btnAddMeaning.setBounds(259, 228, 156, 45);
		contentPane.add(btnAddMeaning);
		
		JButton btnImport = new JButton("IMPORT");
		btnImport.setForeground(Color.WHITE);
		btnImport.setBackground(Color.DARK_GRAY);
		btnImport.setBorderPainted(false);
		btnImport.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Import i = new Import();
				i.show();
				dispose();
				
			}
		});
		btnImport.setBounds(30, 109, 156, 45);
		contentPane.add(btnImport);
		
		JButton btnAddMeaning_2 = new JButton("SEARCH");
		btnAddMeaning_2.setBackground(Color.DARK_GRAY);
		btnAddMeaning_2.setForeground(Color.WHITE);
		btnAddMeaning_2.setBorderPainted(false);
		btnAddMeaning_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnAddMeaning_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search V = new Search();
				V.setVisible(true);
				dispose();
			}
		});
		btnAddMeaning_2.setBounds(38, 226, 148, 45);
		contentPane.add(btnAddMeaning_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Welcome.class.getResource("/images/image0.png")));
		lblNewLabel.setBounds(0, 0, 447, 294);
		contentPane.add(lblNewLabel);
	}
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}