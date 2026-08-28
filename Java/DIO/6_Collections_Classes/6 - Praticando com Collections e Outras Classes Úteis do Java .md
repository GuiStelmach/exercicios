# ☕ Exercícios de Java - Digital Innovation One (DIO)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este repositório contém as minhas resoluções para os exercícios práticos propostos no curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo aqui é documentar meu aprendizado e praticar os conceitos básicos de lógica de programação e sintaxe da linguagem.

## 📚 Os Exercícios

Abaixo está a lista dos exercícios propostos pela DIO que foram desenvolvidos neste repositório:

- [ ] **18. Calculadora via String (Split)**
  - **Objetivo:** Criar uma calculadora de soma e subtração processando uma única linha de entrada.
  - **Regra:** O usuário informará todos os números que serão usados na conta de uma só vez, digitando os valores separados por vírgula (ex: `10,5,20`). O sistema deve ler a string, extrair os números e exibir o resultado final.

- [ ] **19. Validador e Formatador de Telefones (Regex / String)**
  - **Objetivo:** Criar um algoritmo inteligente que limpe entradas de texto, valide números de telefone e os formate corretamente.
  - **Formatos Aceitos:**
    - Fixo sem DDD (8 dígitos): `xxxx-xxxx`
    - Fixo com DDD (10 dígitos): `(xx)xxxx-xxxx`
    - Celular sem DDD (9 dígitos): `xxxxx-xxxx`
    - Celular com DDD (11 dígitos): `(xx)xxxxx-xxxx`
  - **Casos de Uso e Regras de Negócio:**
    - **Apenas números:** Detectar pelo tamanho, formatar com o padrão correto e retornar.
    - **Máscara Incorreta:** Corrigir os hifens/parênteses e retornar no padrão correto.
    - **Já Formatado:** Se receber a máscara perfeita, retornar como está e informar o tipo de dispositivo (Fixo ou Celular).
    - **Caracteres Sujos/Misturados:** Se a string contiver letras e símbolos variados, o sistema deve extrair **apenas** os números. Depois, valida se a quantidade bate com um dos padrões e formata (ou barra se for inválido).
    - **Tamanho Inválido:** Qualquer entrada que, após limpa, não resulte em 8, 9, 10 ou 11 números, deve ser rejeitada como "número inválido".

- [ ] **20. Conversor e Serializador de Dados (JSON, XML e YAML)**
  - **Objetivo:** Criar um *parser* customizado que receba linhas de texto do usuário, tipifique as variáveis e gere a estrutura de saída em 3 formatos populares de intercâmbio de dados: **JSON**, **XML** e **YAML**.
  - **Padrão de Entrada:** O usuário irá digitar *N* linhas usando um separador à escolha (exemplo usando `;`): `NOME_CAMPO;VALOR;TIPO;`
  - **Regras de Execução:**
    - O programa continua lendo dados até que o usuário dispare o comando de parada.
    - **Tipos de dados aceitos:** texto, data, data e hora, números inteiros, números flutuantes (decimais) e booleanos (`true`/`false`).
    - **Arrays:** O sistema deve suportar arrays baseados nos tipos listados acima.
    - **(Opcional/Avançado):** Possibilitar a definição de arrays de objetos e objetos internos/aninhados.

## 🚀 Como executar os códigos

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone este repositório:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios
   ```

2. Navegue até a pasta raiz do repositório:
   ```bash
   cd exercicios/Java/6_Collections_Classes
   ```

3. Compile o arquivo Java desejado (exemplo):
   ```bash
   javac Exercicio1.java
   ```

4. Execute o programa compilado:
   ```bash
   java Exercicio1
   ```

---
Desenvolvido com ☕ e dedicação por [Gui Stelmach](https://github.com/GuiStelmach).