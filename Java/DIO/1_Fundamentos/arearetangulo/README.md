# ☕ Área do Retângulo

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa solicita a base e a altura de um retângulo, calcula sua área e exibe o resultado no console.

## 📚 Objetivo

- Ler o valor da base do retângulo informado pelo usuário.
- Ler o valor da altura do retângulo.
- Aceitar entrada com ponto (`.`) ou vírgula (`,`) como separador decimal.
- Calcular a área do retângulo usando a fórmula: **Área = base × altura**.
- Exibir o resultado no console.

## 🧩 Estrutura do código

### Classe `AreaRetangulo`

Responsável por executar o cálculo da área do retângulo. Ela possui:

- `executar(Scanner scanner)`: método que realiza todo o processo:
  1. Solicita a base do retângulo.
  2. Lê a entrada, normaliza vírgulas para pontos e converte para `double`.
  3. Solicita a altura do retângulo.
  4. Realiza o mesmo processo de leitura e conversão.
  5. Calcula a área multiplicando base por altura.
  6. Exibe o resultado no console.

## 💡 Conceitos praticados

- Leitura de múltiplas entradas do usuário com `Scanner`.
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

4. Escolha a opção **3** no menu:
   ```
   ===========================
       MENU DE EXERCÍCIOS     
   ===========================
   1 - Saudação
   2 - Área do Quadrado
   3 - Área do Retângulo
   0 - Sair
   Escolha uma opção: 3
   ```

5. Informe a base e a altura do retângulo. Exemplos:
   ```text
   Digite a base do retângulo: 10
   Digite a altura do retângulo: 5
   A área do retângulo é: 50.0
   ```

   Ou com vírgula:
   ```text
   Digite a base do retângulo: 10,5
   Digite a altura do retângulo: 4,2
   A área do retângulo é: 44.1
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
