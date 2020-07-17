package studentmanagmentgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class StudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public StudentLogin() {
		setTitle("Student Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentLogin.class.getResource("/image/HeaderLogo.jpg")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(244, 179, 173, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(244, 231, 173, 20);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(126, 182, 82, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(126, 234, 82, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("171159100") && passwordField.getText().equals("1234"))
				{
					JOptionPane.showMessageDialog(null, "Login Successfull");
					new StudentInformation();
					setVisible(false);
				}
				else if(textField.getText().equals("171159101") && passwordField.getText().equals("1234"))
				{
					
					JOptionPane.showMessageDialog(null, "Login Successfull");
					new StudentInformationTasmi(); 
					
				}
				else if(textField.getText().equals("171158722") && passwordField.getText().equals("1234"))
				{
					JOptionPane.showMessageDialog(null, "Login Successfull");
					new StudentInformationToinik();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid username or password");
				}
			}
			
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(243, 275, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setBounds(356, 275, 89, 23);
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(StudentLogin.class.getResource("/image/female-graduate-user-icon.png")));
		label.setBounds(227, 11, 135, 128);
		contentPane.add(label);
		
		JLabel lblStudentLogin = new JLabel("Student Login");
		lblStudentLogin.setForeground(new Color(204, 0, 0));
		lblStudentLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentLogin.setBounds(212, 150, 150, 18);
		contentPane.add(lblStudentLogin);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setBounds(10, 11, 25, 21);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("");
		menuBar.add(mnMenu);
		mnMenu.setIcon(new ImageIcon(StudentLogin.class.getResource("/image/menu-button-of-three-horizontal-lines (2).png")));
		mnMenu.setBackground(new Color(204, 255, 255));
		
		JMenuItem mntmHomepage = new JMenuItem("Homepage");
		mntmHomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HomePage();
			}
		});
		mntmHomepage.setSelected(true);
		mnMenu.add(mntmHomepage);
		
		JMenuItem mntmStudentLogin = new JMenuItem("Student Login");
		mntmStudentLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentLogin();
			}
		});
		mntmStudentLogin.setSelected(true);
		mnMenu.add(mntmStudentLogin);
		
		JMenuItem mntmTeachersLogin = new JMenuItem("Teachers Login");
		mntmTeachersLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeachersLogin();
			}
			
		});
		mnMenu.add(mntmTeachersLogin);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new About();
			}
		});
		mnMenu.add(mntmAbout);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnMenu.add(mntmExit);
		setVisible(true);
	}
}
