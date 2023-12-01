public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    private String dataCadastro;

    public Produto(String nome, int quantidade, double valor, String dataCadastro) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.dataCadastro = dataCadastro;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }
}
