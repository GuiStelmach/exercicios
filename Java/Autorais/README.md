# 🏦 Java FinTech & Banking Challenges

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Banking Domain](https://img.shields.io/badge/Domain-Banking_&_Finance-005571?style=for-the-badge)
![Clean Code](https://img.shields.io/badge/Clean_Code-000000?style=for-the-badge)

Este repositório é dedicado à resolução de algoritmos e regras de negócios complexas do **Setor Financeiro (Banking e FinTechs)** utilizando **Java**. O objetivo é demonstrar proficiência na construção de sistemas críticos, como motores de transferência, prevenção a fraudes e cálculos de investimentos.

## 🎯 Principais Práticas Aplicadas neste Repositório
- Uso rigoroso da classe `BigDecimal` para extrema precisão em cálculos monetários.
- Manipulação de datas e fusos horários utilizando a API `java.time` (Java 8+).
- Aplicação dos pilares de Orientação a Objetos e Clean Code.
- Validações de segurança e simulação de regras de negócio estritas.

## 📚 Desafios Implementados

- [ ] **1. Motor de Transferência PIX com Regras de Segurança**
  - **Objetivo:** Criar uma API ou sistema que processe transações PIX entre contas, aplicando limites e validações de segurança.
  - **Regras de Negócio:**
    - **Validação de Chaves:** Identificar o tipo da chave (CPF, E-mail, Telefone ou Aleatória) via Regex.
    - **Saldo:** A transação só pode ocorrer se houver saldo suficiente.
    - **Regra Noturna (Bacen):** Transações realizadas entre as **20:00 e 06:00** possuem um limite máximo de **R$ 1.000,00**. Qualquer valor acima disso deve ser bloqueado com a mensagem *"Limite noturno excedido"*.
    - **Histórico:** Gravar a transação no extrato de quem enviou (débito) e quem recebeu (crédito).

- [ ] **2. Sistema Anti-Fraude (Análise de Padrão)**
  - **Objetivo:** Desenvolver um algoritmo que avalie transações de cartão de crédito em tempo real.
  - **Regras de Negócio:**
    - **Bloqueio por Frequência:** Se houver **3 ou mais transações** no intervalo de **2 minutos**, bloquear o cartão por suspeita de fraude.
    - **Bloqueio de Localidade:** Se uma compra for feita em São Paulo e 10 minutos depois outra no Rio de Janeiro, bloquear (impossibilidade física de deslocamento).
    - **Alerta de Perfil:** Se o valor da compra for **300% maior** que a média histórica de gastos do cliente, enviar a transação para status *"Em Análise Manual"*.

- [ ] **3. Simulador de Investimentos de Renda Fixa (CDB / CDI)**
  - **Objetivo:** Calcular o rendimento líquido de um investimento usando juros compostos e o desconto do Imposto de Renda.
  - **Regras de Negócio:**
    - **Cálculo:** Aplicar juros compostos mensais sobre o valor inicial com base no CDI anual e no percentual oferecido (ex: 110% do CDI).
    - **Tabela Regressiva do IR:** O lucro deve sofrer desconto no momento do resgate baseado no tempo da aplicação:
      - Até 180 dias: **22,5%**.
      - De 181 a 360 dias: **20%**.
      - De 361 a 720 dias: **17,5%**.
      - Acima de 720 dias: **15%**.
    - **Retorno:** Exibir o Valor Bruto final, o Valor Descontado (IR) e o Valor Líquido.

- [ ] **4. Fechamento de Fatura e Juros Rotativos de Cartão**
  - **Objetivo:** Simular o ciclo de vida de uma fatura de cartão de crédito e suas penalidades de atraso.
  - **Regras de Negócio:**
    - Calcular o valor total da fatura e o **Pagamento Mínimo** (15% do total).
    - **Cenários de Pagamento:**
      - *Pagou o Total:* Limite restaurado 100%.
      - *Pagou entre o Mínimo e o Total:* A diferença vai para a próxima fatura com acréscimo de **14,5% a.m.** (Juros Rotativo).
      - *Pagou menos que o Mínimo:* Cartão bloqueado imediatamente, e a diferença vai para a próxima fatura com Juros Rotativo (14.5%) + **Multa fixa de 2%**.

## 🚀 Como executar os projetos localmente

Certifique-se de ter o **[Java JDK 17+](https://www.oracle.com/java/technologies/downloads/)** instalado na sua máquina.

1. Clone este repositório no seu terminal:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios.git
   ```

2. Navegue até a pasta raiz do repositório:
   ```bash
   cd exercicios/Java/Autorais
   ```

3. Navegue até a pasta do desafio desejado e compile o arquivo Java:
   ```bash
   javac Main.java
   ```

4. Execute o programa recém-compilado:
   ```bash
   java Main
   ```

---
🔗 **Desenvolvido por [Gui Stelmach](https://github.com/GuiStelmach)**