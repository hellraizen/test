package test;

public class Launch {

	public static void main(String[] args) {
		
		Comanda c1 = new Comanda(01, "pitu", 2.50);
		Comanda c2 = new Comanda(02, "Bhama", 5.00);
		
		Caixa ca = new Caixa(223,1000);
		
		c1.setCaixa(ca);
		c2.setCaixa(ca);
		
		ControleCaixa controle = new ControleCaixa();
		
		
		
		controle.abrirCaixa(ca);
		
		controle.entradaCaixa(c1);
		controle.entradaCaixa(c2);
		
		controle.movimentoDiario();
		
	}
}
