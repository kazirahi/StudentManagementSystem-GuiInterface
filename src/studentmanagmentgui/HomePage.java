package studentmanagmentgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	
	public HomePage() {
		setTitle("Aahan University(Developed by Priteemony)");
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomePage.class.getResource("/image/HeaderLogo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setForeground(new Color(204, 255, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(HomePage.class.getResource("/image/Untitled-1.png")));
		label.setBounds(10, 89, 567, 62);
		contentPane.add(label);
		
		JButton btnTeachersLogin = new JButton("Teachers Login");
		btnTeachersLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeachersLogin();
				setVisible(false);
			}
		});
		btnTeachersLogin.setIcon(new ImageIcon(HomePage.class.getResource("/image/professor (1).png")));
		btnTeachersLogin.setBackground(new Color(0, 0, 0));
		btnTeachersLogin.setForeground(new Color(255, 255, 255));
		btnTeachersLogin.setBounds(81, 162, 153, 33);
		contentPane.add(btnTeachersLogin);
		
		JButton btnStudentLogin = new JButton("Student Login");
		btnStudentLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentLogin();
				setVisible(false);
			}
		});
		btnStudentLogin.setIcon(new ImageIcon(HomePage.class.getResource("/image/female-graduate-user-icon (1).png")));
		btnStudentLogin.setBackground(new Color(0, 0, 0));
		btnStudentLogin.setForeground(new Color(255, 255, 255));
		btnStudentLogin.setBounds(343, 162, 153, 33);
		contentPane.add(btnStudentLogin);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(HomePage.class.getResource("/image/Untitled-2.png")));
		label_1.setBounds(253, 280, 106, 70);
		contentPane.add(label_1);
		
		JLabel lblDevelopedByPriteemony = new JLabel("Developed by Rahi");
		lblDevelopedByPriteemony.setForeground(new Color(255, 153, 0));
		lblDevelopedByPriteemony.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDevelopedByPriteemony.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopedByPriteemony.setBounds(253, 336, 125, 14);
		contentPane.add(lblDevelopedByPriteemony);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(HomePage.class.getResource("/image/old-school (1).png")));
		label_2.setBounds(146, 0, 312, 106);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new About();
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(205, 218, 173, 33);
		contentPane.add(btnNewButton);
		setVisible(true);
	}
}
