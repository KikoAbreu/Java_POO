package exercicio1;

public class Cachorro extends Animal {
    String nome;
    String raca;


   // Construtores

    public Cachorro(String altura, String cor, String nome, String raca) {
        super(altura, cor);
        this.nome = nome;
        this.raca = raca;
    }

    public Cachorro() {
    }


    //Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String latir(){
        String latido = "auau";
        return latido;
    }
}
