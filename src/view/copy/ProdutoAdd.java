package view.copy;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ProdutoAdd extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtId;
	private JTextField txtNome;
	private JLabel lblId;
	 
	int id = 0;
	String nome = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProdutoAdd dialog = new ProdutoAdd();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProdutoAdd() {
		setAlwaysOnTop(true);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblId = new JLabel("ID");
			lblId.setVerticalAlignment(SwingConstants.BOTTOM);
			lblId.setBounds(12, 25, 70, 15);
			contentPanel.add(lblId);
		}
		{
			txtId = new JTextField();
			lblId.setLabelFor(txtId);
			txtId.setBounds(12, 43, 114, 19);
			contentPanel.add(txtId);
			txtId.setColumns(10);
		}
		{
			JLabel lblNome = new JLabel("NOME");
			lblNome.setLabelFor(txtNome);
			lblNome.setBounds(12, 80, 70, 15);
			contentPanel.add(lblNome);
		}
		{
			txtNome = new JTextField();
			txtNome.setBounds(12, 99, 426, 19);
			contentPanel.add(txtNome);
			txtNome.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						id = Integer.parseInt(txtId.getText());
						nome = txtNome.getText();
//						Produto p = new Produto(id, nome);
//						b.listaProduto.add(p);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public int r() {
		return id;
	}

	public String n() {
		return nome;

	}

}
