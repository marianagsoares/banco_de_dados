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
    }
}
