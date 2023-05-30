package br.com.unifip.prova2;

public class Veiculo {
	public String id;
	public String nome;
	public String marca;
	
	public Veiculo(String id, String nome, String marca) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
