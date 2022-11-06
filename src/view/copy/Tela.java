package view.copy;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Tela {

	private JFrame frame;
	int xx, xy;
	private JTable table_1;
	private JScrollPane scrollPane;
	JLabel lblFechar; // cria o label
	JLabel lblTitulo = new JLabel("ESTOQUE");
	JPanel panelConteudo = new JPanel();
	JLabel lblPainelHome = new JLabel("HOME");
	Color corFundo = new Color(0x32CD32);

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Tela window = new Tela();
//					window.frame.setLocationRelativeTo(null); // para centralizar o formulario
//					window.frame.setVisible(true); // deixar o formulario visivel
//				} catch (Exception e) {
//					e.printStackTrace(); // exibe erro de execução
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize(); // inicializa componentes
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(); // cria frame
		frame.getContentPane().setBackground(corFundo);
		frame.getContentPane().setLayout(null); // define o layout do frame
		frame.setUndecorated(true); // tira a borda do frame
		frame.setBounds(100, 100, 1200, 600); // define o tamanho do frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o modo como o frame fecha

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 206, 600);
		panel.setBackground(new Color(153, 193, 241)); // seta cor
		panel.setLayout(null);
		frame.getContentPane().add(panel);

		JPanel panel_produto = new JPanel();
		JLabel lblProduto = new JLabel("PRODUTO");
		panel_produto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_produto.setBackground(new Color(100, 100, 100)); // seta cor
				lblProduto.setForeground(Color.white);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_produto.setBackground(new Color(153, 193, 241)); // seta cor
				lblProduto.setForeground(Color.black);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
//				lblPainelHome.setText("PRODUTO");
				chamaProduto();
			}
		});

		JPanel panel_home = new JPanel();
		JLabel lblHome = new JLabel("HOME");
		panel_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_home.setBackground(new Color(100, 100, 100)); // seta cor
				lblHome.setForeground(Color.white);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel_home.setBackground(new Color(153, 193, 241)); // seta cor
				lblHome.setForeground(Color.black);
			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				chamaHome();
			}
		});
		panel_home.setLayout(null);
		panel_home.setBackground(new Color(153, 193, 241));
		panel_home.setBounds(0, 12, 206, 90);
		panel.add(panel_home);
		lblHome.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Dialog", Font.BOLD, 20));
		lblHome.setBounds(0, 0, 206, 90);
		panel_home.add(lblHome);

		panel_produto.setBounds(0, 108, 206, 90);
		panel_produto.setBackground(new Color(153, 193, 241)); // seta cor
		panel.add(panel_produto);
		panel_produto.setLayout(null);

		lblProduto.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lblProduto.setFont(new Font("Dialog", Font.BOLD, 20));
		lblProduto.setBounds(0, 0, 206, 90);
		lblProduto.setHorizontalTextPosition(SwingConstants.CENTER);
		lblProduto.setHorizontalAlignment(SwingConstants.CENTER);
		panel_produto.add(lblProduto);

		lblFechar = new JLabel("X");
		lblFechar.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lblFechar.addMouseListener(new MouseAdapter() { // chamar evento de mouse

			public void mouseClicked(MouseEvent arg0) {
				System.exit(0); // desliga o aplicativo

			}
		});
		lblFechar.setFont(new Font("Dialog", Font.BOLD, 30)); // define fone e tamanho
		lblFechar.setForeground(Color.RED); // define cor da letra
		lblFechar.setBounds(1167, 5, 30, 30); // define posição e tamanho do label
		frame.getContentPane().add(lblFechar);

		panel.addMouseListener(new MouseAdapter() { // adiciona evento
			public void mousePressed(MouseEvent e) { // chama evento
				pressTela(e);
			}
		});
		panel.addMouseMotionListener(new MouseMotionAdapter() { // adiciona evento
			public void mouseDragged(MouseEvent arg0) { // chama evento
				moveTela(arg0);
			}
		});
		lblTitulo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				moveTela(e);
			}
		});
		lblTitulo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pressTela(e);
			}
		});

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitulo.setBounds(224, 0, 931, 35);
		frame.getContentPane().add(lblTitulo);

		panelConteudo.setBounds(218, 47, 970, 541);

		panelConteudo.setBackground(corFundo);
		panelConteudo.setLayout(null);
		frame.getContentPane().add(panelConteudo);

		lblPainelHome.setBounds(345, 12, 238, 15);
		panelConteudo.add(lblPainelHome);

//		panel_1.remove(lblTitulo2);

//		frame.getContentPane().add(panel_2);

//		frame.getContentPane().add(scrollPane);
		tabela();
	}

	public void tabela() {
		System.out.println("tabela chamada");
		/* SEÇÃO DA TABELA */
		ArrayList a = new ArrayList();
		table_1 = new JTable();
		frame.getContentPane().add(table_1);

		final String colunas[] = { "Nome:", "Idade:", "Sexo:" };
		final String dados[][] = { { "Jack", "19", "Masculino" }, { "Eddie", "56", "Masculino" },
				{ "Gina", "34", "Feminino" }, { "Klaus", "18", "Masculino" }, { "Erika", "20", "Feminino" },
				{ "Roberto", "29", "Masculino" }, { "Maria", "30", "Feminino" } };
		table_1 = new JTable(dados, colunas);
		table_1.setPreferredScrollableViewportSize(new Dimension(800, 300));// barra de rolagem
		table_1.setFillsViewportHeight(true);

		scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(234, 47, 954, 497);
		panelConteudo.add(scrollPane);
	}

	public void pressTela(MouseEvent e) {
		xx = e.getX(); // eixo x
		xy = e.getY(); // eixo y
	}

	public void moveTela(MouseEvent arg0) {
		int x = arg0.getXOnScreen(); //
		int y = arg0.getYOnScreen();
		frame.setLocation(x - xx, y - xy);
	}

	public void chamaHome() {
		panelConteudo.removeAll();
		panelConteudo.setVisible(false);
	}

	public void chamaProduto() {

		JButton btnNovoProduto = new JButton("novo produto");
		btnNovoProduto.setBounds(12, 467, 117, 25);
		panelConteudo.add(btnNovoProduto);

		JButton btnOla = new JButton("ola");
		btnOla.setBounds(841, 467, 117, 25);
		panelConteudo.add(btnOla);
		btnOla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//								frame.setBackground(new Color(200, 200, 200, 100)); // seta cor
				System.out.println("ola");
				tabela();
			}
		});
		btnNovoProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panelConteudo.setVisible(true);
	}
}
