package studentmanagmentgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisteredInformation extends JFrame {

	private JPanel contentPane;

	
	public RegisteredInformation() {
		setTitle("Registerd Information");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegisteredInformation.class.getResource("/image/HeaderLogo.jpg")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSpring = new JButton("Spring 2018");
		btnSpring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Spring2018();
			}
		});
		btnSpring.setForeground(Color.WHITE);
		btnSpring.setBackground(Color.BLACK);
		btnSpring.setBounds(75, 222, 129, 37);
		contentPane.add(btnSpring);
		
		JButton btnFall = new JButton("Fall 2017");
		btnFall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Fall2017();
			}
		});
		btnFall.setForeground(Color.WHITE);
		btnFall.setBackground(Color.BLACK);
		btnFall.setBounds(379, 167, 129, 37);
		contentPane.add(btnFall);
		
		JButton btnSpring2017 = new JButton("Spring 2017");
		btnSpring2017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Spring2017();
			}
		});
		btnSpring2017.setForeground(new Color(255, 255, 255));
		btnSpring2017.setBackground(new Color(0, 0, 0));
		btnSpring2017.setBounds(75, 167, 129, 37);
		contentPane.add(btnSpring2017);
		
		JButton btnSummer = new JButton("Summer 2017");
		btnSummer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Summer2017();
			}
		});
		btnSummer.setForeground(Color.WHITE);
		btnSummer.setBackground(Color.BLACK);
		btnSummer.setBounds(223, 167, 129, 37);
		contentPane.add(btnSummer);
		
		JLabel lblCompletedCourse = new JLabel("Completed Course");
		lblCompletedCourse.setForeground(new Color(0, 0, 0));
		lblCompletedCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompletedCourse.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCompletedCourse.setBounds(160, 123, 221, 14);
		contentPane.add(lblCompletedCourse);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setIcon(new ImageIcon(RegisteredInformation.class.getResource("/image/Untitled-1.png")));
		label_1.setBounds(305, 11, 272, 46);
		contentPane.add(label_1);
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegisteredInformation.class.getResource("/image/download.png")));
		label.setBounds(0, 0, 587, 411);
		contentPane.add(label);
		setVisible(true);
	}

}
