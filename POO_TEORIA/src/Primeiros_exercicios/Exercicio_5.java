package Primeiros_exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int num;
        int tentativa = 0;

        // De 1 a 10
        num = rand.nextInt(10) + 1;

        do {
            System.out.println("Qual número estou pensando? ");
            tentativa = entrada.nextInt();

            if (tentativa != num)
                System.out.println("Tentativa errada");
        }while (tentativa != num);

        System.out.println("Acertou");

        entrada.close();
    }
}
