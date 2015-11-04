package test;

import java.util.ArrayList;

public class ControleCaixa {

	private RepositorioCaixa repositorioCaixa;

	public ControleCaixa() {
		repositorioCaixa = new RepositorioCaixa();
	}

	public boolean abrirCaixa(Caixa dinheiroCaixa) {
		return repositorioCaixa.abrirCaixa(dinheiroCaixa);
	}

	public boolean fecharCaixa() {
		return repositorioCaixa.fecharCaixa();
	}

	public void entradaCaixa(Caixa entradaCaixa) {
		repositorioCaixa.entradaCaixa(entradaCaixa);
	}

	public void saidaCaixa(Caixa saidaCaixa) {
		repositorioCaixa.saidaCaixa(saidaCaixa);
	}

	public ArrayList<Caixa> movimentoDiario() {
		return repositorioCaixa.movimentoDiario();
	}
}
