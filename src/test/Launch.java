package test;

public class Launch {

	public static void main(String[] args) {

		ControleCaixa caixa = new ControleCaixa();
		
		caixa.abrirCaixa(1000.00);
		
		ControleComanda comanda = new ControleComanda();
		
		Produto p1 = new Produto(10.50, "Bolo");
		Produto p2 = new Produto(4.50, "pitu");
		Produto p3 = new Produto(2.50, "maca");
		Produto p4 = new Produto(1.50, "coca");
		
		Comanda co1 = new Comanda(p1.getValor(),p1.getNome());
		Comanda co2 = new Comanda(p2.getValor(),p2.getNome());
		Comanda co3 = new Comanda(p3.getValor(),p3.getNome());
		Comanda co4 = new Comanda(p4.getValor(),p4.getNome());
		
		comanda.realizarPedido(co1);
		comanda.realizarPedido(co2);
		comanda.realizarPedido(co3);
		comanda.realizarPedido(co4);
		
		Pagamentos pagamento = new Pagamentos(co1.getIdComanda(), 30.00);
		
		comanda.finalizarPedido(co1);
		
		pagamento.finalizarPedidoPago();
		
		Caixa cx = new Caixa(pagamento.getValorTotal(),0.0,pagamento.getIdComanda(),1);
		
		
		caixa.movimentoDiario();

		
		
	}
}
