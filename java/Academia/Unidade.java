package Academia;

public class Unidade {
    private int idUnidade;
    private String nome;
    private String uf;
    private String cep;
    private String rua;
    private String bairro;
    private String numero;

    public Unidade(int idUnidade, String nome, String uf, String cep, String rua, String bairro, String numero) {
        this.idUnidade = idUnidade;
        this.nome = nome;
        this.uf = uf;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
}
