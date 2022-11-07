package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.BreakIterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import model.Produto;
import model.TableModelProduto;

public class HomeForm extends JFrame {

	/* VARIAVEIS */
	int xx, xy;
	Color corPrincipal = new Color(0, 0, 0, 30);
//	Color corPrincipal =  new Color(153, 193, 241); /*new Color(255, 64, 64);*/
	Color corFundoMenu = new Color(153, 193, 241);
	Color corFundoMenuFoco = new Color(100, 100, 100);
	TableModelProduto modelProduto;

	/* COMPONENTES */
	JPanel contentPane;
	JPanel pn_conteudo = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	JPanel panel_0 = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();

	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();

	JTable table_1;
	JScrollPane scrollPane;

	/* PANEL */
	JPanel pn_sidebar = new JPanel();
	JPanel ps_home = new JPanel();
	JPanel pn_produto = new JPanel();
	JPanel pn_relatorio = new JPanel();
	JPanel pn_cadastro = new JPanel();
	JPanel pn_configuracao = new JPanel();

	/* LABEL */
	JLabel lbl_fechar = new JLabel("");
	JLabel lbl_home = new JLabel("HOME");
	JLabel lbl_produto = new JLabel("PRODUTO");
	JLabel lbl_relatorio = new JLabel("RELATÓRIO");
	JLabel lbl_cadastro = new JLabel("CADASTRO");
	JLabel lbl_configuracao = new JLabel("CONFIG");
	JLabel lblTitulo = new JLabel("MyEstoque");
	private JTextField textField;
	private final JTextPane txtNome = new JTextPane();
	private final JButton btnAdicionar = new JButton("adicionar");
	private final JButton btnRemover = new JButton("remover");
	private final JLabel lblConfig = new JLabel("");

	/**
	 * Create the frame.
	 */
	public HomeForm() {

		pn_configuracao.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_fechar.setBounds(1156, 12, 32, 32);
		pn_sidebar.setBounds(0, 0, 189, 600);

		modelProduto = new TableModelProduto();
		table_1 = new JTable(modelProduto); // ver se vai dar erro
		table_1.getTableHeader().setReorderingAllowed(false);
		scrollPane = new JScrollPane(table_1);

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
		setBackground(corPrincipal);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
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
		contentPane.setBackground(corPrincipal);
		contentPane.setBorder(null);
//		contentPane.setOpaque(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		pn_sidebar.setBackground(corFundoMenu);
		contentPane.add(pn_sidebar);
		pn_sidebar.setLayout(null);

		pn_configuracao.setBorder(null);
		pn_configuracao.setBounds(0, 491, 189, 97);
		pn_configuracao.setBackground(corFundoMenu);
		pn_sidebar.add(pn_configuracao);
		pn_configuracao.setLayout(null);

		pn_configuracao.addMouseListener(new MouseAdapter() {
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

			@Override
			public void mouseClicked(MouseEvent e) {
				ativaPainel4();
			}
		});
		lbl_configuracao.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_configuracao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_configuracao.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_configuracao.setBounds(0, 0, 189, 97);
		pn_configuracao.add(lbl_configuracao);
		pn_cadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ativaPainel3();
			}

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

		pn_cadastro.setBorder(null);
		pn_cadastro.setBounds(0, 382, 189, 97);
		pn_cadastro.setBackground(corFundoMenu);
		pn_sidebar.add(pn_cadastro);
		pn_cadastro.setLayout(null);

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

			public void mouseClicked(MouseEvent e) {
//				modelProduto.carregar();
				ativaPainel1();
			}
		});
		pn_produto.setBorder(null);
		pn_produto.setBounds(0, 164, 189, 97);
		pn_produto.setBackground(corFundoMenu);
		pn_sidebar.add(pn_produto);
		pn_produto.setLayout(null);

		lbl_produto.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_produto.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_produto.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_produto.setBounds(0, 0, 189, 97);
		lbl_produto.setText("PRODUTO");
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

			@Override
			public void mouseClicked(MouseEvent e) {
				ativaPainel2();
			}
		});
		pn_relatorio.setBorder(null);
		pn_relatorio.setBounds(0, 273, 189, 97);
		pn_relatorio.setBackground(corFundoMenu);
		pn_sidebar.add(pn_relatorio);
		pn_relatorio.setLayout(null);

		lbl_relatorio.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_relatorio.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_relatorio.setFont(new Font("Dialog", Font.BOLD, 20));
		lbl_relatorio.setBounds(0, 0, 189, 97);
		pn_relatorio.add(lbl_relatorio);

		ps_home.setBorder(null);

		ps_home.setBounds(0, 55, 189, 97);
		ps_home.setBackground(corFundoMenu);
		pn_sidebar.add(ps_home);
		ps_home.setLayout(null);
		lbl_home.setBounds(0, 0, 189, 97);
		lbl_home.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_home.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_home.setFont(new Font("Dialog", Font.BOLD, 20));
		ps_home.add(lbl_home);

		JLabel lblLogotipo = new JLabel("");
		lblLogotipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogotipo.setIcon(new ImageIcon(HomeForm.class.getResource("/img/java32.png")));
		lblLogotipo.setBounds(12, 12, 165, 31);
		pn_sidebar.add(lblLogotipo);
		ps_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ps_home.setBackground(corFundoMenuFoco);
				lbl_home.setForeground(Color.white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("clique");
				ativaPainel0();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ps_home.setBackground(corFundoMenu);
				lbl_home.setForeground(Color.black);
			}
		});

		lbl_fechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); // desliga o aplicativo
			}
		});
		lbl_fechar.setIcon(new ImageIcon(HomeForm.class.getResource("/img/close32.png")));
		contentPane.add(lbl_fechar);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitulo.setBounds(207, 12, 937, 32);

		pn_conteudo.setBounds(201, 56, 987, 532);
		pn_conteudo.setBackground(corFundoMenu);
		contentPane.add(pn_conteudo);

		contentPane.add(lblTitulo);
		pn_conteudo.setLayout(null);

		layeredPane.setBounds(0, 0, 987, 532);
		pn_conteudo.add(layeredPane);

