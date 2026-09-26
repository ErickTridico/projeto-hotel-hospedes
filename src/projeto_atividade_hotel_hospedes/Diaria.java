package projeto_atividade_hotel_hospedes;

public class Diaria {

    private String data;
    private double valorDiaria;

    public Diaria(String data, double valorDiaria) {

        if (valorDiaria < 0) {
            throw new IllegalArgumentException(
                "O valor da diaria nao pode ser negativo."
            );
        }

        this.data = data;
        this.valorDiaria = valorDiaria;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valorDiaria;
    }

    public void alterarValor(double novoValor) {

        if (novoValor < 0) {
            throw new IllegalArgumentException(
                "O valor da diaria nao pode ser negativo."
            );
        }

        this.valorDiaria = novoValor;
    }

    public double calcularTotal() {
        return valorDiaria;
    }
}