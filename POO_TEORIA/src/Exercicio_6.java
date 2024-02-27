import java.util.Random;
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int num;
        int numTentativa;

        // De 1 a 10
        num = rand.nextInt(10) + 1;

        do {
            System.out.println("Qual número estou pensando? ");
            numTentativa = entrada.nextInt();

            if (numTentativa > num)
                System.out.println("O número inserido é maior que o gerado");
            else if (numTentativa < num)
                System.out.println("O número inserido é menor que o gerado");

        } while (numTentativa != num);

        System.out.println("Acertou");

        entrada.close();
    }

}
