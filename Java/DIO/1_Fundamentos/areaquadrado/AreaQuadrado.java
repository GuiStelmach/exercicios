package areaquadrado;

import java.util.Scanner;

public class AreaQuadrado {
    
    public void executar(Scanner scanner) {
        System.out.print("Digite o lado do quadrado: ");
        String entrada = scanner.nextLine().trim().replace(',', '.');
        double lado = Double.parseDouble(entrada);
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }
}