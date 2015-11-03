package test;

public class Caixa {
	private Integer idCaixa;
	private double dinheiroCaixa;
	private double saldoCaixa;
	
	
	

	Caixa(Integer idCaixa, double dinheiroCaixa) {
		setIdCaixa(idCaixa);
		setDinheiroCaixa(dinheiroCaixa);

	}

	@Override
	public String toString() {
		return "Caixa [idCaixa=" + idCaixa + ", dinheiroCaixa=" + dinheiroCaixa + ", saldoCaixa=" + saldoCaixa
				+ ", entradaCaixa=" + ", saidaCaixa=" +  "]";
	}

	public Integer getIdCaixa() {
		return idCaixa;
	}

	public void setIdCaixa(Integer idCaixa) {
		this.idCaixa = idCaixa;
	}

	public double getDinheiroCaixa() {
		return dinheiroCaixa;
	}

	public void setDinheiroCaixa(double dinheiroCaixa) {
		this.dinheiroCaixa = dinheiroCaixa;
	}

	public double getSaldoCaixa() {
		return saldoCaixa;
	}

	public void setSaldoCaixa(double saldoCaixa) {
		this.saldoCaixa = saldoCaixa;
	}





}