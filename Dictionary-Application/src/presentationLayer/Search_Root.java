package presentationLayer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import businessLayer.BL;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Search_Root extends JFrame {
	private JPanel contentPane;
	private JTextField txtHello;
	private JLabel rakam;
	private JLabel sinf;
	private JLabel mashkool;
	private JLabel Asal;
	private JLabel jins;
	private JLabel adad;
	private JLabel ghair_mashkool;
	private JLabel ghair_asal;
	private JLabel means;
	private JLabel jar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Root frame = new Search_Root();
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
	public Search_Root() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 35));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = comboBox.getSelectedItem().toString();
				BL b = new BL();
				ResultSet rs = null; 
				
				try {
					System.out.print(str);
					rs = b.Find_search_view(str);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				try
				{
					if(rs.next())
					{
						rakam.setText(rs.getString("رقم"));
						mashkool.setText(rs.getString("مشكول"));
						sinf.setText(rs.getString("صنف"));
						Asal.setText(rs.getString("أصل"));
						jins.setText(rs.getString("جنس"));
						adad.setText(rs.getString("عدد"));
						ghair_mashkool.setText(rs.getString("غیرمشكول"));
						ghair_asal.setText(rs.getString("غیرأصل"));
						means.setText(rs.getString("معنی"));
						jar.setText(rs.getString("جڑ"));
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
		comboBox.setBounds(405, 10, 262, 41);
		contentPane.add(comboBox);
		
		txtHello = new JTextField();
		txtHello.setHorizontalAlignment(SwingConstants.CENTER);
		txtHello.setForeground(Color.WHITE);
		txtHello.setBackground(Color.DARK_GRAY);
		txtHello.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtHello.setBounds(269, 74, 359, 41);
		contentPane.add(txtHello);
		txtHello.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BL b = new BL();
				ResultSet rs = null; 
				
				try {
					rs = b.Find_search_root(txtHello.getText());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				try
				{
					while(rs.next())
					{
						comboBox.addItem(rs.getString("مشكول"));
					}
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			
				
			}
		});
		btnNewButton.setBounds(84, 74, 175, 41);
		contentPane.add(btnNewButton);
		
		rakam = new JLabel("");
		rakam.setForeground(Color.WHITE);
		rakam.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		rakam.setBounds(48, 180, 86, 30);
		contentPane.add(rakam);
		
		sinf = new JLabel("");
		sinf.setForeground(Color.WHITE);
		sinf.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		sinf.setBounds(221, 180, 86, 30);
		contentPane.add(sinf);
		
		mashkool = new JLabel("");
		mashkool.setForeground(Color.WHITE);
		mashkool.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		mashkool.setBounds(389, 180, 86, 30);
		contentPane.add(mashkool);
		
		Asal = new JLabel("");
		Asal.setForeground(Color.WHITE);
		Asal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		Asal.setBounds(566, 180, 86, 30);
		contentPane.add(Asal);
		
		jins = new JLabel("");
		jins.setForeground(Color.WHITE);
		jins.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		jins.setBounds(48, 280, 86, 30);
		contentPane.add(jins);
		
		adad = new JLabel("");
		adad.setForeground(Color.WHITE);
		adad.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		adad.setBounds(221, 280, 86, 30);
		contentPane.add(adad);
		
		ghair_mashkool = new JLabel("");
		ghair_mashkool.setForeground(Color.WHITE);
		ghair_mashkool.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		ghair_mashkool.setBounds(389, 280, 86, 30);
		contentPane.add(ghair_mashkool);
		
		ghair_asal = new JLabel("");
		ghair_asal.setForeground(Color.WHITE);
		ghair_asal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		ghair_asal.setBounds(566, 280, 86, 30);
		contentPane.add(ghair_asal);
		
		means = new JLabel("");
		means.setForeground(Color.WHITE);
		means.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		means.setBounds(221, 368, 86, 30);
		contentPane.add(means);
		
		jar = new JLabel("");
		jar.setForeground(Color.WHITE);
		jar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		jar.setBounds(389, 368, 86, 30);
		contentPane.add(jar);
		
		JButton btnNewButton_1 = new JButton("←");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search S = new Search();
				S.show();
				dispose();
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(0, 379, 76, 41);
		contentPane.add(btnNewButton_1);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(Search_Root.class.getResource("/images/image4.png")));
		image.setBounds(0, 0, 696, 434);
		contentPane.add(image);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
