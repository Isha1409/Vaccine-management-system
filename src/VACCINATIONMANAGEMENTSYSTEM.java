

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import Vaccination.Loginform;
import Vaccination.RegisttrationForm;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VACCINATIONMANAGEMENTSYSTEM extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VACCINATIONMANAGEMENTSYSTEM frame = new VACCINATIONMANAGEMENTSYSTEM();
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
	public VACCINATIONMANAGEMENTSYSTEM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800,700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(10, 5, 780, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO VACCINATION DRIVE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(165, 21, 510, 43);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginform lp=new Loginform();
				lp.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(142, 568, 115, 39);
		contentPane.add(btnNewButton);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisttrationForm rg=new RegisttrationForm();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		btnSignIn.setBorderPainted(false);
		btnSignIn.setBackground(new Color(0, 0, 255));
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSignIn.setBounds(537, 568, 115, 39);
		contentPane.add(btnSignIn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 89, 780, 601);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Nandargi\\Downloads\\image 1.3.jfif"));
		lblNewLabel_1.setBounds(87, 245, 207, 235);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Nandargi\\Downloads\\image 1.4.png"));
		lblNewLabel_1_1.setBounds(481, 262, 200, 218);
		panel_1.add(lblNewLabel_1_1);
		setUndecorated(true);
	}
}
