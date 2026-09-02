# ☕ Exercícios de Java - Digital Innovation One (DIO)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este repositório contém as minhas resoluções para os exercícios práticos propostos no curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo aqui é documentar meu aprendizado e praticar os conceitos básicos de lógica de programação e sintaxe da linguagem.

## 📚 Os Exercícios

Abaixo está a lista dos exercícios propostos pela DIO que foram desenvolvidos neste repositório:

- [X] **1. Saudação com Idade**
  - **Objetivo:** Receber o nome e o ano de nascimento de uma pessoa e imprimir a mensagem: *"Olá [Nome], você tem [X] anos"*.
- [X] **2. Área do Quadrado**
  - **Objetivo:** Receber o tamanho do lado de um quadrado, calcular sua área e exibir na tela. *(Fórmula: Área = lado × lado)*.
- [X] **3. Área do Retângulo**
  - **Objetivo:** Receber a base e a altura de um retângulo, calcular sua área e exibir na tela. *(Fórmula: Área = base × altura)*.
- [X] **4. Diferença de Idades**
  - **Objetivo:** Receber o nome e a idade de 2 pessoas e imprimir a diferença de idade entre elas.

## 🚀 Como executar os códigos

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone este repositório:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios
   ```

2. Navegue até a pasta dos fundamentos do projeto:
   ```bash
   cd Java/DIO/1_Fundamentos
   ```

3. Compile todos os arquivos do módulo para gerar os arquivos `.class` com a estrutura de pacotes:
   ```bash
   javac -d . MenuPrincipal.java saudacao/Saudacao.java areaquadrado/AreaQuadrado.java arearetangulo/AreaRetangulo.java diferencaidade/DiferencaIdade.java
   ```

4. Execute o programa principal:
   ```bash
   java MenuPrincipal
   ```

> Observação: como os exercícios usam pacotes em subpastas, não basta compilar apenas `MenuPrincipal.java`. É necessário compilar também as classes dos exercícios para que o projeto encontre `saudacao.Saudacao`, `areaquadrado.AreaQuadrado` e `arearetangulo.AreaRetangulo`.

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).