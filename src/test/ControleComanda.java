package test;

public class ControleComanda {
	
	private RepositorioComanda repositoriComanda;
	
	public ControleComanda(){
		repositoriComanda = new RepositorioComanda();
	}

	public void realizarPedido(Comanda comanda){
		
	}
	public void alterarPedido(Comanda idComanda){
		
	}
	public Boolean cancelarPedido(Integer idComanda){
		return true;
	}
	public Boolean finalizarPedido(Pagamentos pagamento){
		return true;
	}
	
	
	
}
