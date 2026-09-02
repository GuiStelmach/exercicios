import java.util.Scanner;
import tabuada.Tabuada;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===========================");
            System.out.println("    MENU DE EXERCÍCIOS     ");
            System.out.println("===========================");
            System.out.println("1 - Tabuada");
            System.out.println("2 - EM BREVE");
            System.out.println("3 - EM BREVE");
            System.out.println("4 - EM BREVE");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Executando: Tabuada ---");
                    Tabuada ex1 = new Tabuada();
                    ex1.executar(scanner); 
                    break;
                case 2:
                    System.out.println("\n--- Em Breve ---");
                    break;
                case 3:
                    System.out.println("\n--- Em Breve ---");
                    break;
                case 4:
                    System.out.println("\n--- Em Breve ---");
                    break;
                case 0:
                    System.out.println("\nSaindo... Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
            System.out.println();
            
        } while (opcao != 0);

        scanner.close();
    }
}