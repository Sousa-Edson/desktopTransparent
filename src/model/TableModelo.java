package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelo extends AbstractTableModel {

	private ArrayList linhas = null;
	private String[] colunas = null;

	public TableModelo(ArrayList lin, String[] col) {
		setLinhas(lin);
		setColunas(col);
	}

	public ArrayList getLinhas() {
		return linhas;
	}

	public void setLinhas(ArrayList linhas) {
		this.linhas = linhas;
	}

	public String[] getColunas() {
		return colunas;
	}

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}

	public int getColumnCount() {
		return colunas.length;
	}
	@Override
	public int getRowCount() {
		return linhas.size();
	}

	public String getColumnName(int numCol) {
		return colunas[numCol];
	}

	public Object getValueAt(int numLin, int numCol) {
		try {
			Object[] linha = (Object[]) getLinhas().get(numLin);
			return linha[numCol];

		} catch (Exception err) {
			System.out.println("erro " + err);
//            JOptionPane.showMessageDialog(null, "try catch" + err);
		}
		return null;
	}


	 

}
