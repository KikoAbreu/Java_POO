package exercicio1;

public class Gato extends Animal {
    protected String nome_gato;
    protected String raca;

// Construtores


    public Gato(String altura, String cor, String nome_gato, String raca) {
        super(altura, cor);
        this.nome_gato = nome_gato;
        this.raca = raca;
    }

    public Gato() {
    }

    // Get and Set
    public String getNome_gato() {
        return nome_gato;
    }

    public void setNome_gato(String nome_gato) {
        this.nome_gato = nome_gato;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String miar(){
        return "miau";
    }



}
