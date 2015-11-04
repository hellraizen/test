package test;

import java.util.Date;

public class Caixa {

	private Pagamentos entrada;
	private Double saida;
	private Double inicial;
	private Comanda idComanda;
	private Funcionario idFuncionario;
	private Double totalPago;
	private Date data;

	Caixa(Pagamentos entrada, Double saida, Double inicial, Comanda idComanda, Funcionario idFuncionario,
			Double totalPago, Date data) {
		setEntrada(entrada);
		setSaida(saida);
		setInicial(inicial);
		setIdComanda(idComanda);
		setIdFuncionario(idFuncionario);
		setTotalPago(totalPago);
		setData(data);

	}

	public Pagamentos getEntrada() {
		return entrada;
	}

	public void setEntrada(Pagamentos entrada) {
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

	public Comanda getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Comanda idComanda) {
		this.idComanda = idComanda;
	}

	public Funcionario getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Funcionario idFuncionario) {
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