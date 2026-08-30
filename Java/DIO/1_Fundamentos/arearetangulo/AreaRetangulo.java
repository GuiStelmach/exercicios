package arearetangulo;

import java.util.Scanner;

public class AreaRetangulo {
    public void executar(Scanner scanner) {
        System.out.print("Digite a base do retângulo: ");
        String entradaBase = scanner.nextLine().trim().replace(',', '.');
        double base = Double.parseDouble(entradaBase);

        System.out.print("Digite a altura do retângulo: ");
        String entradaAltura = scanner.nextLine().trim().replace(',', '.');
        double altura = Double.parseDouble(entradaAltura);

        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}