package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	int xx, xy;
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
		setUndecorated(true);
		setOpacity(0.1f);
		setBounds(100, 100, 771, 335);
		setBackground(new Color(0, 0, 0, 30));
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				moveTela(e);

			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pressTela(e);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		contentPane.setBackground(new Color(0, 0, 0, 30));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_fechar = new JLabel("");
		lbl_fechar.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_fechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); // desliga o aplicativo
			}
		});
		lbl_fechar.setIcon(new ImageIcon(Login.class.getResource("/img/close32.png")));
		lbl_fechar.setBounds(727, 12, 32, 32);
		contentPane.add(lbl_fechar);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Dialog", Font.BOLD, 26));
		lblLogin.setBounds(12, 12, 703, 32);
		contentPane.add(lblLogin);

		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setBounds(420, 132, 70, 15);
		contentPane.add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(420, 173, 70, 15);
		contentPane.add(lblSenha);

		textField = new JTextField();
		textField.setBounds(508, 130, 201, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("LOGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home home = new Home();
				home.setLocationRelativeTo(null);
				home.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(420, 212, 289, 25);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/java256-2.png")));
		lblNewLabel.setBounds(12, 56, 390, 267);
		contentPane.add(lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(508, 173, 201, 19);
		contentPane.add(passwordField);
	}

	public void pressTela(MouseEvent e) {
		xx = e.getX(); // eixo x
		xy = e.getY(); // eixo y
	}

	public void moveTela(MouseEvent arg0) {
		int x = arg0.getXOnScreen(); //
		int y = arg0.getYOnScreen();
		this.setLocation(x - xx, y - xy);
	}
}
