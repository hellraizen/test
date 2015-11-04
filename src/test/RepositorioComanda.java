package test;

import java.util.ArrayList;

public class RepositorioComanda {
	private Integer indexComanda;
	private double totalAPagar;
	ArrayList<Comanda> arrayComanda;
	private Pagamentos pagamento;

	public RepositorioComanda() {
		arrayComanda = new ArrayList<Comanda>();
		indexComanda=1;
		pagamento = new Pagamentos();
	}

	public void realizarPedido(Comanda comanda) {
		comanda.setIdComanda(indexComanda);
		arrayComanda.add(comanda);
		

	}

	public void alterarPedido(Comanda idComanda) {

	}

	public Boolean cancelarPedido(Integer idComanda) {
		return true;
	}

	public Boolean finalizarPedido(Comanda comanda) {
		
		
			
			pagamento.setValorTotal( somaComanda(comanda.getIdComanda()));
			
			for (Comanda comanda1 : arrayComanda) {
				System.out.println(comanda1.toString());
			}
			
			
			indexComanda++;
			
			
			
			return true;
	
	}

	public Double somaComanda(Integer comanda) {
		for (Comanda comanda1 : arrayComanda) {
			if (comanda == comanda1.getIdComanda()) {
				totalAPagar = totalAPagar + comanda1.getValor();
				return totalAPagar;
			}
		}
		return null;
	}

}
