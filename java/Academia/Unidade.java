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
    public int getIdUnidade(){
        return this.idUnidade;
    }
    public void setIdUnidade(int idUnidade){
        this.idUnidade = idUnidade;
    }

    public String getUf(){
        return this.uf;
    }
    public void setUf(String uf){
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
