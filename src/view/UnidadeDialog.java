package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controller.UnidadeController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UnidadeDialog extends JDialog {

	private final UnidadeController controller;

	private final JPanel contentPanel = new JPanel();
	JPanel buttonPane;
	private JTextField txtId;
	private JTextField txtUn;
	private JTextField txtDesc;
	private JTable table;
	  Color CorFundo;
//	private ModeloTabela model = new ModeloTabela();
//	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UnidadeDialog dialog = new UnidadeDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UnidadeDialog() {
		CorFundo = UIManager.getColor("Button.select");
		controller = new UnidadeController(this);
		setBackground(CorFundo);
		getContentPane().setBackground(CorFundo);
		setResizable(false);
		setAlwaysOnTop(true);
		setModal(true);
		setTitle("UNIDADE");
		setBounds(100, 100, 378, 385);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(CorFundo);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblId = new JLabel("ID");
			lblId.setForeground(Color.WHITE);
			lblId.setHorizontalAlignment(SwingConstants.CENTER);
			lblId.setBounds(12, 12, 70, 15);
			contentPanel.add(lblId);
		}
		{
			JLabel lblUn = new JLabel("UN");
			lblUn.setForeground(Color.WHITE);
			lblUn.setHorizontalAlignment(SwingConstants.CENTER);
			lblUn.setBounds(94, 12, 92, 15);
			contentPanel.add(lblUn);
		}
		{
			JLabel lblDescrio = new JLabel("DESCRIÇÃO");
			lblDescrio.setForeground(Color.WHITE);
			lblDescrio.setHorizontalAlignment(SwingConstants.CENTER);
			lblDescrio.setBounds(208, 12, 152, 15);
			contentPanel.add(lblDescrio);
		}
		{
			txtId = new JTextField();
			txtId.setText("0");
			txtId.setEditable(false);
			txtId.setBounds(12, 28, 70, 19);
			contentPanel.add(txtId);
			txtId.setColumns(10);
		}
		{
			txtUn = new JTextField();
			txtUn.setBounds(94, 28, 92, 19);
			contentPanel.add(txtUn);
			txtUn.setColumns(10);
		}
		{
			txtDesc = new JTextField();
			txtDesc.setBounds(200, 28, 160, 19);
			contentPanel.add(txtDesc);
			txtDesc.setColumns(10);
		}

		JScrollPane scrollPane = new JScrollPane();
		 
		scrollPane.setBounds(22, 75, 330, 230);
		contentPanel.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.cliqueTabela(e);
			}
		});
		scrollPane.setViewportView(table);

		{
			  buttonPane = new JPanel();
			buttonPane.setBackground(CorFundo);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Adicionar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						controller.Save();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Deletar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						controller.LoadTable();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}

	}

	public void recebeCor(int r,int g , int b) {
		CorFundo = new Color(r, g, b);
		setBackground(CorFundo);
		getContentPane().setBackground(CorFundo);
		contentPanel.setBackground(CorFundo);
		buttonPane.setBackground(CorFundo);
		System.out.println("cor");
	}

	public UnidadeController getController() {
		return controller;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

 

	public JTextField getTxtId() {
		return txtId;
	}

	public JTextField getTxtUn() {
		return txtUn;
	}

	public JTextField getTxtDesc() {
		return txtDesc;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

}
