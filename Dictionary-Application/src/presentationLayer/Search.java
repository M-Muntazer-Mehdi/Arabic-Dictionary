package presentationLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Search extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("←");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome W = new Welcome();
				W.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(335, 11, 65, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Search By Word");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_View V = new Search_View();
				V.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(37, 74, 288, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(160, 223, 186, 55);
		contentPane.add(btnNewButton_2);
		
		JButton btnSearchByRoot = new JButton("Search By Root");
		btnSearchByRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_Root V = new Search_Root();
				V.setVisible(true);
				dispose();
			}
		});
		btnSearchByRoot.setForeground(Color.WHITE);
		btnSearchByRoot.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnSearchByRoot.setBorderPainted(false);
		btnSearchByRoot.setBackground(Color.DARK_GRAY);
		btnSearchByRoot.setBounds(104, 154, 288, 41);
		contentPane.add(btnSearchByRoot);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Search.class.getResource("/images/image01.png")));
		lblNewLabel.setBounds(0, 0, 421, 219);
		contentPane.add(lblNewLabel);
	}

}
