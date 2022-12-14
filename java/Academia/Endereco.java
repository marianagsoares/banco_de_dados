package Academia;

public class Endereco {
    private  int idEndereco;
    private String uf;
    private String bairro;
    private String rua;
    private String cep;
    private String numero;

    private int idColaborador;

    public Endereco(int idEndereco, String uf, String bairro, String rua, String cep, String numero, int idColaborador) {
        this.idEndereco = idEndereco;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.idColaborador = idColaborador;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if(uf.length() == 2){
            this.uf = uf;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }
}
