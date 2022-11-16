package controller;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.ModeloTabela;
import model.Unidade;
import model.dao.UnidadeDao;
import view.UnidadeDialog;

public class UnidadeController {
	private UnidadeDialog view;

	Unidade unidade = new Unidade();
	UnidadeDao dao = new UnidadeDao();

	public UnidadeController(UnidadeDialog view) {
		this.view = view;
	}

	public void LoadTable() { // AQUI CARREGA A TABELA
		DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
		centralizado.setHorizontalAlignment(SwingConstants.CENTER);
		String[] colunas = new String[] { "", "ID ", "SIGLA", "DESCRIÇÃO" };
		ArrayList dados;
		dados = (ArrayList) dao.PreencheTabelaB(null);
		ModeloTabela modelo = new ModeloTabela(dados, colunas); // AQUI MODELO SIMPLES DE TABELA
		view.getTable().setModel(modelo);
		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modelo);
		view.getTable().setRowSorter(sorter);
		view.getTable().getColumnModel().getColumn(0).setMaxWidth(3);
		view.getTable().getColumnModel().getColumn(0).setResizable(false);
		view.getTable().getColumnModel().getColumn(0).setCellRenderer(centralizado);
		view.getTable().getColumnModel().getColumn(1).setPreferredWidth(1);
		view.getTable().getColumnModel().getColumn(1).setResizable(false);
		view.getTable().getColumnModel().getColumn(2).setPreferredWidth(10);
		view.getTable().getColumnModel().getColumn(3).setPreferredWidth(150);
		view.getTable().getTableHeader().setReorderingAllowed(false);
		view.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

	public void LimpaCampos() {
		view.getTxtId().setText("0");
		view.getTxtUn().setText(null);
		view.getTxtUn().requestFocus();
		view.getTxtDesc().setText(null);
	}

	public void Save() {
		String uni=view.getTxtUn().getText(),desc=view.getTxtDesc().getText();
		int id = Integer.parseInt(view.getTxtId().getText().trim());
		unidade.setDescricao(desc);
		unidade.setUn(uni);
		if(uni.trim().length() >= 2 && desc.trim().length() >= 2 ) {
		if (id != 0) {
			unidade.setId(id);
			dao.editar(unidade);
		} else {
			dao.salvar(unidade);
		}
		LoadTable();
		LimpaCampos();}
	}

	public void cliqueTabela(MouseEvent e) {
		TableColumnModel colModel = view.getTable().getColumnModel();
		if (e.getClickCount() == 2) {
			int vColIndex = colModel.getColumnIndexAtX(e.getX());
			int idModel = (int) view.getTable().getValueAt(view.getTable().getSelectedRow(), 1);
			if (vColIndex == 0) {
				Object[] options = { "Sim", "Não" };
				int op = JOptionPane.showOptionDialog(null, "DesejaAtivar/Desativar este item?",
						"Ativar/Desativar item", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						options, options[1]);
				System.out.println(op);
				String estado = "" + view.getTable().getValueAt(view.getTable().getSelectedRow(), 0);
				if (op == 0) {
					dao.onUnidade(estado, idModel);
					LoadTable();
					LimpaCampos();
				}
			} else {
				view.getTxtId().setText("" + idModel);
				view.getTxtUn().setText("" + view.getTable().getValueAt(view.getTable().getSelectedRow(), 2));
				view.getTxtUn().requestFocus();
				view.getTxtDesc().setText("" + view.getTable().getValueAt(view.getTable().getSelectedRow(), 3));
			}
		}
	}
}
