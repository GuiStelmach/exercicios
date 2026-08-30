# ☕ Saudação com Idade

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este exercício faz parte das atividades do curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O programa solicita o nome e o ano de nascimento de uma pessoa, calcula sua idade aproximada e exibe uma mensagem de saudação.

## 📚 Objetivo

- Ler o nome informado pelo usuário.
- Ler o ano de nascimento.
- Obter o ano atual automaticamente.
- Calcular a idade subtraindo o ano de nascimento do ano atual.
- Exibir uma mensagem personalizada no console.

## 🧩 Estrutura do código

### Classe `Pessoa`

Representa a pessoa utilizada no exercício. Ela possui:

- `nome`: armazena o nome informado.
- `idade`: armazena a idade calculada.
- `identificar()`: exibe a mensagem com o nome e a idade da pessoa.

### Classe `Main`

Contém o método `main`, responsável por executar o programa:

1. Cria um objeto `Scanner` para ler os dados do teclado.
2. Cria uma instância da classe `Pessoa`.
3. Solicita o nome e o ano de nascimento.
4. Usa `LocalDate.now().getYear()` para obter o ano atual.
5. Calcula a idade da pessoa.
6. Chama o método `identificar()`.
7. Fecha o `Scanner` ao final da execução.

## 💡 Conceitos praticados

- Declaração e instanciação de classes e objetos.
- Uso de atributos e métodos.
- Entrada de dados com `Scanner`.
- Uso da API `java.time` para obter o ano atual.
- Operações aritméticas simples.
- Organização de classes usando `package`.

> **Observação:** O cálculo considera apenas a diferença entre os anos. Ele não verifica se a data de aniversário já ocorreu no ano atual.

## 🚀 Como executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Abra o terminal na pasta `Java/DIO/1_Fundamentos`:
   ```bash
   cd exercicios/Java/DIO/1_Fundamentos
   ```

2. Navegue até a pasta dos fundamentos do projeto:
   ```bash
   cd exercicios/Java/DIO/1_Fundamentos
   ```

3. Compile todos os arquivos do módulo para gerar os arquivos `.class` com a estrutura de pacotes:
   ```bash
   javac -d . MenuPrincipal.java saudacao/Saudacao.java areaquadrado/AreaQuadrado.java arearetangulo/AreaRetangulo.java diferencaidade/DiferencaIdade.java
   ```

4. Execute o programa principal:
   ```bash
   java MenuPrincipal
   ```

5. Escolha a opção 1:
   ```bash
   ===========================
    MENU DE EXERCÍCIOS     
   ===========================
   1 - Saudação
   2 - Área do Quadrado
   3 - Área do Retângulo
   4 - Diferença de Idade
   0 - Sair
   ```

4. Informe os dados solicitados. Exemplo:
   ```text
   Digite seu nome: DIO
   Digite seu ano de nascimento: 2018
   Olá DIO você tem 8 anos
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).
