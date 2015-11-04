package test;

public class Launch {

	public static void main(String[] args) {
		
		Comanda c1 = new Comanda(01, "pitu", 2.50);
		Comanda c2 = new Comanda(01, "Bhama", 5.00);
		
	
		
		
		
		ControleCaixa controle = new ControleCaixa();
		
		
	
		
		controle.movimentoDiario();
		
	}
}
