package model;

import java.util.ArrayList;

public class ProdutoRepository {
	public ArrayList<Produto> listaProduto;

	public ProdutoRepository() {
		listaProduto = new ArrayList<Produto>();
	}

	public ArrayList<Produto> LoadTable() {
		ArrayList dados = new ArrayList();
		try {
			for (Produto produto : listaProduto) {
				dados.add(new Object[] { produto.getId(), produto.getNome() });
			}
		} catch (Exception e) {
			System.out.println("erro ao carregar " + e);
		}

		return dados;
	}

	public void tamanho() {
		System.out.println("tamanho em ProdutoRepository " + listaProduto.size());
	}

	public void addProduto(Produto p) {
		this.listaProduto.add(p);
		tamanho();

		System.out.println(p.getNome());
	}

	public void removeProduto(int rowIndex) {
		this.listaProduto.remove(rowIndex);
	}

	public Produto getpProduto(int rowIndex) {
		return this.listaProduto.get(rowIndex);

	}

}
