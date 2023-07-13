package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 209, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCenterHospital = new JLabel("CENTER HOSPITAL");
		lblCenterHospital.setBounds(10, 107, 189, 37);
		lblCenterHospital.setForeground(Color.WHITE);
		lblCenterHospital.setFont(new Font("Century Gothic", Font.BOLD, 22));
		panel.add(lblCenterHospital);
		
		JLabel lblNiceTreatment = new JLabel("NICE TREATMENT");
		lblNiceTreatment.setForeground(Color.WHITE);
		lblNiceTreatment.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNiceTreatment.setBounds(10, 139, 189, 37);
		panel.add(lblNiceTreatment);
		
		JLabel lblQualifiedStaff = new JLabel("QUALIFIED STAFF");
		lblQualifiedStaff.setForeground(Color.WHITE);
		lblQualifiedStaff.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblQualifiedStaff.setBounds(10, 173, 189, 37);
		panel.add(lblQualifiedStaff);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(208, 0, 247, 307);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 136, 97, 31);
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Century Gothic", Font.BOLD, 18));
		panel_1.add(lblUsername);
		
		JLabel lblHospital = new JLabel("HMS");
		lblHospital.setBounds(114, 11, 50, 31);
		lblHospital.setForeground(Color.BLACK);
		lblHospital.setFont(new Font("Century Gothic", Font.BOLD, 24));
		panel_1.add(lblHospital);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblPassword.setBounds(10, 178, 97, 31);
		panel_1.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(106, 136, 120, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(106, 178, 120, 32);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(137, 246, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(18, 246, 89, 23);
		panel_1.add(btnClear);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\renan\\OneDrive\\Ambiente de Trabalho\\cruz.png"));
		lblNewLabel.setBounds(80, 42, 120, 82);
		panel_1.add(lblNewLabel);
	}
}
