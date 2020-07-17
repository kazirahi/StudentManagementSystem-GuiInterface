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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PaymentTab01 extends JFrame {

	private JPanel contentPane;

	
	public PaymentTab01() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PaymentTab01.class.getResource("/image/HeaderLogo.jpg")));
		setTitle("Account Ledger");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PaymentTab01.class.getResource("/image/Untitled-1.png")));
		lblNewLabel.setBounds(685, 0, 212, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PaymentTab01.class.getResource("/image/payment1.PNG")));
		lblNewLabel_1.setBounds(10, 81, 1340, 452);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Account Ledger");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(329, 36, 325, 23);
		contentPane.add(lblNewLabel_2);
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
