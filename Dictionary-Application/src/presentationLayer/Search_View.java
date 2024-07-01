package presentationLayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import businessLayer.BL;

public class Search_View extends JFrame {

	private Welcome Wel;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2; 
	private JLabel lblNewLabel_10;
	ImageIcon image;
	private JLabel Meaning;
	private JLabel Adad_1;
	private JLabel Meaning_1;
	private JLabel Jins_1;
	private JLabel Asal_1;
	private JLabel Sinf_1;
	private JLabel Mashkool_1;
	private JLabel GhairMashkool_1;

	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_View frame = new Search_View();
					frame.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Search_View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("=");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Like_View L = new Like_View();
				L.run();
				dispose();
			}
		});
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.setBounds(207, 1, 47, 29);
		contentPane.add(btnNewButton_1_1);
		
		GhairMashkool_1 = new JLabel("");
		GhairMashkool_1.setHorizontalAlignment(SwingConstants.CENTER);
		GhairMashkool_1.setForeground(Color.WHITE);
		GhairMashkool_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		GhairMashkool_1.setBounds(0, 375, 80, 25);
		contentPane.add(GhairMashkool_1);
		
		Mashkool_1 = new JLabel("");
		Mashkool_1.setHorizontalAlignment(SwingConstants.CENTER);
		Mashkool_1.setForeground(Color.WHITE);
		Mashkool_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Mashkool_1.setBounds(153, 375, 80, 25);
		contentPane.add(Mashkool_1);
		
		Sinf_1 = new JLabel("");
		Sinf_1.setHorizontalAlignment(SwingConstants.CENTER);
		Sinf_1.setForeground(Color.WHITE);
		Sinf_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Sinf_1.setBounds(0, 306, 80, 25);
		contentPane.add(Sinf_1);
		
		Asal_1 = new JLabel("");
		Asal_1.setHorizontalAlignment(SwingConstants.CENTER);
		Asal_1.setForeground(Color.WHITE);
		Asal_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Asal_1.setBounds(153, 306, 80, 25);
		contentPane.add(Asal_1);
		
		Jins_1 = new JLabel("");
		Jins_1.setHorizontalAlignment(SwingConstants.CENTER);
		Jins_1.setForeground(Color.WHITE);
		Jins_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Jins_1.setBounds(0, 234, 80, 25);
		contentPane.add(Jins_1);
		
		Adad_1 = new JLabel("");
		Adad_1.setForeground(Color.WHITE);
		Adad_1.setHorizontalAlignment(SwingConstants.CENTER);
		Adad_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Adad_1.setBounds(164, 234, 80, 25);
		contentPane.add(Adad_1);
		
		Meaning = new JLabel("");
		Meaning.setForeground(Color.WHITE);
		Meaning.setBackground(new Color(240, 240, 240));
		Meaning.setHorizontalAlignment(SwingConstants.CENTER);
		Meaning.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Meaning.setBounds(123, 160, 100, 33);
		contentPane.add(Meaning);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(21, 115, 81, 33);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 23));	
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(10, 37, 65, 29);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				lblNewLabel_2.setText(textField.getText());
				BL b = new BL();
				
				ResultSet rs = null; 
				String meaning = "معنی";
				String mashkool = "مشكول";
				String sinf = "صنف";
				String asal = "أصل";
			    String jins = "جنس";
				String adad = "عدد";
				String ghairMashkool = "غیرمشكول";
				String ghairAsal = "غیرأصل";
				
				try {
					rs = b.Find_search_view(textField.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				try
				{
					if(rs.next())
					{
						Meaning.setText(rs.getString("معنی"));
						Mashkool_1.setText(rs.getString("مشكول"));
						Sinf_1.setText(rs.getString("صنف"));
						Asal_1.setText(rs.getString("أصل"));
						Jins_1.setText(rs.getString("جنس"));
						Adad_1.setText(rs.getString("عدد"));
						GhairMashkool_1.setText(rs.getString("غیرمشكول"));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "NO DATA FOUND FOR THIS WORD!");
					}
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setBounds(85, 37, 159, 29);
		contentPane.add(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 22));
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("←");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Search W = new Search();
				W.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(SystemColor.window);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(0, 1, 65, 29);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		
		
			lblNewLabel_10 = new JLabel("");
			lblNewLabel_10.setIcon(new ImageIcon(Search_View.class.getResource("/images/image1.png")));
		lblNewLabel_10.setBounds(0, 1, 254, 410);
		contentPane.add(lblNewLabel_10);
		
		
		Meaning_1 = new JLabel("New label");
		Meaning_1.setHorizontalAlignment(SwingConstants.CENTER);
		Meaning_1.setForeground(Color.WHITE);
		Meaning_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Meaning_1.setBackground(SystemColor.menu);
		Meaning_1.setBounds(123, 160, 100, 33);
		contentPane.add(Meaning_1);
	}
}
