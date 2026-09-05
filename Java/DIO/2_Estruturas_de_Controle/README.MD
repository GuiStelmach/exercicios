# ☕ Exercícios de Java - Digital Innovation One (DIO)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este repositório contém as minhas resoluções para os exercícios práticos propostos no curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo aqui é documentar meu aprendizado e praticar os conceitos básicos de lógica de programação e sintaxe da linguagem.

## 📚 Os Exercícios

Abaixo está a lista dos exercícios propostos pela DIO que foram desenvolvidos neste repositório:

- [X] **5. Tabuada**
  - **Objetivo:** Receber um número do usuário e gerar a tabuada desse número (multiplicado de 1 até 10).
- [X] **6. Calculadora de IMC**
  - **Objetivo:** Receber a altura e o peso do usuário, calcular o seu IMC *(Fórmula: IMC = peso / (altura × altura))* e exibir a classificação de acordo com a tabela abaixo:
    - **≤ 18,5:** Abaixo do peso
    - **18,6 a 24,9:** Peso ideal
    - **25,0 a 29,9:** Levemente acima do peso
    - **30,0 a 34,9:** Obesidade Grau I
    - **35,0 a 39,9:** Obesidade Grau II (Severa)
    - **≥ 40,0:** Obesidade III (Mórbida)
- [ ] **7. Pares ou Ímpares no Intervalo (Ordem Decrescente)**
  - **Objetivo:** Receber um número inicial, um número final (maior que o inicial) e uma escolha do usuário ("par" ou "ímpar"). O programa deve exibir todos os números da categoria escolhida dentro do intervalo (incluindo os números informados), em **ordem decrescente**.
- [ ] **8. Validação de Divisibilidade (Loop)**
  - **Objetivo:** Receber um número inicial `X`. O programa deve continuar solicitando novos números em loop. Regras:
    - Números menores que `X` devem ser ignorados.
    - O loop só deve ser interrompido quando o usuário digitar um número que, dividido por `X`, possua **resto diferente de zero**.

## 🚀 Como executar os códigos

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone este repositório:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios
   ```

2. Navegue até a pasta raiz do repositório:
   ```bash
   cd exercicios/DIO/Java/2_Estruturas_de_Controle
   ```

3. Compile os arquivos Java desejado (exemplo):
   ```bash
   javac MenuPrincipal.java imc\Imc.Java tabuada\Tabuada.java
   ```

4. Execute o programa compilado:
   ```bash
   java MenuPrincipal
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).