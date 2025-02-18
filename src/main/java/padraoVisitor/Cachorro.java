package padraoVisitor;

public class Cachorro implements Animal {
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirInfCachorro(this);
    }
}
