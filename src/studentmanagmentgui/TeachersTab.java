package studentmanagmentgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TeachersTab extends JFrame {

	private JPanel contentPane;

	
	public TeachersTab() {
		setTitle("Teachers Tab");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TeachersTab.class.getResource("/image/HeaderLogo.jpg")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 349);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setIcon(new ImageIcon(TeachersTab.class.getResource("/image/Untitled-1.png")));
		label.setBounds(288, 11, 270, 41);
		contentPane.add(label);
		
		JLabel lblWelcome = new JLabel("Welcome Mr. Md. Rayhan Amin");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(182, 51, 195, 14);
		contentPane.add(lblWelcome);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(217, 76, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnTakenCourse = new JMenu("Taken Course");
		menuBar.add(mnTakenCourse);
		
		JMenu mnSpring = new JMenu("Spring 2018");
		mnTakenCourse.add(mnSpring);
		
		JMenu mnOopLab = new JMenu("OOP Lab");
		mnSpring.add(mnOopLab);
		
		JMenuItem mntmFariaFerdowsyPriteemony = new JMenuItem("Faria Ferdowsy Priteemony");
		mntmFariaFerdowsyPriteemony.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentInformation();
			}
		});
		mnOopLab.add(mntmFariaFerdowsyPriteemony);
		
		JMenuItem mntmKanizFatema = new JMenuItem("Kaniz Fatema");
		mntmKanizFatema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentInformationTasmi();
			}
		});
		mnOopLab.add(mntmKanizFatema);
		
		JMenuItem mntmTammimYasmin = new JMenuItem("Tammim Yasmin");
		mntmTammimYasmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentInformationToinik();
			}
		});
		mnOopLab.add(mntmTammimYasmin);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(9, 8, 33, 30);
		contentPane.add(menuBar_1);
		JMenu mnMenu = new JMenu("");
		menuBar_1.add(mnMenu);
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
