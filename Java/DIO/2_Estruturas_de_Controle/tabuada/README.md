# ☕ Tabuada

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa solicita um número do usuário, calcula a tabuada desse valor de 1 a 10 e exibe os resultados no console.

## 📚 Objetivo

- Ler um número informado pelo usuário.
- Multiplicar esse número pelos valores de 1 até 10.
- Armazenar os resultados em uma lista.
- Exibir cada operação no formato: `n x i = resultado`.

## 🧩 Estrutura do código

### Classe `TabuadaModelo`

Responsável pela lógica da tabuada. Ela possui:

- `numero`: atributo que recebe o valor informado pelo usuário.
- `calcularTabuada()`: método que percorre os números de 1 a 10 e gera a sequência de resultados.

### Classe `Tabuada`

Responsável por executar o programa:

- Cria um `Scanner` para receber a entrada do usuário.
- Solicita o número da tabuada.
- Instancia `TabuadaModelo`.
- Atribui o valor ao atributo `numero`.
- Chama o método `calcularTabuada()`.
- Exibe todas as multiplicações no console.

## 💡 Conceitos praticados

- Leitura de entrada com `Scanner`.
- Uso de `List` e `ArrayList` para guardar resultados.
- Estrutura de repetição `for`.
- Operações matemáticas básicas.
- Concatenação de strings para montar a mensagem exibida.
- Organização de classes usando `package`.

> Observação: O uso de `List` e `ArrayList` foi uma escolha para praticar a estrutura de dados e facilitar a validação do resultado em testes com JUnit.

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
   javac -d . MenuPrincipal.java tabuada/Tabuada.java
   ```

4. Execute o programa principal da pasta, se ele estiver sendo chamado por um `MenuPrincipal` já existente:
   ```bash
   java MenuPrincipal
   ```

> Observação: como a classe `Tabuada` não possui um método `main`, ela é normalmente acionada pelo `MenuPrincipal` por meio do método `executar(Scanner scanner)`.

5. Quando o programa for executado pelo menu, o comportamento esperado será:
   ```text
   Digite um número para calcular a tabuada: 5
   Resultados da tabuada de 5:
   5 x 1 = 5
   5 x 2 = 10
   5 x 3 = 15
   5 x 4 = 20
   5 x 5 = 25
   5 x 6 = 30
   5 x 7 = 35
   5 x 8 = 40
   5 x 9 = 45
   5 x 10 = 50
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
