package padraoVisitor;

public class AnimalSomVisitorJson implements Visitor {

    public String exibir(Animal animal) {
        return animal.aceitar(this);
    }

    @Override
    public String exibirInfCachorro(Cachorro cachorro) {
        return "{" +
                "\"nome\": \"" + cachorro.getNome() + "\"," +
                "\"raca\": \"" + cachorro.getRaca() + "\"," +
                "\"som\": \"Au Au!\"" +
                "}";
    }

    @Override
    public String exibirInfGato(Gato gato) {
        return "{" +
                "\"nome\": \"" + gato.getNome() + "\"," +
                "\"idade\": " + gato.getIdade() + "," +
                "\"som\": \"Miau!\"" +
                "}";
    }

    @Override
    public String exibirInfPassaro(Passaro passaro) {
        return "{" +
                "\"nome\": \"" + passaro.getNome() + "\"," +
                "\"cor\": \"" + passaro.getCor() + "\"," +
                "\"som\": \"Piu Piu!\"" +
                "}";
    }
}
