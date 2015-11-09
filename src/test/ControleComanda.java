package test;

public class ControleComanda {

	private RepositorioComanda repositorioComanda;

	public ControleComanda() {
		repositorioComanda = new RepositorioComanda();
	}

	public void realizarPedido(Comanda comanda) {
		repositorioComanda.realizarPedido(comanda);

	}

	public void alterarPedido(Comanda idComanda) {
		repositorioComanda.alterarPedido(idComanda);

	}

	public Boolean cancelarPedido(Integer idComanda) {

		return repositorioComanda.cancelarPedido(idComanda);
	}

	public double finalizarPedido(Integer comanda) {
		return repositorioComanda.finalizarPedido(comanda);
	}

}
