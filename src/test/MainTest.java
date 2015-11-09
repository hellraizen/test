package test;

public class MainTest {

	public static void main(String[] args) {
		
		ControleComanda c = new ControleComanda();
		
		Comanda pedido1 = new Comanda(10.50, "bola");
		Comanda pedido2 = new Comanda(1.00, "lapis");
		Comanda pedido3 = new Comanda(2.00, "lapis");
		Comanda pedido4 = new Comanda(2.00, "lapis");
		Comanda pedido5 = new Comanda(2.00, "lapis");
		Comanda pedido6 = new Comanda(4.00, "caneta");
		
		c.realizarPedido(pedido1);
		c.realizarPedido(pedido2);
		c.realizarPedido(pedido3);
		c.realizarPedido(pedido4);
		c.realizarPedido(pedido5);
		c.realizarPedido(pedido6);
		
		
		c.finalizarPedido(1);
		
	
		c.realizarPedido(pedido4);
		c.realizarPedido(pedido2);
		
		
		
		c.finalizarPedido(2);
		
		
	}

}
