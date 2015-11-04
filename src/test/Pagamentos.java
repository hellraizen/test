package test;

public class Pagamentos {

	private Integer idComanda;
	private Double valorTotal;
	private Double totalPago;

	public Pagamentos() {

	}

	public Pagamentos(Integer idComanda, Double totalPago) {

		setIdComanda(idComanda);
		setTotalPago(totalPago);

	}

	public Pagamentos(Integer idComanda, Double valorTotal, Double totalPago) {

		setIdComanda(idComanda);
		setValorTotal(valorTotal);
		setTotalPago(totalPago);

	}

	public Integer getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}

	public Boolean finalizarPedidoPago() {
		Double troco = valorTotal - totalPago;
		System.out.println();
		if (troco >= 0)
			return true;
		return false;

	}

}
