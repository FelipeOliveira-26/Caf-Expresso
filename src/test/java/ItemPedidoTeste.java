import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemPedidoTeste {

    @Test
    void deveCriarItemPedidoValido() {
        Produto produto = new Produto("Café Expresso", 5.0);
        ItemPedido item = new ItemPedido(produto, 3);

        assertEquals(produto, item.getProduto());
        assertEquals(3, item.getQuantidade());
    }
}