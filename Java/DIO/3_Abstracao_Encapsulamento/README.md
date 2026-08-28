# ☕ Exercícios de Java - Digital Innovation One (DIO)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Course-blue?style=for-the-badge)

Este repositório contém as minhas resoluções para os exercícios práticos propostos no curso de **Java** da plataforma [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo aqui é documentar meu aprendizado e praticar os conceitos básicos de lógica de programação e sintaxe da linguagem.

## 📚 Os Exercícios

Abaixo está a lista dos exercícios propostos pela DIO que foram desenvolvidos neste repositório:

> ⚠️ **Aviso Geral:** Todos os exercícios a partir deste ponto possuem um **Menu Interativo** no console para navegação e chamada de funções, contendo sempre uma opção para **sair/finalizar** a execução do programa.

- [ ] **9. Simulador de Conta Bancária**
  - **Objetivo:** Criar um sistema bancário com controle de saldo, cheque especial e pagamento de taxas.
  - **Operações do Menu:** Consultar saldo, Consultar cheque especial, Depositar, Sacar, Pagar boleto, Verificar uso do cheque especial.
  - **Regras de Negócio:**
    - O limite do cheque especial soma-se ao saldo da conta para operações de retirada (saque/boleto).
    - O valor do cheque especial é definido na **criação da conta** com base no depósito inicial:
      - Depósito inicial `≤ R$ 500,00`: Cheque especial fixado em `R$ 50,00`.
      - Depósito inicial `> R$ 500,00`: Cheque especial de `50%` do valor depositado.
    - Caso o cliente utilize o limite do cheque especial, o sistema deverá cobrar uma taxa de **20%** sobre o valor utilizado assim que possível (ex: no próximo depósito).

- [ ] **10. Simulador de Carro**
  - **Objetivo:** Controlar o estado de um carro respeitando leis físicas básicas e regras de câmbio.
  - **Operações do Menu:** Ligar, Desligar, Acelerar, Diminuir velocidade, Virar (esquerda/direita), Verificar velocidade, Trocar marcha.
  - **Regras de Negócio:**
    - **Estado inicial:** O carro nasce desligado, em ponto morto (marcha 0) e a 0 km/h. O carro desligado não realiza nenhuma função.
    - **Aceleração/Frenagem:** Cada ação altera a velocidade em `1 km/h`. Limites gerais: Mínimo `0 km/h`, Máximo `120 km/h`.
    - **Câmbio (6 marchas):** As marchas devem ser trocadas sequencialmente (não é permitido pular marchas). A velocidade precisa respeitar a marcha atual:
      - **Marcha 0 (Ponto Morto):** Não pode acelerar.
      - **1ª Marcha:** 0 a 20 km/h
      - **2ª Marcha:** 21 a 40 km/h
      - **3ª Marcha:** 41 a 60 km/h
      - **4ª Marcha:** 61 a 80 km/h
      - **5ª Marcha:** 81 a 100 km/h
      - **6ª Marcha:** 101 a 120 km/h
    - **Direção:** Só é permitido virar o carro se a velocidade for de, no mínimo, `1 km/h` e, no máximo, `40 km/h`.
    - **Desligamento:** O carro só pode ser desligado se estiver totalmente parado (`0 km/h`) e em ponto morto (marcha 0).

- [ ] **11. Máquina de Banho para Pets (Petshop)**
  - **Objetivo:** Gerenciar o funcionamento e os insumos de uma máquina automatizada de banho.
  - **Operações do Menu:** Dar banho, Abastecer água, Abastecer shampoo, Verificar níveis (água/shampoo), Verificar presença de pet, Colocar pet, Retirar pet, Limpar máquina.
  - **Regras de Negócio:**
    - **Capacidade e Lotação:** A máquina comporta apenas 1 pet por vez, e seus reservatórios têm capacidade máxima de 30L (água) e 10L (shampoo).
    - **Consumo do Banho:** Cada banho consome 10 litros de água e 2 litros de shampoo.
    - **Abastecimento:** Cada acionamento de abastecimento insere **2 litros** do insumo selecionado na máquina.
    - **Limpeza:** Se um pet for retirado da máquina sem estar limpo (banho interrompido), a máquina fica suja. Para colocar um novo pet, a limpeza é obrigatória.
    - **Consumo da Limpeza:** O ciclo de limpeza consome 3 litros de água e 1 litro de shampoo.

## 🚀 Como executar os códigos

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone este repositório:
   ```bash
   git clone https://github.com/GuiStelmach/exercicios
   ```

2. Navegue até a pasta raiz do repositório:
   ```bash
   cd exercicios/Java/3_Abstracao_Encapsulamento
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