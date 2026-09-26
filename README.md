# 🏨 Sistema Pousada Bem-Estar

## 1. Introdução
O projeto consiste na modelagem e implementação de um sistema para a **Pousada Bem-Estar**, aplicando os conceitos de **Programação Orientada a Objetos** estudados em aula. O desenvolvimento foi iniciado com a criação do diagrama de classes e posteriormente realizado em Java.

---

## 2. Desenvolvimento do Projeto
Inicialmente foi elaborado o diagrama de classes do sistema, definindo as principais classes, seus atributos, métodos e relacionamentos.

O modelo é composto pelas seguintes classes:
* **`Hospedes`**: Representa a estrutura comum dos hóspedes (definida como classe abstrata).
* **`HospedeComum`** e **`HospedeVIP`**: Especializações derivadas da classe base.
* **`Reserva`**: Representa uma reserva realizada na pousada (possui status, data de entrada, data de saída, além de ligar-se a quartos e diárias).
* **`Diaria`**: Gerencia os valores e datas correspondentes.
* **`Quarto`**: Armazena número, capacidade e valor da diária.

---

## 3. Relacionamentos
O diagrama utiliza diferentes tipos de relacionamentos da Orientação a Objetos:
* **Herança:** Utilizada entre `Hospedes` e suas especializações (`HospedeComum` e `HospedeVIP`), permitindo a reutilização de características.
* **Agregação (◇):** Presente entre `Hospede` e `Reserva`, representando a relação de um hóspede com suas reservas.
* **Composição (◆):** Presente entre `Reserva` e `Diaria`, indicando que as diárias fazem parte da reserva.
* **Associação:** Presente entre `Reserva` e `Quarto`, representando o quarto vinculado, com multiplicidade nas pontas.

---

## 4. Pilares da Orientação a Objetos
O projeto aplica os quatro pilares fundamentais da POO:
1. **Abstração:** A classe `Hospedes` foi definida como abstrata e possui o método abstrato `taxaDeServico()`, implementado obrigatoriamente pelas classes filhas.
2. **Encapsulamento:** Os atributos das classes são definidos como `private`, com acesso controlado por meio de métodos públicos (`getters`).
3. **Herança:** `HospedeComum` e `HospedeVIP` herdam a base estrutural de `Hospedes`.
4. **Polimorfismo:** O método `taxaDeServico()` possui comportamentos diferentes em cada tipo de hóspede.

---

## 5. Implementação em Java
Após a modelagem, as classes foram implementadas em Java utilizando o ambiente do **Eclipse**:
* A classe **`Quarto`** gerencia capacidade e tarifas.
* A classe **`Diaria`** calcula totais e controla alterações de valores.
* A classe **`Reserva`** gerencia o ciclo de vida (confirmada, finalizada, cancelada) e calcula o valor total geral.
* Foram implementadas **validações lógicas** para impedir valores negativos em diárias e quartos.

---

## 6. Conclusão
O desenvolvimento permitiu consolidar a prática dos conceitos de POO na modelagem e implementação de software, abrangendo desde estruturas abstratas e polimorfismo até o controle de fluxos e validações em Java.
