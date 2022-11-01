package Academia;

public class Setor {
    private int idSetor;
    private String nome;

    public Setor(int idSetor, String nome) {
        this.idSetor = idSetor;
        this.nome = nome;
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

}
