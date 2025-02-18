package padraoVisitor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnimalSomVisitorTests {
    @Test
    void deveExibirCachorroJson() {
        Cachorro cachorro = new Cachorro("Teddy", "Dashshound");

        AnimalSomVisitorJson visitor = new AnimalSomVisitorJson();
        String esperado = "{"
                + "\"nome\": \"Teddy\","
                + "\"raca\": \"Dashshound\","
                + "\"som\": \"Au Au!\""
                + "}";

        assertEquals(esperado,visitor.exibir(cachorro));
    }

    @Test
    void deveExibirCachorroCsv() {
        Cachorro cachorro = new Cachorro("Teddy", "Dashshound");

        AnimalSomVisitorCsv visitor = new AnimalSomVisitorCsv();
        String esperado = "nome,raca,som\nTeddy,Dashshound,Au Au!";

        assertEquals(esperado, visitor.exibir(cachorro));
    }

    @Test
    void deveExibirCachorroXml() {
        Cachorro cachorro = new Cachorro("Teddy", "Dashshound");

        AnimalSomVisitorXml visitor = new AnimalSomVisitorXml();
        String esperado = "<cachorro>\n"
                + "    <nome>Teddy</nome>\n"
                + "    <raca>Dashshound</raca>\n"
                + "    <som>Au Au!</som>\n"
                + "</cachorro>";

        assertEquals(esperado, visitor.exibir(cachorro));
    }

    @Test
    void deveExibirGatoCsv() {
        Gato gato = new Gato("frajoula", 3);

        AnimalSomVisitorCsv visitor = new AnimalSomVisitorCsv();
        String esperado = "nome,idade,som\nfrajoula,3,Miau!";

        assertEquals(esperado,visitor.exibir(gato));
    }

    @Test
    void deveExibirGatoJson() {
        Gato gato = new Gato("frajoula", 3);

        AnimalSomVisitorJson visitor = new AnimalSomVisitorJson();
        String esperado = "{"
                + "\"nome\": \"frajoula\","
                + "\"idade\": 3,"
                + "\"som\": \"Miau!\""
                + "}";

        assertEquals(esperado, visitor.exibir(gato));
    }

    @Test
    void deveExibirGatoXml() {
        Gato gato = new Gato("frajoula", 3);

        AnimalSomVisitorXml visitor = new AnimalSomVisitorXml();
        String esperado = "<gato>\n"
                + "    <nome>frajoula</nome>\n"
                + "    <idade>3</idade>\n"
                + "    <som>Miau!</som>\n"
                + "</gato>";

        assertEquals(esperado, visitor.exibir(gato));
    }

    @Test
    void deveExibirPassaroXml() {
        Passaro passaro = new Passaro("Blu", "Azul");

        AnimalSomVisitorXml visitor = new AnimalSomVisitorXml();
        String esperado = "<passaro>\n"
                + "    <nome>Blu</nome>\n"
                + "    <cor>Azul</cor>\n"
                + "    <som>Piu Piu!</som>\n"
                + "</passaro>";

        assertEquals(esperado,visitor.exibir(passaro));
    }

    @Test
    void deveExibirPassaroJson() {
        Passaro passaro = new Passaro("Blu", "Azul");

        AnimalSomVisitorJson visitor = new AnimalSomVisitorJson();
        String esperado = "{"
                + "\"nome\": \"Blu\","
                + "\"cor\": \"Azul\","
                + "\"som\": \"Piu Piu!\""
                + "}";

        assertEquals(esperado, visitor.exibir(passaro));
    }

    @Test
    void deveExibirPassaroCsv() {
        Passaro passaro = new Passaro("Blu", "Azul");

        AnimalSomVisitorCsv visitor = new AnimalSomVisitorCsv();
        String esperado = "nome,cor,som\nBlu,Azul,Piu Piu!";

        assertEquals(esperado, visitor.exibir(passaro));
    }
}
