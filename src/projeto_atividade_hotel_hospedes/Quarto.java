package projeto_atividade_hotel_hospedes;

public class Quarto {

    private int numeroQuarto;
    private int capacidade;
    private double valorDiaria;

    public Quarto(int numeroQuarto, int capacidade, double valorDiaria) {

        if (valorDiaria < 0) {
            throw new IllegalArgumentException(
                "O valor da diaria nao pode ser negativo."
            );
        }

        this.numeroQuarto = numeroQuarto;
        this.capacidade = capacidade;
        this.valorDiaria = valorDiaria;
    }

    public int getNumero() {
        return numeroQuarto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void alterarValorDiaria(double valor) {

        if (valor < 0) {
            throw new IllegalArgumentException(
                "O valor da diaria nao pode ser negativo."
            );
        }

        this.valorDiaria = valor;
    }
}