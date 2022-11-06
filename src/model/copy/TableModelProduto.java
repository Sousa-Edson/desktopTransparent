package model.copy;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModelProduto extends AbstractTableModel {
	public ArrayList<Produto> listaProduto;
	private String[] colunas = { "id", "nome" };

	public TableModelProduto() {
		listaProduto = new ArrayList<Produto>();
	}

	public void addProduto(Produto p) {
		this.listaProduto.add(p);

		fireTableDataChanged();
		System.out.println(p.getNome());
	}

	public void removeProduto(int rowIndex) {
		this.listaProduto.remove(rowIndex);
		fireTableDataChanged();
	}

	public Produto getpProduto(int rowIndex) {
		return this.listaProduto.get(rowIndex);

	}

	@Override
	public int getRowCount() {
		return this.listaProduto.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return this.listaProduto.get(rowIndex).getId();

		case 1:
			return this.listaProduto.get(rowIndex).getNome();

		default:
			return this.listaProduto.get(rowIndex);
		}

	}

	@Override
	public String getColumnName(int columnIndex) {
		return this.colunas[columnIndex];
	}

}
