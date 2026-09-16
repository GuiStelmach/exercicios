package banco_simulador;

import java.util.Scanner;

public class MenuBanco {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Simulador de Banco!");
        System.out.println("Para criar uma conta, por favor, insira os seguintes dados:");
        System.out.print("Nome do titular: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do titular: ");
        String cpf = scanner.nextLine();
        System.out.print("Valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        Usuario usuario = new Usuario(nome, cpf);
        Conta conta = new Conta(usuario, "12345-6", depositoInicial);

        int opcao = 0;
        do {
            System.out.println("\n=== MENU ===:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Pagar Boleto");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Cheque Especial (Limite disponível)");
            System.out.println("6. Verificar Dívida (Uso do Cheque Especial)");
            System.out.println("7. Sair");
            System.out.print("Escolha uma operação: ");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    if (conta.depositar(valorDeposito)) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Falha no depósito. Valor inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Falha no saque. Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();
                    if (conta.pagarBoleto(valorBoleto)) {
                        System.out.println("Boleto pago com sucesso!");
                    } else {
                        System.out.println("Falha no pagamento do boleto. Saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                case 5:
                    System.out.println("Limite Cheque Especial: R$ " + conta.consultarLimiteDisponivel());
                    break;
                case 6:
                    System.out.println("Dívida Atual: R$ " + conta.getDividaChequeEspecial());
                    break;
                case 7:
                    System.out.println("Saindo do simulador...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);

        scanner.close();
    }
}