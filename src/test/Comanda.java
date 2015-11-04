package test;

import java.util.Date;

public class Comanda {

	private Integer idComanda;
	private Double valor;
	private String produto;
	private Date data;

	public Comanda(Integer idComanda, Double valor, String produto) {

		setIdComanda(idComanda);
		setValor(valor);
		setProduto(produto);
		//setData(data);

	}
	public Comanda( Double valor, String produto) {

		
		setValor(valor);
		setProduto(produto);
		//setData(data);

	}

	@Override
	public String toString() {
		return "Comanda [idComanda=" + idComanda + ", valor=" + valor + ", produto=" + produto + ", data=" + data + "]";
	}

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
