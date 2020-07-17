package studentmanagmentgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInformation extends JFrame {

	private JPanel contentPane;

	
	public StudentInformation() {
		setTitle("Student Information");
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformation.class.getResource("/image/HeaderLogo.jpg")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton dashboardbtn = new JButton("AC Ledger");
		dashboardbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PaymentTab01();
			}
		});
		dashboardbtn.setForeground(new Color(255, 255, 255));
		dashboardbtn.setBackground(new Color(0, 0, 0));
		dashboardbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		dashboardbtn.setBounds(132, 60, 104, 23);
		contentPane.add(dashboardbtn);
		
		JButton btnProfile = new JButton("profile");
		btnProfile.setEnabled(false);
		btnProfile.setForeground(Color.WHITE);
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProfile.setBackground(Color.BLACK);
		btnProfile.setBounds(20, 60, 104, 23);
		contentPane.add(btnProfile);
		
		JButton btnRegisteredCourse = new JButton("Registered Course");
		btnRegisteredCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisteredInformation();
			}
		});
		btnRegisteredCourse.setForeground(Color.WHITE);
		btnRegisteredCourse.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRegisteredCourse.setBackground(Color.BLACK);
		btnRegisteredCourse.setBounds(246, 60, 137, 23);
		contentPane.add(btnRegisteredCourse);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setIcon(new ImageIcon(StudentInformation.class.getResource("/image/Untitled-1.png")));
		label.setBounds(327, 11, 260, 51);
		contentPane.add(label);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Resultsheet01();
			}
		});
		btnResult.setForeground(Color.WHITE);
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnResult.setBackground(Color.BLACK);
		btnResult.setBounds(394, 60, 93, 23);
		contentPane.add(btnResult);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentLogin();
				setVisible(false);
			}
			
			
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(494, 60, 83, 23);
		contentPane.add(btnLogout);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(StudentInformation.class.getResource("/image/30262042_234708260422639_4689932162122645504_n.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(20, 108, 114, 122);
		contentPane.add(label_2);
		
		JLabel lblFariaFerdowsyPriteemony = new JLabel("Faria Ferdowsy Priteemony");
		lblFariaFerdowsyPriteemony.setForeground(new Color(153, 0, 0));
		lblFariaFerdowsyPriteemony.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFariaFerdowsyPriteemony.setBounds(20, 241, 229, 23);
		contentPane.add(lblFariaFerdowsyPriteemony);
		
		JLabel lblFathers = new JLabel("Father's Name: Md. Alauddin Bhuiyan");
		lblFathers.setForeground(new Color(0, 0, 0));
		lblFathers.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFathers.setBounds(20, 264, 250, 23);
		contentPane.add(lblFathers);
		
		JLabel lblMothersNameKazi = new JLabel("Mother,s Name: Kazi Nahar Sharmin");
		lblMothersNameKazi.setForeground(Color.BLACK);
		lblMothersNameKazi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMothersNameKazi.setBounds(20, 288, 250, 23);
		contentPane.add(lblMothersNameKazi);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth: 21 July, 1997");
		lblDateOfBirth.setForeground(Color.BLACK);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateOfBirth.setBounds(20, 313, 250, 23);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblEmailPriteemonyagmailcom_1 = new JLabel("Email: priteemony.a@gmail.com");
		lblEmailPriteemonyagmailcom_1.setForeground(Color.BLACK);
		lblEmailPriteemonyagmailcom_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmailPriteemonyagmailcom_1.setBounds(20, 338, 250, 23);
		contentPane.add(lblEmailPriteemonyagmailcom_1);
		
		JLabel lblAdvisorName = new JLabel("Advisor Name: Warda Ruhin Bristy");
		lblAdvisorName.setForeground(Color.BLACK);
		lblAdvisorName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAdvisorName.setBounds(20, 372, 250, 39);
		contentPane.add(lblAdvisorName);
		
		JLabel lblBloodGroupA = new JLabel("Blood Group: AB(+)");
		lblBloodGroupA.setForeground(Color.BLACK);
		lblBloodGroupA.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBloodGroupA.setBounds(20, 359, 250, 23);
		contentPane.add(lblBloodGroupA);
		
		JLabel lblNoticeBoard = new JLabel("Notice Board");
		lblNoticeBoard.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoticeBoard.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNoticeBoard.setForeground(new Color(0, 0, 0));
		lblNoticeBoard.setBounds(364, 138, 213, 23);
		contentPane.add(lblNoticeBoard);
		
		JLabel lblNewLabel = new JLabel("\"Holiday Notice\"");
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(364, 160, 213, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblinstallmentNotice = new JLabel("\"Installment Notice\"");
		lblinstallmentNotice.setVerticalAlignment(SwingConstants.TOP);
		lblinstallmentNotice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblinstallmentNotice.setForeground(new Color(204, 0, 0));
		lblinstallmentNotice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblinstallmentNotice.setBackground(Color.BLACK);
		lblinstallmentNotice.setBounds(364, 180, 213, 15);
		contentPane.add(lblinstallmentNotice);
		
		JLabel lblfallResult = new JLabel("\"Fall 2017 result published\"");
		lblfallResult.setVerticalAlignment(SwingConstants.TOP);
		lblfallResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lblfallResult.setForeground(new Color(204, 0, 0));
		lblfallResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblfallResult.setBackground(Color.BLACK);
		lblfallResult.setBounds(364, 201, 213, 15);
		contentPane.add(lblfallResult);
		
		JLabel lblfinalExamFall = new JLabel("\"Final Exam Fall 2017\"");
		lblfinalExamFall.setVerticalAlignment(SwingConstants.TOP);
		lblfinalExamFall.setHorizontalAlignment(SwingConstants.RIGHT);
		lblfinalExamFall.setForeground(new Color(204, 0, 0));
		lblfinalExamFall.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblfinalExamFall.setBackground(Color.BLACK);
		lblfinalExamFall.setBounds(364, 229, 213, 15);
		contentPane.add(lblfinalExamFall);
		
		JButton button = new JButton("");
		button.setForeground(new Color(255, 255, 204));
		button.setBackground(new Color(204, 255, 255));
		button.setEnabled(false);
		button.setBounds(406, 138, 181, 273);
		contentPane.add(button);
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
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(StudentInformation.class.getResource("/image/download.png")));
		back.setBounds(0, 0, 587, 411);
		contentPane.add(back);
		setVisible(true);
	}

}
