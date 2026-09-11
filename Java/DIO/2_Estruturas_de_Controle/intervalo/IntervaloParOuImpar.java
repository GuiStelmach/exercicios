package intervalo;

import java.util.InputMismatchException;
import java.util.Scanner;

class ModeloIntervalo {

    int primeiroNumero;
    int segundoNumero;
    int parOuImpar;

    public void identificar() {

        if (parOuImpar == 1) {
            System.out.println("Números pares no intervalo de "
                    + segundoNumero + " a " + primeiroNumero + ":");

            for (int i = segundoNumero; i >= primeiroNumero; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("Não há números pares no intervalo de " + segundoNumero + " a " + primeiroNumero);
                }
            }

        } else if (parOuImpar == 2) {
            System.out.println("Números ímpares no intervalo de "
                    + segundoNumero + " a " + primeiroNumero + ":");

            for (int i = segundoNumero; i >= primeiroNumero; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("Não há números ímpares no intervalo de " + segundoNumero + " a " + primeiroNumero);
                }
            }
        }

        System.out.println();
    }
}

public class IntervaloParOuImpar {

    public void executar(Scanner scanner) {

        ModeloIntervalo modelo = new ModeloIntervalo();

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite o primeiro número: ");
                modelo.primeiroNumero = scanner.nextInt();

                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número inteiro.");
                scanner.nextLine();
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite o segundo número: ");
                modelo.segundoNumero = scanner.nextInt();

                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número inteiro.");
                scanner.nextLine();
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("== Identificar Par ou Ímpar ==\n");
                System.out.print("1 - Par\n");
                System.out.print("2 - Ímpar\n");

                modelo.parOuImpar = scanner.nextInt();

                if (modelo.parOuImpar == 1 || modelo.parOuImpar == 2) {
                    entradaValida = true;
                } else {
                    System.out.println("Erro: digite apenas 1 ou 2.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número inteiro.");
                scanner.nextLine();
            }
        }

        modelo.identificar();
    }
}