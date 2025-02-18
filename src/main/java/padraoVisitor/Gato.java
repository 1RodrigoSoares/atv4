package padraoVisitor;

public class Gato implements Animal {
    private String nome;
    private int idade;

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirInfGato(this);
    }
}
