package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	int xx, xy;
	Color corFundoMenu = new Color(153, 193, 241);
	Color corFundoMenuFoco = new Color(100, 100, 100);

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Cadastro frame = new Cadastro();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		/* PANEL */
		JPanel panelSidebar = new JPanel();
		JPanel panel_menu1 = new JPanel();
		JPanel panel_menu2 = new JPanel();
		JPanel panel_menu3 = new JPanel();
		JPanel panel_menu4 = new JPanel();
		JPanel panel_menu5 = new JPanel();

		/* LABEL */
		JLabel lblNewLabel = new JLabel("");
		JLabel lblMenu1 = new JLabel("HOME");
		JLabel lblMenu2 = new JLabel("HOME");
		JLabel lblMenu3 = new JLabel("HOME");
		JLabel lblMenu4 = new JLabel("HOME");
		JLabel lblMenu5 = new JLabel("HOME");

		setUndecorated(true);
		setOpacity(0.1f);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		setBackground(new Color(0, 0, 0, 50));
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				moveTela(e);
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pressTela(e);
			}
		});
		contentPane.setBackground(new Color(0, 0, 0, 0));
		contentPane.setBorder(null);
//		contentPane.setOpaque(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
//		
		panelSidebar.setBounds(0, 0, 189, 600);
		panelSidebar.setBackground(corFundoMenu);
		contentPane.add(panelSidebar);
		panelSidebar.setLayout(null);

		panel_menu5.setBorder(null);
		panel_menu5.setBounds(0, 491, 189, 97);
		panel_menu5.setBackground(corFundoMenu);
		panelSidebar.add(panel_menu5);
		panel_menu5.setLayout(null);

		lblMenu5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_menu5.setBackground(corFundoMenuFoco);
				lblMenu5.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_menu5.setBackground(corFundoMenu);
				lblMenu5.setForeground(Color.black);
			}
		});
		lblMenu5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu5.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu5.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMenu5.setBounds(0, 0, 189, 97);
		panel_menu5.add(lblMenu5);

		panel_menu4.setBorder(null);
		panel_menu4.setBounds(0, 382, 189, 97);
		panel_menu4.setBackground(corFundoMenu);
		panelSidebar.add(panel_menu4);
		panel_menu4.setLayout(null);

		lblMenu4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_menu4.setBackground(corFundoMenuFoco);
				lblMenu4.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_menu4.setBackground(corFundoMenu);
				lblMenu4.setForeground(Color.black);
			}
		});
		lblMenu4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu4.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu4.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMenu4.setBounds(0, 0, 189, 97);
		panel_menu4.add(lblMenu4);

		panel_menu2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_menu2.setBackground(corFundoMenuFoco);
				lblMenu2.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_menu2.setBackground(corFundoMenu);
				lblMenu2.setForeground(Color.black);
			}
		});
		panel_menu2.setBorder(null);
		panel_menu2.setBounds(0, 164, 189, 97);
		panel_menu2.setBackground(corFundoMenu);
		panelSidebar.add(panel_menu2);
		panel_menu2.setLayout(null);

		lblMenu2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMenu2.setBounds(0, 0, 189, 97);
		panel_menu2.add(lblMenu2);

		panel_menu3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_menu3.setBackground(corFundoMenuFoco);
				lblMenu3.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_menu3.setBackground(corFundoMenu);
				lblMenu3.setForeground(Color.black);
			}
		});
		panel_menu3.setBorder(null);
		panel_menu3.setBounds(0, 273, 189, 97);
		panel_menu3.setBackground(corFundoMenu);
		panelSidebar.add(panel_menu3);
		panel_menu3.setLayout(null);

		lblMenu3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMenu3.setBounds(0, 0, 189, 97);
		panel_menu3.add(lblMenu3);

		panel_menu1.setBorder(null);
		panel_menu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_menu1.setBackground(corFundoMenuFoco);
				lblMenu1.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_menu1.setBackground(corFundoMenu);
				lblMenu1.setForeground(Color.black);
			}
		});
		panel_menu1.setBounds(0, 55, 189, 97);
		panel_menu1.setBackground(corFundoMenu);
		panelSidebar.add(panel_menu1);
		panel_menu1.setLayout(null);

		lblMenu1.setBounds(0, 0, 189, 97);
		lblMenu1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu1.setFont(new Font("Dialog", Font.BOLD, 20));
		panel_menu1.add(lblMenu1);

		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); // desliga o aplicativo
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Cadastro.class.getResource("/img/close32.png")));
		lblNewLabel.setBounds(1156, 12, 32, 32);
		contentPane.add(lblNewLabel);

		JLabel lblTitulo = new JLabel("MyEstoque");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitulo.setBounds(207, 12, 937, 32);
		contentPane.add(lblTitulo);
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
