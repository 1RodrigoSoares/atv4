package padraoVisitor;

public class AnimalSomVisitorCsv implements Visitor {

    public String exibir(Animal animal) {
        return animal.aceitar(this);
    }

    @Override
    public String exibirInfCachorro(Cachorro cachorro) {
        return "nome,raca,som\n" +
                cachorro.getNome() + "," + cachorro.getRaca() + ",Au Au!";
    }

    @Override
    public String exibirInfGato(Gato gato) {
        return "nome,idade,som\n" +
                gato.getNome() + "," + gato.getIdade() + ",Miau!";
    }

    @Override
    public String exibirInfPassaro(Passaro passaro) {
        return "nome,cor,som\n" +
                passaro.getNome() + "," + passaro.getCor() + ",Piu Piu!";
    }
}
