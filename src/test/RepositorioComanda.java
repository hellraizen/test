package test;

import java.util.ArrayList;

public class RepositorioComanda {
	private Integer indexComanda;
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

	public double finalizarPedido(Integer comanda) {
		
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Comanda Nº"+indexComanda);
		System.out.println("PEDIDOS");	
		System.out.println("----------------------------------------------------------------------------");
		
		double totalAPagar=0;
		
		for (Comanda comanda1 : arrayComanda) {
			System.out.println("Comanda numero:" +comanda);
			System.out.println("Comanda array:" +comanda1.getIdComanda());
			
			if(comanda == comanda1.getIdComanda()){
				
				System.out.print("Produto"+comanda1.getProduto() + "\t");
				System.out.println("Valor : "+comanda1.getValor());
				System.out.println(" ");
				
				totalAPagar = totalAPagar +comanda1.getValor();
				
				System.out.println("total contando     "+totalAPagar);
				System.out.println(" ");
				
			}else System.out.println("comanda n encontrada");
			
		
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Total : R$ "+ totalAPagar);	
		System.out.println("----------------------------------------------------------------------------");
			
			indexComanda++;
			
			
			
			return totalAPagar;
	
	}

	

}
