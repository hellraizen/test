package test;

import java.util.Date;

public class Caixa {

	private Comanda entrada;
	private Double saida;
	private Double inicial;
	private Comanda idComanda;
	private Funcionario idFuncionario;
	private Pagamentos totalPago;
	private Date data;

	Caixa(Comanda entrada, Double saida, Double inicial, Comanda idComanda, Funcionario idFuncionario,
			Pagamentos totalPago, Date data) {
		setEntrada(entrada);
		setSaida(saida);
		setInicial(inicial);
		setIdComanda(idComanda);
		setIdFuncionario(idFuncionario);
		setTotalPago(totalPago);
		setData(data);

	}

	@Override
	public String toString() {
		return "Caixa [entrada=" + entrada + ", saida=" + saida + ", inicial=" + inicial + ", idComanda=" + idComanda
				+ ", idFuncionario=" + idFuncionario + ", totalPago=" + totalPago + ", data=" + data + "]";
	}

	public Comanda getEntrada() {
		return entrada;
	}

	public void setEntrada(Comanda entrada) {
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

	public Pagamentos getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(Pagamentos totalPago) {
		this.totalPago = totalPago;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}