package test;

import java.util.ArrayList;

public class RepositorioCaixa {

	private ArrayList<Caixa> arrayEntrada;
	
	private boolean caixa= false;
	private double entrada;
	private double saida;
	private double totalCaixa;

	public RepositorioCaixa() {


		arrayEntrada = new ArrayList<Caixa>();
	}

	public boolean abrirCaixa(Caixa dinheiroCaixa) {
		if (dinheiroCaixa.getDinheiroCaixa() > 0 && caixa==false) {
			caixa = true;
			return true;
		}
		return false;
	}

	public boolean fecharCaixa() {
		if (caixa) {
			caixa = false;
		}
		return true;
	}

	public void entradaCaixa(Comanda entradaCaixa) {
		if(caixa){
			entrada= entrada+ entradaCaixa.getValor();
			entradaCaixa.getCaixa().setSaldoCaixa(entrada);
			arrayEntrada.add(entradaCaixa.getCaixa());
			
		}
		
		
	}

	public void saidaCaixa(double saidaCaixa) {
		if(caixa){
			saida = saida + saidaCaixa;
			//arrayEntrada.add(saidaCaixa);
		}
	}

	public ArrayList<Caixa> movimentoDiario() {
		totalCaixa= entrada-saida;
		System.out.println(totalCaixa);
		for (Caixa caixa : arrayEntrada) {
			System.out.println(caixa.toString());
		}
		return arrayEntrada ;
	}

}
