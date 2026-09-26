package projeto_atividade_hotel_hospedes;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private String status;
    private String dataEntrada;
    private String dataSaida;

    private Quarto quarto;
    private List<Diaria> diarias;

    public Reserva(String dataEntrada, String dataSaida, Quarto quarto) {
        this.status = "CRIADA";
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.diarias = new ArrayList<Diaria>();
    }

    public void confirmar() {
        if (status.equals("CRIADA")) {
            status = "CONFIRMADA";
        }
    }

    public void finalizar() {
        if (status.equals("CONFIRMADA")) {
            status = "FINALIZADA";
        }
    }

    public void cancelar() {
        if (status.equals("CRIADA") || status.equals("CONFIRMADA")) {
            status = "CANCELADA";
        }
    }

    public double calcularValor() {
        double total = 0;

        for (Diaria diaria : diarias) {
            total += diaria.calcularTotal();
        }

        return total;
    }

    public void adicionarDiaria(Diaria diaria) {
        if (diaria != null) {
            diarias.add(diaria);
        }
    }

    public String getStatus() {
        return status;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public Quarto getQuarto() {
        return quarto;
    }
}
