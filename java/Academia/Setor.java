package Academia;

import java.util.ArrayList;

public class Setor {
    private int idSetor;
    private String nome;

    private ArrayList<Unidade> unidades;

    private ArrayList<Colaborador> colaboradores;
    public Setor(int idSetor, String nome, ArrayList<Colaborador> colaboradores, ArrayList<Unidade> unidades) {
        this.idSetor = idSetor;
        this.nome = nome;
        this.colaboradores = colaboradores;
        this.unidades = unidades;
    }
    public int getIdSetor(){
        return this.idSetor;
    }
    public void setIdSetor(int idSetor){
        this.idSetor = idSetor;
    }
    public String getNome(){

        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public ArrayList<Unidade> getUnidades(){
        return this.unidades;
    }

    public  void setUnidades (ArrayList<Unidade> unidades){
        this.unidades = unidades;
    }
}
