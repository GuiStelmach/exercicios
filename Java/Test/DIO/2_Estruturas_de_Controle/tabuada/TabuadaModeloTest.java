package tabuada;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class TabuadaModeloTest {

    @Test
    void deveCalcularTabuadaDoCinco() {
        TabuadaModelo tabuada = new TabuadaModelo();
        tabuada.numero = 5;

        List<Integer> resultados = tabuada.calcularTabuada();

        assertEquals(List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50), resultados);
    }
}