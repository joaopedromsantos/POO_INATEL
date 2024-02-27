import java.util.Scanner;

public class Exercicio_1 {

    public static int fatorial(int n){

        if (n == 1)
            return 1;

        else
            return n * fatorial(n-1);
    }
    public static void mostraPares(int n){ // função para calcular (entre), ou seja, não contabilizado 0 e nem o 'n'
        int numeroDePares = 0;

        for (int i = 1; i < n; i++){
            if (i % 2 == 0)
                numeroDePares++;
        }

        System.out.println("A quantidade de números pares dentre 0 e " + n + " é: ");
        System.out.println(numeroDePares);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Inserindo scanner para entrada de dados

        int numCalcFat; // variavel que recebe o número que será usado para o cálculo fatorial
        int resultFat; // Que recebe o resultado do fatorial

        System.out.println("Insira o número que será calculado o fatorial: ");
        numCalcFat = entrada.nextInt(); // Recebendo número int

        resultFat = fatorial(numCalcFat);
        System.out.println(resultFat);

        // --------------------------------------------------------------------------------------------------- //

        int numCalcPar; // variavel que recebe o número que será usado para o cálculo de números pares

        System.out.println("Insira o número que será contabilizado a quantidade de números pares entre 0 e ele: ");
        numCalcPar = entrada.nextInt();

        mostraPares(numCalcPar);


        entrada.close();
    }

}
