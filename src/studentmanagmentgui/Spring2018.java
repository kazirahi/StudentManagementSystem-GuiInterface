package studentmanagmentgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Spring2018 extends JFrame {

	private JPanel contentPane;

	
	public Spring2018() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Spring2018.class.getResource("/image/HeaderLogo.jpg")));
		setTitle("Spring 2018");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1090, 454);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setIcon(new ImageIcon(Spring2018.class.getResource("/image/Untitled-1.png")));
		label.setBounds(846, 11, 218, 47);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Spring 2018");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(20, 69, 84, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setIcon(new ImageIcon(Spring2018.class.getResource("/image/spring2018.PNG")));
		label_1.setBounds(10, 94, 1062, 326);
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
		setVisible(true);
	}

}
