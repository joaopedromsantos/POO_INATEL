package Primeiros_exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int np3;
        int npa;

        System.out.println("Digite a nota NPA: ");
        npa = entrada.nextInt();

        if (npa >= 60){
            System.out.println("Deu bom!");
        } else{
            System.out.println("Digite a nota NP3: ");

            np3 = entrada.nextInt();

            if ((npa + np3)/2 >= 50){
                System.out.println("Deu bom!");
            } else {
                System.out.println("Até semestre que vem!!");
            }
        }
    }
}