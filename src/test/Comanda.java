package test;

public class Comanda {
	
	private Integer id;
	private String nome;
	private double valor;
	private Caixa caixa;
	
	public Caixa getCaixa() {
		return caixa;
	}


	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}


	public Comanda(Integer id,String nome, double valor){
		
		setId(id);
		setNome(nome);
		setValor(valor);
		
	}


	@Override
	public String toString() {
		return "Comanda [id=" + id + ", nome=" + nome + ", valor=" + valor + ", valorTotal=" +  "]";
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	



}
