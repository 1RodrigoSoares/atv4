package padraoVisitor;

public class Passaro implements Animal {
    private String nome;
    private String cor;

    public Passaro(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirInfPassaro(this);
    }
}
