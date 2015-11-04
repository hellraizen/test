package test;

import java.util.Date;

public class Caixa {

	private Double entrada;
	private Double saida;
	private Double inicial;
	private Integer idComanda;
	private Integer idFuncionario;
	private Double totalPago;
	private Date data;

	public Caixa(Double entrada, Double saida, Integer idComanda, Integer idFuncionario) {
		setEntrada(entrada);
		setSaida(saida);
		setIdComanda(idComanda);
		setIdFuncionario(idFuncionario);
		//setData(data);

	}

	public Double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public Double getSaida() {
		return saida;
	}

	public void setSaida(Double saida) {
		this.saida = saida;
	}

	public Double getInicial() {
		return inicial;
	}

	public void setInicial(Double inicial) {
		this.inicial = inicial;
	}

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public Double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}