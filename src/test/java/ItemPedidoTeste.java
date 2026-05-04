import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ItemPedidoTeste {

    @Test
    void deveCriarItemPedidoValido() {
        Produto produto = new Produto("Café Expresso", 5.0);
        ItemPedido item = new ItemPedido(produto, 3);

        assertEquals(produto, item.getProduto());
        assertEquals(3, item.getQuantidade());

    }
    @Test
    void naoDevePermitirProdutoNulo() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new ItemPedido(null, 2)
        );

        assertEquals("Produto não pode ser nulo", exception.getMessage());
    }

    @Test
    void naoDevePermitirQuantidadeZero() {
        Produto produto = new Produto("Café Expresso", 5.0);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new ItemPedido(produto, 0)
        );

        assertEquals("Quantidade deve ser maior que zero", exception.getMessage());
    }

    @Test
    void naoDevePermitirQuantidadeNegativa() {
        Produto produto = new Produto("Café Expresso", 5.0);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new ItemPedido(produto, -1)
        );

        assertEquals("Quantidade deve ser maior que zero", exception.getMessage());
    }
}