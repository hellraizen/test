package test;

public class Produto {
	
	private Double valor;
	private String nome;
	
	Produto (Double valor,String nome){
		setValor(valor);
		setNome(nome);
		
	}

	@Override
	public String toString() {
		return "Produto [Valor=" + valor + ", nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
