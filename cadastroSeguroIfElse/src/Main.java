import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome ? ");
        String nome = teclado.nextLine();
        System.out.println(" " + nome +  " qual o valor aproximado de sua renda ? ");
        double renda = teclado.nextDouble();
        System.out.println("E quantos anos você tem ? ");
        int idade = teclado.nextInt();
        if (renda >= 3000) {
            System.out.println("Prabéns seu seguro foi aprovado, um de nossos consultores entrará em contato. ");
        }
        else {
            System.out.println("Não foi possível prosseguir com a contratação, o seguro não foi aprovado dessa vez. ");
        }

        teclado.close();
    }
}