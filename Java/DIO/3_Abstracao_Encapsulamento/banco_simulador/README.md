# ☕ Simulador de Conta Bancária

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa simula uma conta bancária com saldo, cheque especial, depósitos, saques, pagamento de boleto e consulta de informações da conta.

## 📚 Objetivo

- Criar uma conta com titular, CPF e valor inicial de depósito.
- Controlar o saldo da conta.
- Permitir depósitos e saques.
- Utilizar o cheque especial quando o saldo não for suficiente.
- Cobrar taxa de uso do cheque especial quando houver dívida.
- Exibir informações relevantes do estado da conta.

## 🧩 Estrutura do código

### Classe `Usuario`

Representa o titular da conta. Ela possui:

- `nome`: nome do cliente.
- `cpf`: documento do cliente.
- Métodos `getNome()` e `getCpf()` para acesso aos dados.

### Classe `Conta`

Responsável pela lógica bancária. Ela possui:

- `titular`: referência ao usuário da conta.
- `numeroConta`: identificador da conta.
- `saldo`: valor disponível em conta.
- `limiteChequeEspecial`: limite disponível do cheque especial.
- `dividaChequeEspecial`: valor ainda pendente do cheque especial.
- `depositar(double valor)`: realiza um depósito válido.
- `sacar(double valor)`: realiza saque com saldo ou cheque especial.
- `pagarBoleto(double valor)`: chama o saque para pagar um boleto.
- `consultarLimiteDisponivel()`: retorna o valor restante do cheque especial.
- `getSaldo()`, `getLimiteChequeEspecial()` e `getDividaChequeEspecial()`: acessam informações da conta.

### Classe `MenuBanco`

Responsável pela interação com o usuário no console. Ela:

- solicita nome, CPF e depósito inicial;
- cria a conta e o usuário;
- apresenta um menu com opções de depósito, saque, boleto, saldo e cheque especial;
- executa as operações conforme a escolha do usuário.

## 💡 Conceitos praticados

- Encapsulamento com atributos privados.
- Criação de classes com relacionamento entre objetos.
- Uso de métodos de validação.
- Controle de saldo e limite de crédito.
- Aplicação de regra de negócio para cheque especial.
- Uso de laços e menus interativos no console.
- Organização de classes usando `package`.

## 🚀 Como executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Navegue até a pasta do módulo:
   ```bash
   cd exercicios/Java/DIO/3_Abstracao_Encapsulamento
   ```

2. Compile os arquivos do banco e do menu principal:
   ```bash
   javac -encoding UTF-8 -d . MenuInterativo.java banco_simulador\Conta.java banco_simulador\Usuario.java banco_simulador\MenuBanco.java
   ```

3. Execute o programa principal:
   ```bash
   java MenuInterativo
   ```

4. Preencha os dados iniciais da conta e escolha uma opção do menu. Exemplo de fluxo:
   ```text
   Bem-vindo ao Simulador de Banco!
   Para criar uma conta, por favor, insira os seguintes dados:
   Nome do titular: João
   CPF do titular: 123.456.789-00
   Valor do depósito inicial: 600

   === MENU ===:
   1. Depósito
   2. Saque
   3. Pagar Boleto
   4. Consultar Saldo
   5. Consultar Cheque Especial (Limite disponível)
   6. Verificar Dívida (Uso do Cheque Especial)
   7. Sair
   Escolha uma operação: 4
   Saldo atual: R$ 600.0
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
