package Academia;

import java.util.ArrayList;

public class Unidade {
    private int idUnidade;
    private String nome;
    private String uf;
    private String cep;
    private String rua;
    private String bairro;
    private String numero;
    private ArrayList<Colaborador> colaboradores;
    private ArrayList<Setor> setores;


    public Unidade(int idUnidade, String nome, String uf, String cep, String rua, String bairro, String numero, ArrayList<Setor> setores, ArrayList<Colaborador> colaboradores) {
        this.idUnidade = idUnidade;
        this.nome = nome;
        this.uf = uf;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.setores = setores;
        this.colaboradores = colaboradores;
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length()<=20){
            this.nome = nome;
        }else {
            System.out.println("O nome da unidade deve conter no máximo 20 caracteres");
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public ArrayList<Setor> getSetores() {
        return setores;
    }

    public void setSetores(ArrayList<Setor> setores) {
        this.setores = setores;
    }
}
