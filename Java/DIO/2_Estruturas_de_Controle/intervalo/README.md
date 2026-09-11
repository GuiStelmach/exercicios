# ☕ Pares ou Ímpares no Intervalo

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa solicita dois números e permite identificar os números pares ou ímpares existentes no intervalo informado, em ordem decrescente.

## 📚 Objetivo

- Ler o primeiro e o segundo número do intervalo.
- Escolher se serão identificados números pares ou ímpares.
- Exibir os números escolhidos em ordem decrescente.
- Validar entradas não numéricas e a opção selecionada.

## 🧩 Estrutura do código

### Classe `ModeloIntervalo`

Responsável pela lógica de identificação dos números no intervalo. Ela possui:

- `primeiroNumero`: atributo que recebe o início do intervalo.
- `segundoNumero`: atributo que recebe o fim do intervalo.
- `parOuImpar`: atributo que armazena a opção escolhida pelo usuário.
- `identificar()`: método que percorre o intervalo em ordem decrescente e exibe os números pares ou ímpares.

### Classe `IntervaloParOuImpar`

Responsável por executar o exercício:

- Recebe os números do intervalo por meio de um `Scanner`.
- Valida os números informados usando `InputMismatchException`.
- Solicita a escolha entre pares e ímpares.
- Instancia `ModeloIntervalo` e chama o método `identificar()`.

## 💡 Conceitos praticados

- Leitura de entrada com `Scanner`.
- Tratamento de exceções com `InputMismatchException`.
- Estruturas de repetição `while` e `for`.
- Uso do operador `%` para identificar números pares e ímpares.

## 🚀 Como executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone este repositório:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios
   ```

2. Navegue até a pasta do exercício:
   ```bash
   cd exercicios/Java/DIO/2_Estruturas_de_Controle
   ```

3. Compile os arquivos da pasta para gerar os arquivos `.class` com a estrutura de pacotes:
   ```bash
   javac -d . MenuPrincipal.java intervalo/IntervaloParOuImpar.java
   ```

4. Execute o programa principal da pasta, se ele estiver sendo chamado por um `MenuPrincipal` já existente:
   ```bash
   java MenuPrincipal
   ```

> Observação: como a classe `Tabuada` não possui um método `main`, ela é normalmente acionada pelo `MenuPrincipal` por meio do método `executar(Scanner scanner)`.

5. Quando o programa for executado pelo menu, selecione a opção `3`. Um exemplo de execução será:
   ```text
   Digite o primeiro número: 2
   Digite o segundo número: 8
   == Identificar Par ou Ímpar ==
   1 - Par
   2 - Ímpar
   1
   Números pares no intervalo de 8 a 2:
   8 6 4 2
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
