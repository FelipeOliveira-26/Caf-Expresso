import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTeste {

    @Test
    void deveCriarPedidoVazio() {
        Pedido pedido = new Pedido();

        assertEquals(0, pedido.getItens().size());
    }

    @Test
    void deveAdicionarItemAoPedido() {
        Pedido pedido = new Pedido();

        Produto produto = new Produto("Café Expresso", 5.0);
        ItemPedido item = new ItemPedido(produto, 2);

        pedido.adicionarItem(item);

        assertEquals(1, pedido.getItens().size());
        assertEquals(item, pedido.getItens().get(0));
    }
}