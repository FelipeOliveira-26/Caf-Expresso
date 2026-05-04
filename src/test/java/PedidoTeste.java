import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTeste {

    @Test
    void deveCriarPedidoVazio() {
        Pedido pedido = new Pedido();

        assertEquals(0, pedido.getItens().size());
    }
}