# ☕ Validação de Divisibilidade (Loop)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa recebe um número inicial `X` e solicita novos valores em loop até encontrar um valor que não seja divisível por `X`.

## 📚 Objetivo

- Ler um número inicial `X`.
- Solicitar novos números em sequência.
- Ignorar valores menores que `X`.
- Continuar o loop enquanto o valor atual for divisível por `X`.
- Encerrar o programa quando o valor informado não for divisível por `X`.

## 🧩 Estrutura do código

### Classe `Divisivel`

Responsável por executar a lógica do exercício. Ela possui:

- `executar(Scanner scanner)`: método principal do programa.
- Recebe o primeiro número informado pelo usuário.
- Em seguida, entra em um `while (true)` para continuar solicitando novos números.
- Se o número informado for menor que o primeiro, ele é ignorado.
- Caso o número seja divisível por `X`, a execução continua.
- Se o resto da divisão for diferente de zero, o programa encerra o loop.

## 💡 Conceitos praticados

- Leitura de entrada com `Scanner`.
- Estrutura de repetição `while`.
- Operador de módulo `%` para verificar divisibilidade.
- Condicionais com `if` e `else`.
- Controle de fluxo para repetir ou encerrar a execução.
- Organização de classes usando `package`.

## 🚀 Como executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Navegue até a pasta do exercício:
   ```bash
   cd exercicios/Java/DIO/2_Estruturas_de_Controle
   ```

2. Compile os arquivos da pasta para gerar os arquivos `.class` com a estrutura de pacotes:
   ```bash
   javac -encoding UTF-8 -d . MenuPrincipal.java imc\Imc.java tabuada\Tabuada.java intervalo\IntervaloParOuImpar.java divisivel\Divisivel.java
   ```

3. Execute o programa principal:
   ```bash
   java MenuPrincipal
   ```

4. Escolha a opção correspondente a este exercício no menu principal.

5. Quando o programa for executado, o comportamento esperado será algo parecido com:
   ```text
   Digite o primeiro número: 5
   Digite um novo número: 10
   Número divisível por o primeiro número. Continuando...
   Digite um novo número: 3
   Número menor que o primeiro número. Ignorado.
   Digite um novo número: 15
   Número divisível por o primeiro número. Continuando...
   Digite um novo número: 17
   Número não divisível por o primeiro número. Encerrando o loop.
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
