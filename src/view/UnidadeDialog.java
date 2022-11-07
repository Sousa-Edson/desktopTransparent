package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UnidadeDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

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
		setResizable(false);
		setAlwaysOnTop(true);
		setModal(true);
		setTitle("UNIDADE");
		setBounds(100, 100, 378, 385);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblId = new JLabel("ID");
			lblId.setHorizontalAlignment(SwingConstants.CENTER);
			lblId.setBounds(12, 12, 70, 15);
			contentPanel.add(lblId);
		}
		{
			JLabel lblUn = new JLabel("UN");
			lblUn.setHorizontalAlignment(SwingConstants.CENTER);
			lblUn.setBounds(94, 12, 92, 15);
			contentPanel.add(lblUn);
		}
		{
			JLabel lblDescrio = new JLabel("DESCRIÇÃO");
			lblDescrio.setHorizontalAlignment(SwingConstants.CENTER);
			lblDescrio.setBounds(208, 12, 152, 15);
			contentPanel.add(lblDescrio);
		}
		{
			textField = new JTextField();
			textField.setBounds(12, 28, 70, 19);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(94, 28, 92, 19);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(200, 28, 160, 19);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 297, 338, -250);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.setBounds(22, 59, 1, 1);
		contentPanel.add(table);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Adicionar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Deletar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
