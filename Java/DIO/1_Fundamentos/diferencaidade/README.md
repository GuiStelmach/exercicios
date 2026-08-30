# ☕ Diferença de Idades

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa solicita o nome e a idade de duas pessoas, calcula a diferença de idade entre elas e exibe o resultado no console.

## 📚 Objetivo

- Ler o nome da primeira pessoa.
- Ler a idade da primeira pessoa.
- Ler o nome da segunda pessoa.
- Ler a idade da segunda pessoa.
- Calcular a diferença de idade entre elas (valor absoluto).
- Exibir uma mensagem com os nomes e a diferença de idade.

## 🧩 Estrutura do código

### Classe `DiferencaIdade`

Responsável por executar o cálculo da diferença de idade. Ela possui:

- `executar(Scanner scanner)`: método que realiza todo o processo:
  1. Solicita o nome da primeira pessoa.
  2. Solicita a idade da primeira pessoa.
  3. Solicita o nome da segunda pessoa.
  4. Solicita a idade da segunda pessoa.
  5. Calcula a diferença absoluta entre as idades usando `Math.abs()`.
  6. Exibe uma mensagem personalizada com os dados.

## 💡 Conceitos praticados

- Leitura de múltiplas entradas do usuário com `Scanner`.
- Uso de tipos de dados diferentes (`String` e `int`).
- Operações aritméticas.
- Uso de `Math.abs()` para obter o valor absoluto.
- Concatenação de strings.
- Organização de classes usando `package`.

## 🚀 Como executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Abra o terminal na pasta `Java/DIO/1_Fundamentos`:
   ```bash
   cd exercicios/Java/DIO/1_Fundamentos
   ```

2. Compile todos os arquivos do módulo para gerar os arquivos `.class` com a estrutura de pacotes:
   ```bash
   javac -d . MenuPrincipal.java saudacao/Saudacao.java areaquadrado/AreaQuadrado.java arearetangulo/AreaRetangulo.java diferencaidade/DiferencaIdade.java
   ```

3. Execute o programa principal:
   ```bash
   java MenuPrincipal
   ```

4. Escolha a opção **4** no menu:
   ```
   ===========================
       MENU DE EXERCÍCIOS     
   ===========================
   1 - Saudação
   2 - Área do Quadrado
   3 - Área do Retângulo
   4 - Diferença de Idade
   0 - Sair
   Escolha uma opção: 4
   ```

5. Informe os dados solicitados. Exemplo:
   ```text
   Digite o nome da primeira pessoa: João
   Digite a idade da primeira pessoa: 30
   Digite o nome da segunda pessoa: Maria
   Digite a idade da segunda pessoa: 25
   João e Maria têm uma diferença de idade de 5 anos.
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
