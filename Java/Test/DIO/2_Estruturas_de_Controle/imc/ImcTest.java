package imc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ImcTest {

    @Test
    void deveCalcularImc() {
        DadosImc imc = new DadosImc();
        imc.peso = 70;
        imc.altura = 1.75;

        double resultado = imc.calcularImc();

        assertEquals(22.86, resultado, 0.01);
    }
}