package model.copy;

import java.util.ArrayList;

public class ProdutoRepository {
	public ArrayList<Produto> listaProduto;

	public ProdutoRepository() {
		listaProduto = new ArrayList<Produto>();
	}

	public void addProduto(Produto p) {
		this.listaProduto.add(p);

//		fireTableDataChanged();
		System.out.println(p.getNome());
	}

	public void removeProduto(int rowIndex) {
		this.listaProduto.remove(rowIndex);
//		fireTableDataChanged();
	}

	public Produto getpProduto(int rowIndex) {
		return this.listaProduto.get(rowIndex);

	}

}
