package Academia;

import java.time.LocalDate;

public class Colaborador {
    private int idColaborador;
    private String nome;
    private String sobrenome;
    private String ultimoNome;
    private LocalDate dataNasc;
    private String sexo;
    private String email;
    private String cpf;
    private double salario;
    private int idSetor;
    private int idUnidade;
    private String formacao;
    private String anoAdmissao;
    private Endereco endereco;


    public Colaborador(int idColaborador, String nome, String sobrenome, String ultimoNome, LocalDate dataNasc, String sexo, String email, String cpf, double salario, int idSetor, int idUnidade, String formacao, String anoAdmissao, Endereco endereco) {
        this.idColaborador = idColaborador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ultimoNome = ultimoNome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.email = email;
        this.cpf = cpf;
        this.salario = salario;
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        LocalDate currentyDate = LocalDate.now();
        int idade = currentyDate.getYear() - dataNasc.getYear();

        if( idade >= 18 && idade < 70){
            this.dataNasc = dataNasc;
        }else{
            System.out.println("É necessário ter idade superior a 18 anos e inferior que 70 anos");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo.contains("F") || sexo.contains("M")){
            this.sexo = sexo;
        }else{
            System.out.println("Digite uma opção válida");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        }else{
            System.out.println("Digite um email válido");
        }
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
        if(salario <= 5000.00) {
            this.salario = salario;
        } else {
            System.out.println("O saário excede o valor máximo");
        }
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
