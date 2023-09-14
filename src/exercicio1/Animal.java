package exercicio1;

public class Animal {
    String altura;
    String cor;


    // construtores
    public Animal(String altura, String cor) {
        this.altura = altura;
        this.cor = cor;
    }

    public Animal(){}




    // getters and setters
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
