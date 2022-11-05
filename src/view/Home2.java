package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Home2 extends JFrame {

	private JPanel contentPane;
	int xx, xy;
	Color corFundoMenu = new Color(153, 193, 241);
	Color corFundoMenuFoco = new Color(100, 100, 100);

 

	/**
	 * Create the frame.
	 */
	public Home2() {
		/* PANEL */
		JPanel panelSidebar = new JPanel();
		JPanel ps_home = new JPanel();
		JPanel pn_produto = new JPanel();
		JPanel pn_relatorio = new JPanel();
		JPanel pn_cadastro = new JPanel();
		JPanel pn_configuracao = new JPanel();
		pn_configuracao.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse

		/* LABEL */
		JLabel lbl_fechar = new JLabel("");
		JLabel lbl_home = new JLabel("HOME");
		JLabel lbl_produto = new JLabel("PRODUTO");
		JLabel lbl_relatorio = new JLabel("RELATÓRIO");
		JLabel lbl_cadastro = new JLabel("CADASTRO");
		JLabel lbl_configuracao = new JLabel("CONFIG");

		/* MUDAR PONTEIRO DO MOUSE */
		lbl_fechar.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_home.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_produto.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_relatorio.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_cadastro.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_configuracao.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		
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

		pn_configuracao.setBorder(null);
		pn_configuracao.setBounds(0, 491, 189, 97);
		pn_configuracao.setBackground(corFundoMenu);
		panelSidebar.add(pn_configuracao);
		pn_configuracao.setLayout(null);

		lbl_configuracao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pn_configuracao.setBackground(corFundoMenuFoco);
				lbl_configuracao.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				pn_configuracao.setBackground(corFundoMenu);
				lbl_configuracao.setForeground(Color.black);
			}
		});
		lbl_configuracao.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_configuracao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_configuracao.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_configuracao.setBounds(0, 0, 189, 97);
		pn_configuracao.add(lbl_configuracao);

		pn_cadastro.setBorder(null);
		pn_cadastro.setBounds(0, 382, 189, 97);
		pn_cadastro.setBackground(corFundoMenu);
		panelSidebar.add(pn_cadastro);
		pn_cadastro.setLayout(null);

		lbl_cadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pn_cadastro.setBackground(corFundoMenuFoco);
				lbl_cadastro.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				pn_cadastro.setBackground(corFundoMenu);
				lbl_cadastro.setForeground(Color.black);
			}
		});
		lbl_cadastro.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_cadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_cadastro.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_cadastro.setBounds(0, 0, 189, 97);
		pn_cadastro.add(lbl_cadastro);

		pn_produto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pn_produto.setBackground(corFundoMenuFoco);
				lbl_produto.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				pn_produto.setBackground(corFundoMenu);
				lbl_produto.setForeground(Color.black);
			}
		});
		pn_produto.setBorder(null);
		pn_produto.setBounds(0, 164, 189, 97);
		pn_produto.setBackground(corFundoMenu);
		panelSidebar.add(pn_produto);
		pn_produto.setLayout(null);

		lbl_produto.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_produto.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_produto.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_produto.setBounds(0, 0, 189, 97);
		pn_produto.add(lbl_produto);

		pn_relatorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pn_relatorio.setBackground(corFundoMenuFoco);
				lbl_relatorio.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				pn_relatorio.setBackground(corFundoMenu);
				lbl_relatorio.setForeground(Color.black);
			}
		});
		pn_relatorio.setBorder(null);
		pn_relatorio.setBounds(0, 273, 189, 97);
		pn_relatorio.setBackground(corFundoMenu);
		panelSidebar.add(pn_relatorio);
		pn_relatorio.setLayout(null);

		lbl_relatorio.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_relatorio.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_relatorio.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_relatorio.setBounds(0, 0, 189, 97);
		pn_relatorio.add(lbl_relatorio);

		ps_home.setBorder(null);
		ps_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ps_home.setBackground(corFundoMenuFoco);
				lbl_home.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ps_home.setBackground(corFundoMenu);
				lbl_home.setForeground(Color.black);
			}
		});
		ps_home.setBounds(0, 55, 189, 97);
		ps_home.setBackground(corFundoMenu);
		panelSidebar.add(ps_home);
		ps_home.setLayout(null);

		lbl_home.setBounds(0, 0, 189, 97);
		lbl_home.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_home.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_home.setFont(new Font("Dialog", Font.BOLD, 20));
		ps_home.add(lbl_home);

		lbl_fechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); // desliga o aplicativo
			}
		});
		lbl_fechar.setIcon(new ImageIcon(Home2.class.getResource("/img/close32.png")));
		lbl_fechar.setBounds(1156, 12, 32, 32);
		contentPane.add(lbl_fechar);

		JLabel lblTitulo = new JLabel("MyEstoque");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitulo.setBounds(207, 12, 937, 32);
		contentPane.add(lblTitulo);
	}
	
	/**/

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
