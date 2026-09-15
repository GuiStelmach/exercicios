package divisivel;

import java.util.Scanner;

public class Divisivel {
    public void executar(Scanner scanner) {
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            

            while (true) {
                System.out.print("Digite um novo número: ");
                int segundoNumero = scanner.nextInt();

                if (segundoNumero < primeiroNumero) {
                    System.out.println("Este número é menor que o primeiro número. Ignorado.");
                    continue;
                }

                if (segundoNumero % primeiroNumero != 0) {
                    System.out.println("Este número não é divisível pelo primeiro número. Encerrando o loop.");
                    break;
                } else {
                    System.out.println("Este número é divisível pelo primeiro número. Continuando...");
                }
            }
    }

}
