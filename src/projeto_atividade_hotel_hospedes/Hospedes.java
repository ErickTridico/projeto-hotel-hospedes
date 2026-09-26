package projeto_atividade_hotel_hospedes;

public abstract class Hospede {

    private String nome;
    private String documento;
    private String telefone;

    public Hospede(String nome, String documento, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public abstract double taxaDeServico();
}