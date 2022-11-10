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
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JSlider;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JSpinner;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import javax.swing.UIManager;

public class HomeForm extends JFrame {

	/* VARIAVEIS */
	int xx, xy;
	int r = 0, g = 0, b = 0, a = 100;
	int rm = 153, gm = 193, bm = 241, am = 255;
	Color corPrincipal = new Color(r, g, b, a);
//	Color corPrincipal =  new Color(153, 193, 241); /*new Color(255, 64, 64);*/
	Color corFundoMenu = new Color(rm, gm, bm, am);
	Color corFundoMenuFoco = new Color(100, 100, 100);
	TableModelProduto modelProduto;

	/* COMPONENTES */
	JPanel contentPane;
	JPanel pn_conteudo = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	JPanel panel_0 = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();

	JPanel panel_cadastro = new JPanel();
	JPanel panel_config = new JPanel();

	JTable table_1;
	JScrollPane scrollPane;

	/* PANEL */
	JPanel pn_sidebar = new JPanel();
	JPanel pn_home = new JPanel();
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
	private final JLabel lblBtnCfop = new JLabel("Cfop");
	private final JLabel lblBtnNcm = new JLabel("Ncm");
	private JLabel lblBtnUnidade;
	private final JLabel lblPnCorPrincipal = new JLabel("Cor fundo");
	private final JLabel lblVermelho = new JLabel("Vermelho");
	private final JLabel lblVerde = new JLabel("Verde");
	private final JLabel lblAzul = new JLabel("Azul");
	private final JLabel lblTrasnparencia = new JLabel("Transparencia");
	private final JSlider slider_Prin_verm = new JSlider();
	private final JSlider slider_Prin_verd = new JSlider();
	private final JSlider slider_prin_azul = new JSlider();
	private final JSlider slider_prin_trans = new JSlider();
	private final JPanel panel_cor_principal = new JPanel();
	private final JPanel panel_cor_principal_1 = new JPanel();
	private final JLabel lblCorMenu = new JLabel("Cor principal");
	private final JLabel lblVermelho_1 = new JLabel("Vermelho");
	private final JLabel lblVerde_1 = new JLabel("Verde");
	private final JLabel lblAzul_1 = new JLabel("Azul");
	private final JSlider slider_Prin_verm_1 = new JSlider();
	private final JSlider slider_Prin_verd_1 = new JSlider();
	private final JSlider slider_prin_azul_1 = new JSlider();
	private final JLabel lblBtnEmpresa = new JLabel("Ncm");
	private final JLabel lblConfiguracoes = new JLabel("Configurações");
	private final JPanel panel_conteiner_unidade = new JPanel();
	private final JPanel panel_conteiner_cfop = new JPanel();
	private final JPanel panel_conteiner_ncm = new JPanel();
	private final JPanel panel_conteiner_empresa = new JPanel();

