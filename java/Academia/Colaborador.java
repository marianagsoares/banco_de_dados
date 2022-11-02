package Academia;

public class Colaborador {
    private int idColaborador;
    private String nome;
    private String sobrenome;
    private String ultimoNome;
    private String dataNasc;
    private String sexo;
    private String email;
    private String cpf;
    private double salario;
    private int idSetor;
    private int idUnidade;
    private String formacao;
    private String anoAdmissao;
    private Endereco endereco;


    public Colaborador(int idColaborador, String nome, String sobrenome, String ultimoNome, String dataNasc, String sexo, String email, String cpf, double salario, int idSetor, int idUnidade, String formacao, String anoAdmissao, Endereco endereco) {
        this.idColaborador = idColaborador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ultimoNome = ultimoNome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.email = email;
        this.cpf = cpf;
        this.salario = salario;
        this.idSetor = idSetor;
        this.idUnidade = idUnidade;
        this.formacao = formacao;
        this.anoAdmissao = anoAdmissao;
        this.endereco = endereco;
        this.idSetor = idSetor;
        this.idUnidade = idUnidade;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(String anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
