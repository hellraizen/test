package test;

import java.util.ArrayList;

public class RepositorioComanda {
	private Integer indexComanda;
	private double totalAPagar;
	ArrayList<Comanda> arrayComanda;

	public RepositorioComanda() {
		arrayComanda = new ArrayList<Comanda>();
		indexComanda=1;
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

	public Boolean finalizarPedido(Pagamentos pagamento) {
		if(pagamento.finalizarPedidoPago()){
			
			indexComanda++;
			
			return true;
		}
		return false;
	}

	public Double somaComanda(Comanda comanda) {
		for (Comanda comanda1 : arrayComanda) {
			if (comanda.getIdComanda() == comanda1.getIdComanda()) {
				totalAPagar = totalAPagar + comanda1.getValor().getValor();
				return totalAPagar;
			}
		}
		return null;
	}

}
