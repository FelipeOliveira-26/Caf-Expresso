import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoTeste {

    @Test
    void deveCriarProdutoComNomeEPrecoValidos() {
        Produto produto = new Produto("Café Expresso", 5.00);

        assertEquals("Café Expresso", produto.getNome());
        assertEquals(5.00, produto.getPreco());
    }

    @Test 
    void deveLançarExcecaoQuandoNomeForInvalido(){

    }

}