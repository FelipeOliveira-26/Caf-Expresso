import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ProdutoTeste {

    @Test
    void deveCriarProdutoComNomeEPrecoValidos() {
        Produto produto = new Produto("Cafe Expresso", 5.00);

        assertEquals("Cafe Expresso", produto.getNome());
        assertEquals(5.00, produto.getPreco(), 0.001);
    }
     
    //Testes da validação do nome do produto
@Test
void nomeNullDeveFalhar() {
    assertThrows(IllegalArgumentException.class, 
        () -> new Produto(null, 5.0));
}

@Test
void nomeVazioDeveFalhar() {
    assertThrows(IllegalArgumentException.class, 
        () -> new Produto("", 5.0));
}

@Test
void nomeApenasEspacosDeveFalhar() {
    assertThrows(IllegalArgumentException.class, 
        () -> new Produto("   ", 5.0));
}

@Test
void nomeComEspacosDeveSerLimpo() {
    Produto p = new Produto("  Cafe  ", 5.0);
    assertEquals("Cafe", p.getNome());
}


   // Testes de validção do preço do produto 
   
 @Test
    void naoDevePermitirPrecoZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("Cafe", 0.0);
        });
    }

    @Test
    void naoDevePermitirPrecoNegativo() {
        assertThrows(IllegalArgumentException.class,
                () -> new Produto("Cafe", -10.0));
    }


}