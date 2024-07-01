package presentationLayer;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import businessLayer.BL;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.SwingConstants;

public class meaning extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void call(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					meaning frame = new meaning();
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
	public meaning() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.DARK_GRAY);
		t1.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		t1.setToolTipText("");
		t1.setBounds(66, 172, 162, 42);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setForeground(Color.WHITE);
		t2.setBackground(Color.DARK_GRAY);
		t2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		t2.setColumns(10);
		t2.setBounds(10, 287, 162, 42);
		contentPane.add(t2);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BL obj= new BL();
				try {
					obj.addMeaning(t1.getText().toString(), t2.getText().toString());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				Welcome obj1 = new Welcome();
				obj1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(56, 366, 134, 34);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("←");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Welcome W = new Welcome();
				W.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(203, 0, 51, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel.setIcon(new ImageIcon(meaning.class.getResource("/images/image3.png")));
		lblNewLabel.setBounds(0, 0, 254, 427);
		contentPane.add(lblNewLabel);
	}
}