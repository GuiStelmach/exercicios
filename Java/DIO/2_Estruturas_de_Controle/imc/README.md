# ☕ Calculadora de IMC

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa solicita o peso e a altura do usuário, calcula o Índice de Massa Corporal (IMC) e exibe a classificação correspondente no console.

## 📚 Objetivo

- Ler o peso do usuário em quilogramas.
- Ler a altura do usuário em metros.
- Calcular o IMC usando a fórmula: `IMC = peso / (altura × altura)`.
- Exibir o IMC com duas casas decimais.
- Exibir a classificação de acordo com o resultado calculado.

## 🧩 Estrutura do código

### Classe `DadosImc`

Armazena os dados informados pelo usuário:

- `peso`: armazena o peso em quilogramas.
- `altura`: armazena a altura em metros.

### Classe `Imc`

Responsável por executar o cálculo do IMC:

- Recebe o `Scanner` compartilhado pelo menu.
- Solicita o peso e a altura.
- Calcula o IMC.
- Usa estruturas condicionais para identificar a classificação.
- Exibe o resultado no console.

## 💡 Conceitos praticados

- Leitura de números decimais com `Scanner`.
- Operações matemáticas e cálculo de potência por multiplicação.
- Estruturas condicionais `if` e `else if`.
- Formatação de números com `System.out.printf()`.
- Organização de classes usando `package`.

> Observação: a implementação atual usa o separador decimal da localidade configurada no Java. No ambiente com configuração brasileira, informe os valores com vírgula, por exemplo, `70,5` e `1,75`. Usar o formato incorreto pode causar `InputMismatchException`.

## 🚀 Como executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone este repositório:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios
   ```

2. Navegue até a pasta do módulo:
   ```bash
   cd exercicios/Java/DIO/2_Estruturas_de_Controle
   ```

3. Compile o menu e os exercícios do módulo para gerar os arquivos `.class` com a estrutura de pacotes:
   ```bash
   javac -d . MenuPrincipal.java imc/Imc.java tabuada/Tabuada.java
   ```

4. Execute o programa principal:
   ```bash
   java MenuPrincipal
   ```

> Observação: a classe `Imc` não possui um método `main`. Ela é acionada pelo `MenuPrincipal` por meio do método `executar(Scanner scanner)`.

5. Escolha a opção **2 - Calcular IMC** no menu:
   ```text
   Digite seu peso (kg): 70,5
   Digite sua altura (m): 1,75
   IMC: 23,02
   - Peso ideal
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
