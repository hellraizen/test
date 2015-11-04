package test;

import java.util.Date;

public class Comanda {

	private Integer idComanda;
	private Produto valor;
	private Produto produto;
	private Date data;

	public Comanda(Integer idComanda, Produto valor, Produto produto, Date data) {

		setIdComanda(idComanda);
		setValor(valor);
		setProduto(produto);
		setData(data);

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

	public Produto getValor() {
		return valor;
	}

	public void setValor(Produto valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
