package tabuada;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class TabuadaModelo {
    int numero;

    public List<Integer> calcularTabuada() {
        List<Integer> listaDeResultados = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            listaDeResultados.add(resultado);
        }
        return listaDeResultados;
    }
}

public class Tabuada {
    public void executar(Scanner scanner) {
        System.out.print("Digite um número para calcular a tabuada: ");
        int entrada = scanner.nextInt();
        TabuadaModelo tabuada = new TabuadaModelo();
        tabuada.numero = entrada;
        List<Integer> resultados = tabuada.calcularTabuada();
        System.out.println("Resultados da tabuada de " + entrada + ":");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(entrada + " x " + (i + 1) + " = " + resultados.get(i));

        }
    }
    
}
