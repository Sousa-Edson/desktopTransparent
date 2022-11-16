package model;

public class Unidade {
	int id;
	String un;
	String descricao;

	public Unidade() {

	}

	public Unidade(String un, String descricao) {
		this.un = un;
		this.descricao = descricao;
	}

	public Unidade(int id, String un, String descricao) {

		this.id = id;
		this.un = un;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un.toUpperCase();
	}

	public String getDescricao() {
		return descricao.toUpperCase();
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
