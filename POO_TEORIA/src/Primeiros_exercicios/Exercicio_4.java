package Primeiros_exercicios;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o número de alunos matriculados em C206/C125:");
        int alunos = entrada.nextInt();

        switch (alunos){
            case 10, 20:
                System.out.println("A sala utilizada será a I-16");
                break;
            case 30:
                System.out.println("A sala utilizada será a I-22");
                break;
            default:
                System.out.println("Valores de alunos válidos: 10, 20 ou 30");
        }

        entrada.close();
    }
}
