# ☕ Exercícios de Java - Digital Innovation One (DIO)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este repositório contém as minhas resoluções para os exercícios práticos propostos no curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo aqui é documentar meu aprendizado e praticar os conceitos básicos de lógica de programação e sintaxe da linguagem.

## 📚 Os Exercícios

Abaixo está a lista dos exercícios propostos pela DIO que foram desenvolvidos neste repositório:

- [ ] **12. Hierarquia de Ingressos (Cinema)**
  - **Objetivo:** Criar um sistema de ingressos utilizando herança, com regras específicas de cálculo de preço (Polimorfismo).
  - **Classe Base:** `Ingresso` contendo Valor, Nome do filme, e flag para Dublado/Legendado.
  - **Classes Filhas e Regra do Método de calcular valor final:**
    - **Meia Entrada:** Retorna sempre 50% (metade) do valor base.
    - **Ingresso Família:** Recebe a quantidade de pessoas. O valor final é o valor base multiplicado pelo número de pessoas. Se a quantidade for maior que 3, aplica-se um desconto de 5% sobre o total.

- [ ] **13. Sistema de Usuários (Herança e Encapsulamento)**
  - **Objetivo:** Criar uma hierarquia de usuários em um sistema corporativo. Todos devem ter Getters e Setters apenas onde faz sentido de acordo com as regras de negócio.
  - **Hierarquia:** 
    - **Métodos Comuns (Classe Pai/Interface):** Realizar login, Realizar logoff, Alterar dados, Alterar senha.
    - **Gerente:**
      - *Atributos:* Nome, Email, Senha, e flag de `Administrador` (obrigatoriamente `true`).
      - *Métodos Exclusivos:* Gerar relatório financeiro e Consultar vendas.
    - **Vendedor:**
      - *Atributos:* Nome, Email, Senha, Quantidade de vendas, e flag de `Administrador` (obrigatoriamente `false`).
      - *Métodos Exclusivos:* Realizar venda (incrementa a quantidade de vendas efetuadas) e Consultar vendas.
    - **Atendente:**
      - *Atributos:* Nome, Email, Senha, Valor em caixa, e flag de `Administrador` (obrigatoriamente `false`).
      - *Métodos Exclusivos:* Receber pagamentos (incrementa o valor ao total do caixa) e Fechar o caixa.

- [ ] **14. Sincronização de Relógios pelo Mundo**
  - **Objetivo:** Trabalhar com validação de dados e conversão de formatos de tempo utilizando classes abstratas.
  - **Classe Pai:** `Relogio`
    - *Atributos:* Hora, Minuto, Segundo (com validações estritas nos *setters* para que os números não ultrapassem o limite de tempo real).
    - *Método Concreto:* Um método para retornar a string formatada em `HH:MM:SS`.
    - *Método Abstrato (Sincronização):* Um método que obriga as filhas a implementarem. Ele deve receber uma instância de **qualquer** `Relogio` como parâmetro, ler suas horas e ajustar o seu próprio horário baseado nele.
  - **Classes Filhas:**
    - **Relógio Brasileiro:** Exibe e trabalha no formato de 24 horas (0 a 23).
    - **Relógio Americano:** Exibe e trabalha no formato de 12 horas (sem utilizar as horas de 13 a 24).

## 🚀 Como executar os códigos

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone este repositório:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios
   ```

2. Navegue até a pasta raiz do repositório:
   ```bash
   cd exercicios/Java/4_Heranca_Polimorfismo
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