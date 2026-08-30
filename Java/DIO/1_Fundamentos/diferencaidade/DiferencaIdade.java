package diferencaidade;

import java.util.Scanner;

public class DiferencaIdade {
    public void executar(Scanner scanner) {
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.next();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.next();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.println(nome1 + " e " + nome2 + " têm uma diferença de idade de " + diferenca + " anos.");
    }
}