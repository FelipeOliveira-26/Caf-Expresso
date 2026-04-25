public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        validarNome(nome);
        validarPreco(preco);
        this.nome = nome.trim();
        this.preco = preco;
    }


    // Validação do nome do produto 
    private void validarNome(String nome) {

        // Verifica se a variavel é null
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        
        // Trim para limpar espaços
        String nomeLimpo = nome.trim();
        
        // Verifica se a variavel está Vazia ou contém apenas espaços 
        if (nomeLimpo.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou conter apenas espaços");
        }

       
    }
    
    // Validação do preço do produto
    private void validarPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero");
        }
    }
    

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}