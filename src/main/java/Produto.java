public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        validarNome(nome);
        this.nome = nome;
        this.preco = preco;
    }
    // Validação do nome do produto 
    private void validarNome(String nome) {
        // Null check
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser null");
        }
        
        // Trim para limpar espaços
        String nomeLimpo = nome.trim();
        
        // Vazio ou só espaços
        if (nomeLimpo.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou conter apenas espaços");
        }
        
        // Tamanho mínimo
        if (nomeLimpo.length() < 3) {
            throw new IllegalArgumentException("Nome deve ter pelo menos 3 caracteres");
        }
        
        // Tamanho máximo
        if (nomeLimpo.length() > 100) {
            throw new IllegalArgumentException("Nome deve ter no máximo 100 caracteres");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}