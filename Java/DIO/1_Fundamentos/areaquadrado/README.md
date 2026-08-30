# ☕ Área do Quadrado

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa solicita o tamanho do lado de um quadrado, calcula sua área e exibe o resultado no console.

## 📚 Objetivo

- Ler o valor do lado do quadrado informado pelo usuário.
- Aceitar entrada com ponto (`.`) ou vírgula (`,`) como separador decimal.
- Calcular a área do quadrado usando a fórmula: **Área = lado × lado**.
- Exibir o resultado no console.

## 🧩 Estrutura do código

### Classe `AreaQuadrado`

Responsável por executar o cálculo da área do quadrado. Ela possui:

- `executar(Scanner scanner)`: método que realiza todo o processo:
  1. Solicita o lado do quadrado.
  2. Lê a entrada e normaliza vírgulas para pontos.
  3. Converte a string para `double`.
  4. Calcula a área multiplicando o lado por ele mesmo.
  5. Exibe o resultado no console.

## 💡 Conceitos praticados

- Leitura de entrada do usuário com `Scanner`.
- Manipulação de strings (`trim()`, `replace()`).
- Conversão de tipos de dados com `Double.parseDouble()`.
- Operações aritméticas.
- Flexibilidade de entrada (aceita ponto ou vírgula como separador decimal).
- Organização de classes usando `package`.

## 🚀 Como executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Abra o terminal na pasta `Java/DIO/1_Fundamentos`:
   ```bash
   cd exercicios/Java/DIO/1_Fundamentos
   ```

2. Compile todos os arquivos do módulo para gerar os arquivos `.class` com a estrutura de pacotes:
   ```bash
   javac -d . MenuPrincipal.java saudacao/Saudacao.java areaquadrado/AreaQuadrado.java arearetangulo/AreaRetangulo.java
   ```

3. Execute o programa principal:
   ```bash
   java MenuPrincipal
   ```

4. Escolha a opção **2** no menu:
   ```
   ===========================
       MENU DE EXERCÍCIOS     
   ===========================
   1 - Saudação
   2 - Área do Quadrado
   3 - Área do Retângulo
   0 - Sair
   Escolha uma opção: 2
   ```

5. Informe o lado do quadrado. Exemplos:
   ```text
   Digite o lado do quadrado: 5
   A área do quadrado é: 25.0
   ```

   Ou com vírgula:
   ```text
   Digite o lado do quadrado: 5,5
   A área do quadrado é: 30.25
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
