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

public class About extends JFrame {

	private JPanel contentPane;

	
	public About() {
		setTitle("About");
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/image/HeaderLogo.jpg")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 697);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(About.class.getResource("/image/Untitled-1.png")));
		lblNewLabel.setBounds(390, 11, 231, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(About.class.getResource("/image/fgyhrfy.png")));
		lblNewLabel_1.setBounds(254, 80, 128, 159);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mr. Md. Rayhan Amin");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(229, 235, 186, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblProjectInstructor = new JLabel("Project Instructor");
		lblProjectInstructor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectInstructor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProjectInstructor.setBounds(229, 260, 186, 14);
		contentPane.add(lblProjectInstructor);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(About.class.getResource("/image/30262042_234708260422639_4689932162122645504_n.png")));
		label.setBounds(35, 278, 128, 159);
		contentPane.add(label);
		
		JLabel lblFariaFerdowsyPriteemony = new JLabel("Faria Ferdowsy Priteemony");
		lblFariaFerdowsyPriteemony.setHorizontalAlignment(SwingConstants.CENTER);
		lblFariaFerdowsyPriteemony.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFariaFerdowsyPriteemony.setBounds(10, 433, 186, 14);
		contentPane.add(lblFariaFerdowsyPriteemony);
		
		JLabel lblId = new JLabel("ID: 171-15-9100");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setBounds(10, 458, 186, 14);
		contentPane.add(lblId);
		
		JLabel lblDepartmentOfCse = new JLabel("Department of CSE");
		lblDepartmentOfCse.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartmentOfCse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepartmentOfCse.setBounds(10, 483, 186, 14);
		contentPane.add(lblDepartmentOfCse);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(About.class.getResource("/image/toinik.png")));
		label_1.setBounds(254, 285, 128, 159);
		contentPane.add(label_1);
		
		JLabel lblTammimYeasmin = new JLabel("Tammim Yeasmin");
		lblTammimYeasmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblTammimYeasmin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTammimYeasmin.setBounds(229, 440, 186, 14);
		contentPane.add(lblTammimYeasmin);
		
		JLabel lblId_1 = new JLabel("ID: 171-15-8722");
		lblId_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblId_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId_1.setBounds(229, 465, 186, 14);
		contentPane.add(lblId_1);
		
		JLabel label_4 = new JLabel("Department of CSE");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(229, 490, 186, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(About.class.getResource("/image/tasmi.png")));
		label_5.setBounds(460, 285, 128, 159);
		contentPane.add(label_5);
		
		JLabel lblKanizFatema = new JLabel("Kaniz Fatema");
		lblKanizFatema.setHorizontalAlignment(SwingConstants.CENTER);
		lblKanizFatema.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKanizFatema.setBounds(435, 440, 186, 14);
		contentPane.add(lblKanizFatema);
		
		JLabel lblId_2 = new JLabel("ID: 171-15-9101");
		lblId_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblId_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId_2.setBounds(435, 465, 186, 14);
		contentPane.add(lblId_2);
		
		JLabel label_8 = new JLabel("Department of CSE");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(435, 490, 186, 14);
		contentPane.add(label_8);
		
		JLabel lblNewLabel_3 = new JLabel("Project Name: Student Management Systems");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(22, 553, 308, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblDevelopedByFaria = new JLabel("Developed by: Faria Ferdowsy Priteemony");
		lblDevelopedByFaria.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDevelopedByFaria.setBounds(22, 578, 245, 14);
		contentPane.add(lblDevelopedByFaria);
		
		JLabel lblNewLabel_4 = new JLabel("Project About");
		lblNewLabel_4.setForeground(new Color(255, 51, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(251, 55, 130, 26);
		contentPane.add(lblNewLabel_4);
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
