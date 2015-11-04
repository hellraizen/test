package test;

import java.util.ArrayList;

public class RepositorioCaixa {

	private ArrayList<Caixa> arrayCaixa;
	
	private boolean caixa= false;
	private double totalCaixa;

	public RepositorioCaixa() {


		arrayCaixa = new ArrayList<Caixa>();
	}

	public boolean abrirCaixa(Caixa dinheiroCaixa) {
		if (dinheiroCaixa.getInicial() > 0 && caixa==false) {
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

	public void entradaCaixa(Caixa entradaCaixa) {
		if(caixa){
			arrayCaixa.add(entradaCaixa);
			
			totalCaixa= totalCaixa + entradaCaixa.getEntrada().getProduto().getValor();
			
		}else System.out.println("O caixa esta fechado");
		
		
	}

	public void saidaCaixa(Caixa saidaCaixa) {
		if(caixa){
		
		}
	}

	public ArrayList<Caixa> movimentoDiario() {
	
	
		for (Caixa caixa : arrayCaixa) {
			System.out.println(caixa.toString());
		}
		return arrayCaixa ;
	}

}
