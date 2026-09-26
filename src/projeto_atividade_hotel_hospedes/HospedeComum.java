package projeto_atividade_hotel_hospedes;

public class HospedeComum extends Hospede {

    public HospedeComum(String nome, String documento, String telefone) {
        super(nome, documento, telefone);
    }

    @Override
    public double taxaDeServico() {
        return 0.10;
    }
}