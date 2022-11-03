package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Tela {

	private JFrame frame;
	int xx, xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setLocationRelativeTo(null); // para centralizar o formulario
					window.frame.setVisible(true); // deixar o formulario visivel
				} catch (Exception e) {
					e.printStackTrace(); // exibe erro de execução
				}
			}
		});
	}

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
//		frame.getContentPane().setBackground(SystemColor.activeCaption); // define a cor do frame
		frame.getContentPane().setLayout(null); // define o layout do frame
		frame.setUndecorated(true); // tira a borda do frame
		frame.setBackground(new Color(0, 0, 0, 100)); // seta cor
		frame.setBounds(100, 100, 1200, 600); // define o tamanho do frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o modo como o frame fecha

		JButton btnOla = new JButton("ola");
		btnOla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBackground(new Color(200, 200,200, 100)); // seta cor
				System.out.println("ola");
			}
		});
		btnOla.setBounds(1071, 563, 117, 25);
		frame.getContentPane().add(btnOla);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 206, 600);
		panel.setBackground(new Color(153, 193, 241)); // seta cor
		panel.setLayout(null);
		frame.getContentPane().add(panel);

		JButton btnNovoProduto = new JButton("novo produto");
		btnNovoProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("produto clique");
			}
		});
		btnNovoProduto.setBounds(216, 563, 117, 25);
		frame.getContentPane().add(btnNovoProduto);

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
				 
				 
				frame.setBackground(new Color(200, 200,200, 100)); // seta cor

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
				 
				 
				frame.setBackground(new Color(255, 100,200, 100)); // seta cor

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

		JLabel lblFechar = new JLabel("X"); // cria o label
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
				xx = e.getX(); // eixo x
				xy = e.getY(); // eixo y
			}
		});
		panel.addMouseMotionListener(new MouseMotionAdapter() { // adiciona evento
			public void mouseDragged(MouseEvent arg0) { // chama evento
				int x = arg0.getXOnScreen(); //
				int y = arg0.getYOnScreen();
				frame.setLocation(x - xx, y - xy);
			}
		});

		JLabel lblHome_1 = new JLabel("HOME");
		lblHome_1.setForeground(Color.WHITE);
		lblHome_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblHome_1.setBounds(224, 0, 931, 35);
		frame.getContentPane().add(lblHome_1);

		tabela();
	}

	public void tabela() {
		// variaveis para uso da JTable
		JTable table;
		final String colunas[] = { "Nome:", "Idade:", "Sexo:" };
		final String dados[][] = { { "Jack", "19", "Masculino" }, { "Eddie", "56", "Masculino" },
				{ "Gina", "34", "Feminino" }, { "Klaus", "18", "Masculino" }, { "Erika", "20", "Feminino" },
				{ "Roberto", "29", "Masculino" }, { "Maria", "30", "Feminino" } };

		/*
		 * Construtor da classe , antes de executar o metodo main(), irá construir o
		 * JFrame e a JTable
		 */

		// instanciando a JTable
		table = new JTable(dados, colunas);
		table.setPreferredScrollableViewportSize(new Dimension(800, 300));// barra de rolagem
		table.setFillsViewportHeight(true);

		// adicionando a tabela em uma barra de rolagem, ficará envolta , pela mesma
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(234, 30, 811, 448);
		System.out.println(scrollPane.getViewport().isShowing());
		if (scrollPane.getViewport().isShowing() == true) {
			System.out.println("visivel");
			scrollPane.setVisible(false);
			frame.getContentPane().remove(scrollPane);

		} else {
			System.out.println("não visivel");
			frame.getContentPane().add(scrollPane);
		}
//		System.out.println(scrollPane.getViewport().isShowing());
		System.out.println("ola");
	}

	public void carrega() {

		System.out.println("sssssssssssssssssssssssssssssssssss");

	}
}
