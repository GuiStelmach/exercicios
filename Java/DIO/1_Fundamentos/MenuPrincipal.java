import areaquadrado.AreaQuadrado;
import java.util.Scanner;
import saudacao.Saudacao;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===========================");
            System.out.println("    MENU DE EXERCÍCIOS     ");
            System.out.println("===========================");
            System.out.println("1 - Saudação");
            System.out.println("2 - Área do Quadrado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Executando: Saudação ---");
                    // Instanciamos a sua classe e chamamos o método
                    Saudacao ex1 = new Saudacao();
                    ex1.executar(scanner); 
                    break;
                case 2:
                    System.out.println("\n--- Executando: Área do Quadrado ---");
                    AreaQuadrado ex2 = new AreaQuadrado();
                    ex2.executar(scanner);
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