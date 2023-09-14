package exercicio1;
import java.util.Scanner;
public class Main1 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resultado = 0;
        Gato gato1 = new Gato("0,50cm", "Preto", "Zé", "Siames");
        Cachorro cachorro1 = new Cachorro("100cm", "Bege", "Rex", "Vira-lata");


        System.out.println("Cachorro diz: " + cachorro1.latir());
        System.out.println("Gato diz: " + gato1.miar());
        System.out.println("");

        System.out.println("O cachorro ta alimentado? ");
        System.out.println("[1] Sim - [2] Nao");
        resultado = entrada.nextInt();

        while (resultado == 1) {

            System.out.println("\nQuantos passos você deseja que o cachorro ande? ");
            int passos = entrada.nextInt();

            System.out.println("O cachorro esta andando, numero de passos: ");
            for (int i = 1; i <= passos; i++) {
                if (i % 100 != 0) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i);
                    System.out.println("\nO Cachorro está com fome. Deseja alimentar o cachorro? ");
                    System.out.println("[1] Sim - [2] Nao");
                    resultado = entrada.nextInt();
                }
            }

        }
        System.out.println("O cachorro parou.");

        
    }
}
