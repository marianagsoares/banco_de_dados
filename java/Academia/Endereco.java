package Academia;

public class Endereco {
    private  int idEndereco;
    private char uf;
    private String bairro;
    private String rua;
    private String cep;
    private String numero;
    private Colaborador idColaborador;

    public Endereco(int idEndereco, char uf, String bairro, String rua, String cep, String numero, Colaborador idColaborador) {
        this.idEndereco = idEndereco;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.idColaborador = idColaborador;
    }
}