//		panel_0.setBounds(0, 0, 987, 532);
//		panel_0.setBackground(new Color(47, 79, 79));
//		panel_0.setLayout(null);
//		layeredPane.add(panel_0);

		panel_1.setBackground(new Color(255, 0, 255));
		panel_1.setBounds(0, 0, 987, 532);
		panel_1.setLayout(null);
		tabela();

		JButton btnUnidade = new JButton("UNIDADE");
		btnUnidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UnidadeDialog unidade = new UnidadeDialog();
				unidade.setLocationRelativeTo(null);
				unidade.setVisible(true);
			}
		});
		btnUnidade.setBounds(12, 12, 117, 25);
		panel_1.add(btnUnidade);
		JButton btnProduto = new JButton("PRODUTO");
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProdutoAddDialog pd = new ProdutoAddDialog();
				pd.setVisible(true);

				salvar(pd.r(), pd.n());
//				Produto p = new Produto(id, nome);
//				modelProduto.addProduto(p);
			}
		});
		btnProduto.setBounds(141, 12, 117, 25);
		panel_1.add(btnProduto);
		textField = new JTextField();
		textField.setBounds(270, 12, 576, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		JButton btnPesquisar = new JButton("PESQUISAR");
		btnPesquisar.setBounds(858, 12, 117, 25);
		panel_1.add(btnPesquisar);
		layeredPane.add(panel_1);

		JTextPane txtId = new JTextPane();
		txtId.setBounds(10, 462, 119, 21);
		panel_1.add(txtId);
		txtNome.setBounds(141, 462, 119, 21);

		panel_1.add(txtNome);
//		table_1 = new JTable(dados, colunas);
		table_1.setPreferredScrollableViewportSize(new Dimension(954, 300));// barra de rolagem
		table_1.setFillsViewportHeight(true);

		scrollPane.setBounds(10, 50, 954, 400);
		panel_1.add(scrollPane);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtId.getText());
				String nome = txtNome.getText();
				salvar(id, nome);
			}
		});
		btnAdicionar.setBounds(273, 462, 117, 25);

		panel_1.add(btnAdicionar);
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linha = table_1.getSelectedRow();
				modelProduto.removeProduto(linha);
			}
		});
		btnRemover.setBounds(402, 462, 117, 25);

		panel_1.add(btnRemover);

		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(0, 0, 987, 532);
		layeredPane.add(panel_2);
		/**/
		panel_3.setBackground(new Color(0, 155, 0));
		panel_3.setBounds(0, 0, 987, 532);
		layeredPane.add(panel_3);
		panel_4.setBackground(new Color(155, 0, 0));
		panel_4.setBounds(0, 0, 987, 532);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);
		lblConfig.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfig.setIcon(new ImageIcon(HomeForm.class.getResource("/img/java512.png")));
		lblConfig.setBounds(12, 12, 963, 508);

		panel_4.add(lblConfig);

		/**/
//		chamaProduto();
		ativaPainel0();
	}

	/**/
	public void tabela() {
		System.out.println("tabela chamada");
		/* SEÇÃO DA TABELA */
//		ArrayList a = new ArrayList();

//		frame.getContentPane().add(table_1);

//		final String colunas[] = { "s" };
//		final String dados[][] = {};

	}

	public void salvar(int id, String nome) {
//		Produto p = new Produto(id, nome);
		modelProduto.addProduto(new Produto(id, nome));
		System.out.println("salvando....");
	}

	public void desativaPainel() {
		panel_0.setVisible(!true);
		panel_1.setVisible(!true);
		panel_2.setVisible(!true);
		panel_3.setVisible(!true);
		panel_4.setVisible(!true);

	}

	public void ativaPainel0() {
		desativaPainel();
		panel_0.setVisible(true);
//		ativaPainel4();
	}

	public void ativaPainel1() {
		desativaPainel();
		panel_1.setVisible(true);
	}

	private void ativaPainel2() {
		desativaPainel();
		panel_2.setVisible(true);
	}

	private void ativaPainel3() {
		desativaPainel();
		panel_3.setVisible(true);
	}

	private void ativaPainel4() {
		desativaPainel();
		panel_4.setVisible(true);
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
