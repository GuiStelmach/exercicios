package imc;

import java.util.Scanner;

class DadosImc {
    double peso;
    double altura;
}

public class Imc {
    public void executar(Scanner scanner) {
        DadosImc dados = new DadosImc();

        System.out.print("Digite seu peso (kg): ");
        dados.peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        dados.altura = scanner.nextDouble();

        double imc = dados.peso / (dados.altura * dados.altura);

        if (imc < 18.5) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("- Abaixo do peso");
        } else if (imc >= 18.6 && imc < 24.9) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("- Peso ideal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("- Levemente acima do peso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("- Obesidade Grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("- Obesidade Grau II (Severa)");
        } else {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("- Obesidade Grau III (Mórbida)");
        }
    }

}