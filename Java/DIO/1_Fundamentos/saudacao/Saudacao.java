package saudacao;
import java.time.LocalDate;
import java.util.Scanner;


class Pessoa {
    String nome;
    int idade;

    public void identificar() {
        System.out.println("Olá " + nome + " você tem " + idade + " anos");
    }
}

public class Saudacao {
    public void executar(Scanner scanner) {
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        pessoa.idade = anoAtual - anoNascimento;

        pessoa.identificar();
    }
}