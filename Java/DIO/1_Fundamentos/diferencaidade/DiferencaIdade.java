package diferencaidade;

import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
}

public class DiferencaIdade {
    public void executar(Scanner scanner) {
        Pessoa pessoa1 = new Pessoa();
        System.out.print("Digite o nome da primeira pessoa: ");
        pessoa1.nome = scanner.next();

        System.out.print("Digite a idade da primeira pessoa: ");
        pessoa1.idade = scanner.nextInt();

        Pessoa pessoa2 = new Pessoa();
        System.out.print("Digite o nome da segunda pessoa: ");
        pessoa2.nome = scanner.next();

        System.out.print("Digite a idade da segunda pessoa: ");
        pessoa2.idade = scanner.nextInt();

        int diferenca = Math.abs(pessoa1.idade - pessoa2.idade);
        System.out.println(pessoa1.nome + " e " + pessoa2.nome + " têm uma diferença de idade de " + diferenca + " anos.");
    }
}