package projeto_atividade_hotel_hospedes;

public class HospedeVIP extends Hospede {

    public HospedeVIP(String nome, String documento, String telefone) {
        super(nome, documento, telefone);
    }

    @Override
    public double taxaDeServico() {
        return 0.0;
    }
}