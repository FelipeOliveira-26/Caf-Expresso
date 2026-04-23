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
        // Verifica se a variavel é null
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser null");
        }
        
        // Trim para limpar espaços
        String nomeLimpo = nome.trim();
        
        // Verifica se a variavel está Vazia ou contém apenas espaços 
        if (nomeLimpo.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou conter apenas espaços");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}