import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void deveCalcularTotalDoPedido() {
        Pedido pedido = new Pedido();

        Produto cafe = new Produto("Café Expresso", 5.0);
        Produto cappuccino = new Produto("Cappuccino", 8.0);

        ItemPedido item1 = new ItemPedido(cafe, 2);       // 10
        ItemPedido item2 = new ItemPedido(cappuccino, 1); // 8

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        assertEquals(18.0, pedido.calcularTotal());
    }

    @Test
    void naoDevePermitirAdicionarItemNulo() {
        Pedido pedido = new Pedido();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> pedido.adicionarItem(null)
        );

        assertEquals("Item não pode ser nulo", exception.getMessage());
    }
}