	/**
	 * Create the frame.
	 */
	public HomeForm() {

		pn_configuracao.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_fechar.setBounds(1156, 12, 32, 32);
		pn_sidebar.setBounds(0, 0, 189, 600);

		modelProduto = new TableModelProduto();

		/* MUDAR PONTEIRO DO MOUSE */
		lbl_fechar.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_home.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_produto.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_relatorio.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_cadastro.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		lbl_configuracao.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse
		pn_configuracao.setCursor(new Cursor(Cursor.HAND_CURSOR)); // mudar o cursor do mouse

		setUndecorated(true);
		setOpacity(0.8f);
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

		pn_home.setBorder(null);

		pn_home.setBounds(0, 55, 189, 97);
		pn_home.setBackground(corFundoMenu);
		pn_sidebar.add(pn_home);
		pn_home.setLayout(null);
		lbl_home.setBounds(0, 0, 189, 97);
		lbl_home.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_home.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_home.setFont(new Font("Dialog", Font.BOLD, 20));
		pn_home.add(lbl_home);

		JLabel lblLogotipo = new JLabel("");
		lblLogotipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogotipo.setIcon(new ImageIcon(HomeForm.class.getResource("/img/java32.png")));
		lblLogotipo.setBounds(12, 12, 165, 31);
		pn_sidebar.add(lblLogotipo);
		pn_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pn_home.setBackground(corFundoMenuFoco);
				lbl_home.setForeground(Color.white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("clique");
				ativaPainel0();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				pn_home.setBackground(corFundoMenu);
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
		tabela();
		table_1 = new JTable(modelProduto); // ver se vai dar erro
		table_1.getTableHeader().setReorderingAllowed(false);
		scrollPane = new JScrollPane(table_1);

		// panel_0.setBounds(0, 0, 987, 532);
		// panel_0.setBackground(new Color(47, 79, 79));
		// panel_0.setLayout(null);
		// layeredPane.add(panel_0);

		panel_1.setBackground(new Color(255, 0, 255));
		panel_1.setBounds(0, 0, 987, 532);
		panel_1.setLayout(null);

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
		panel_cadastro.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_cadastro.setBounds(0, 0, 987, 532);
		layeredPane.add(panel_cadastro);
		panel_cadastro.setBackground(corFundoMenu);
		panel_cadastro.setLayout(null);

		JLabel lblCadastros = new JLabel("Cadastros");
		lblCadastros.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastros.setForeground(Color.WHITE);
		lblCadastros.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCadastros.setBounds(12, 12, 115, 24);
		panel_cadastro.add(lblCadastros);
		panel_conteiner_unidade.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_conteiner_unidade.setBackground(corFundoMenuFoco);
				lblBtnUnidade.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_conteiner_unidade.setBackground(corFundoMenu);
				lblBtnUnidade.setForeground(Color.black);
			}
		});
		panel_conteiner_unidade.setBounds(12, 100, 226, 200);
		panel_conteiner_unidade.setBackground(corFundoMenu);
		panel_cadastro.add(panel_conteiner_unidade);
				panel_conteiner_unidade.setLayout(null);
		
				lblBtnUnidade = new JLabel("Unidade");
				lblBtnUnidade.setBounds(0, 0, 226, 200);
				panel_conteiner_unidade.add(lblBtnUnidade);
				lblBtnUnidade.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
						lblBtnUnidade.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
						lblBtnUnidade.setVerticalTextPosition(SwingConstants.BOTTOM);
						lblBtnUnidade.setHorizontalTextPosition(SwingConstants.CENTER);
						lblBtnUnidade.setHorizontalAlignment(SwingConstants.CENTER);
						lblBtnUnidade.setIcon(new ImageIcon(HomeForm.class.getResource("/img/a-medida128.png")));
						lblBtnUnidade.setForeground(Color.WHITE);
						panel_conteiner_cfop.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								panel_conteiner_cfop.setBackground(corFundoMenuFoco);
								lblBtnCfop.setForeground(Color.white);
							}
							@Override
							public void mouseExited(MouseEvent e) {
								panel_conteiner_cfop.setBackground(corFundoMenu);
								lblBtnCfop.setForeground(Color.black);
							}
						});
						panel_conteiner_cfop.setBounds(253, 100, 229, 200);
						
						panel_cadastro.add(panel_conteiner_cfop);
						panel_conteiner_cfop.setLayout(null);
						lblBtnCfop.setBounds(0, 0, 229, 200);
						panel_conteiner_cfop.setBackground(corFundoMenu);
						panel_conteiner_cfop.add(lblBtnCfop);
						lblBtnCfop.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						lblBtnCfop.setIcon(new ImageIcon(HomeForm.class.getResource("/img/impostos128-2.png")));
						lblBtnCfop.setVerticalTextPosition(SwingConstants.BOTTOM);
						lblBtnCfop.setHorizontalTextPosition(SwingConstants.CENTER);
						lblBtnCfop.setHorizontalAlignment(SwingConstants.CENTER);
						lblBtnCfop.setForeground(Color.WHITE);
						lblBtnCfop.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
						panel_conteiner_ncm.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								panel_conteiner_ncm.setBackground(corFundoMenuFoco);
								lblBtnNcm.setForeground(Color.white);
							}
							@Override
							public void mouseExited(MouseEvent e) {
								panel_conteiner_ncm.setBackground(corFundoMenu);
								lblBtnNcm.setForeground(Color.black);
							}
						});
						panel_conteiner_ncm.setLayout(null);
						panel_conteiner_ncm.setBounds(495, 100, 229, 200);
						panel_conteiner_ncm.setBackground(corFundoMenu);
						panel_cadastro.add(panel_conteiner_ncm);
						lblBtnNcm.setBounds(0, 0, 229, 200);
						panel_conteiner_ncm.add(lblBtnNcm);
						lblBtnNcm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						lblBtnNcm.setIcon(new ImageIcon(HomeForm.class.getResource("/img/impostos128.png")));
						lblBtnNcm.setVerticalTextPosition(SwingConstants.BOTTOM);
						lblBtnNcm.setHorizontalTextPosition(SwingConstants.CENTER);
						lblBtnNcm.setHorizontalAlignment(SwingConstants.CENTER);
						lblBtnNcm.setForeground(Color.WHITE);
						lblBtnNcm.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
						panel_conteiner_empresa.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								panel_conteiner_empresa.setBackground(corFundoMenuFoco);
								lblBtnEmpresa.setForeground(Color.white);
							}
							@Override
							public void mouseExited(MouseEvent e) {
								panel_conteiner_empresa.setBackground(corFundoMenu);
								lblBtnEmpresa.setForeground(Color.black);
							}
						});
						panel_conteiner_empresa.setLayout(null);
						panel_conteiner_empresa.setBounds(736, 100, 229, 200);
						panel_conteiner_empresa.setBackground(corFundoMenu);
						panel_cadastro.add(panel_conteiner_empresa);
						lblBtnEmpresa.setBounds(0, 0, 229, 200);
						panel_conteiner_empresa.add(lblBtnEmpresa);
						lblBtnEmpresa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						lblBtnEmpresa.setIcon(new ImageIcon(HomeForm.class.getResource("/img/impostos128.png")));
						lblBtnEmpresa.setVerticalTextPosition(SwingConstants.BOTTOM);
						lblBtnEmpresa.setHorizontalTextPosition(SwingConstants.CENTER);
						lblBtnEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
						lblBtnEmpresa.setForeground(Color.WHITE);
						lblBtnEmpresa.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
				panel_config.setBackground(corFundoMenu);
				panel_config.setBounds(0, 0, 987, 532);
				layeredPane.add(panel_config);
				panel_config.setLayout(null);
				
						panel_cor_principal.setBackground(corFundoMenu);
						panel_cor_principal.setBounds(163, 151, 300, 249);
						panel_config.add(panel_cor_principal);
						panel_cor_principal.setLayout(null);
						lblPnCorPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
						lblPnCorPrincipal.setForeground(Color.WHITE);
						lblPnCorPrincipal.setFont(new Font("Dialog", Font.BOLD, 20));
						lblPnCorPrincipal.setBounds(12, 12, 276, 32);
						
								panel_cor_principal.add(lblPnCorPrincipal);
								lblVermelho.setForeground(Color.WHITE);
								lblVermelho.setBounds(12, 56, 276, 15);
								
										panel_cor_principal.add(lblVermelho);
										lblVerde.setForeground(Color.WHITE);
										lblVerde.setBounds(12, 101, 276, 15);
										
												panel_cor_principal.add(lblVerde);
												lblAzul.setForeground(Color.WHITE);
												lblAzul.setBounds(12, 153, 276, 15);
												
														panel_cor_principal.add(lblAzul);
														lblTrasnparencia.setForeground(Color.WHITE);
														lblTrasnparencia.setBounds(12, 201, 276, 15);
														
																panel_cor_principal.add(lblTrasnparencia);
																slider_prin_trans.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																
																		slider_prin_trans.setBounds(12, 228, 200, 16);
																		slider_prin_trans.setBackground(corFundoMenu);
																		panel_cor_principal.add(slider_prin_trans);
																		slider_prin_trans.addMouseListener(new MouseAdapter() {
																			@Override
																			public void mouseReleased(MouseEvent e) {
																				alteraCorPrincipal();
																			}
																		});
																		slider_prin_trans.setMaximum(255);
																		slider_Prin_verm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																		slider_Prin_verm.addMouseListener(new MouseAdapter() {
																			@Override
																			public void mouseReleased(MouseEvent e) {
																				alteraCorPrincipal();
																			}
																		});
																		
																				slider_Prin_verm.setBackground(Color.BLACK);
																				slider_Prin_verm.setMaximum(255);
																				slider_Prin_verm.setBounds(12, 73, 200, 16);
																				slider_Prin_verm.setBackground(corFundoMenu);
																				panel_cor_principal.add(slider_Prin_verm);
																				slider_Prin_verd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																				slider_Prin_verd.addMouseListener(new MouseAdapter() {
																					@Override
																					public void mouseReleased(MouseEvent e) {
																						alteraCorPrincipal();
																					}
																				});
																				slider_Prin_verd.setMaximum(255);
																				slider_Prin_verd.setBounds(12, 125, 200, 16);
																				slider_Prin_verd.setBackground(corFundoMenu);
																				
																						panel_cor_principal.add(slider_Prin_verd);
																						slider_prin_azul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																						slider_prin_azul.addMouseListener(new MouseAdapter() {
																							@Override
																							public void mouseReleased(MouseEvent e) {
																								alteraCorPrincipal();
																							}
																						});
																						slider_prin_azul.setMaximum(255);
																						slider_prin_azul.setBounds(12, 173, 200, 16);
																						slider_prin_azul.setBackground(corFundoMenu);
																						panel_cor_principal.add(slider_prin_azul);
																						panel_cor_principal_1.setLayout(null);
																						panel_cor_principal_1.setBackground(corFundoMenu);
																						panel_cor_principal_1.setBounds(475, 151, 300, 249);
																						
																								panel_config.add(panel_cor_principal_1);
																								lblCorMenu.setHorizontalAlignment(SwingConstants.CENTER);
																								lblCorMenu.setForeground(Color.WHITE);
																								lblCorMenu.setFont(new Font("Dialog", Font.BOLD, 20));
																								lblCorMenu.setBounds(12, 12, 276, 32);
																								
																										panel_cor_principal_1.add(lblCorMenu);
																										lblVermelho_1.setForeground(Color.WHITE);
																										lblVermelho_1.setBounds(12, 56, 276, 15);
																										
																												panel_cor_principal_1.add(lblVermelho_1);
																												lblVerde_1.setForeground(Color.WHITE);
																												lblVerde_1.setBounds(12, 101, 276, 15);
																												
																														panel_cor_principal_1.add(lblVerde_1);
																														lblAzul_1.setForeground(Color.WHITE);
																														lblAzul_1.setBounds(12, 153, 276, 15);
																														
																																panel_cor_principal_1.add(lblAzul_1);
																																slider_Prin_verm_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																																slider_Prin_verm_1.addMouseListener(new MouseAdapter() {
																																	@Override
																																	public void mouseReleased(MouseEvent e) {
																																		alteraCorMenu();
																																	}
																																});
																																slider_Prin_verm_1.setMaximum(255);
																																slider_Prin_verm_1.setBackground(corFundoMenu);
																																slider_Prin_verm_1.setValue(153);
																																slider_Prin_verm_1.setBounds(12, 73, 200, 16);
																																
																																		panel_cor_principal_1.add(slider_Prin_verm_1);
																																		slider_Prin_verd_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																																		slider_Prin_verd_1.addMouseListener(new MouseAdapter() {
																																			@Override
																																			public void mouseReleased(MouseEvent e) {
																																				alteraCorMenu();
																																			}
																																		});
																																		slider_Prin_verd_1.setMaximum(255);
																																		slider_Prin_verd_1.setBackground(corFundoMenu);
																																		slider_Prin_verd_1.setValue(193);
																																		slider_Prin_verd_1.setBounds(12, 125, 200, 16);
																																		
																																				panel_cor_principal_1.add(slider_Prin_verd_1);
																																				slider_prin_azul_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
																																				slider_prin_azul_1.addMouseListener(new MouseAdapter() {
																																					@Override
																																					public void mouseReleased(MouseEvent e) {
																																						alteraCorMenu();
																																					}
																																				});
																																				slider_prin_azul_1.setMaximum(255);
																																				slider_prin_azul_1.setBackground(corFundoMenu);
																																				slider_prin_azul_1.setValue(241);
																																				slider_prin_azul_1.setBounds(12, 173, 200, 16);
																																				
																																						panel_cor_principal_1.add(slider_prin_azul_1);
																																						lblConfiguracoes.setHorizontalAlignment(SwingConstants.CENTER);
																																						lblConfiguracoes.setForeground(Color.WHITE);
																																						lblConfiguracoes.setFont(new Font("Dialog", Font.BOLD, 20));
																																						lblConfiguracoes.setBounds(12, 12, 276, 32);
																																						
																																								panel_config.add(lblConfiguracoes);

		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(0, 0, 987, 532);
		layeredPane.add(panel_2);

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
		// table_1 = new JTable(dados, colunas);
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

		/**/

		// chamaProduto();
		ativaPainel0();
	}

	public void alteraCorPrincipal() {
		r = ((slider_Prin_verm.getValue()));
		g = ((slider_Prin_verd.getValue()));
		b = ((slider_prin_azul.getValue()));
		a = ((slider_prin_trans.getValue()));
		corPrincipal = new Color(r, g, b, a);
		setBackground(corPrincipal);
		System.out.println(a);
	}

	public void alteraCorMenu() {
		rm = ((slider_Prin_verm_1.getValue()));
		gm = ((slider_Prin_verd_1.getValue()));
		bm = ((slider_prin_azul_1.getValue()));

		corFundoMenu = new Color(rm, gm, bm, am);
		pn_configuracao.setBackground(corFundoMenu);
		pn_sidebar.setBackground(corFundoMenu);
		panel_config.setBackground(corFundoMenu);

		pn_home.setBackground(corFundoMenu);
		pn_produto.setBackground(corFundoMenu);
		pn_relatorio.setBackground(corFundoMenu);
		pn_cadastro.setBackground(corFundoMenu);
		pn_configuracao.setBackground(corFundoMenu);

		panel_cor_principal_1.setBackground(corFundoMenu);
		panel_cor_principal.setBackground(corFundoMenu);

		slider_Prin_verm_1.setBackground(corFundoMenu);
		slider_Prin_verd_1.setBackground(corFundoMenu);
		slider_prin_azul_1.setBackground(corFundoMenu);

		slider_Prin_verm.setBackground(corFundoMenu);
		slider_Prin_verd.setBackground(corFundoMenu);
		slider_prin_azul.setBackground(corFundoMenu);
		slider_prin_trans.setBackground(corFundoMenu);
		
		panel_cadastro.setBackground(corFundoMenu);
		
		panel_conteiner_unidade.setBackground(corFundoMenu);
		panel_conteiner_cfop.setBackground(corFundoMenu);
		panel_conteiner_ncm.setBackground(corFundoMenu);
		panel_conteiner_empresa.setBackground(corFundoMenu);
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
		panel_cadastro.setVisible(!true);
		panel_config.setVisible(!true);

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
		panel_cadastro.setVisible(true);
	}

	private void ativaPainel4() {
		desativaPainel();
		panel_config.setVisible(true);
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
