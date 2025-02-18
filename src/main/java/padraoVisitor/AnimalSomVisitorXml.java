package padraoVisitor;

public class AnimalSomVisitorXml implements Visitor {

    public String exibir(Animal animal) {
        return animal.aceitar(this);
    }

    @Override
    public String exibirInfCachorro(Cachorro cachorro) {
        return "<cachorro>\n" +
                "    <nome>" + cachorro.getNome() + "</nome>\n" +
                "    <raca>" + cachorro.getRaca() + "</raca>\n" +
                "    <som>Au Au!</som>\n" +
                "</cachorro>";
    }

    @Override
    public String exibirInfGato(Gato gato) {
        return "<gato>\n" +
                "    <nome>" + gato.getNome() + "</nome>\n" +
                "    <idade>" + gato.getIdade() + "</idade>\n" +
                "    <som>Miau!</som>\n" +
                "</gato>";
    }

    @Override
    public String exibirInfPassaro(Passaro passaro) {
        return "<passaro>\n" +
                "    <nome>" + passaro.getNome() + "</nome>\n" +
                "    <cor>" + passaro.getCor() + "</cor>\n" +
                "    <som>Piu Piu!</som>\n" +
                "</passaro>";
    }

}
