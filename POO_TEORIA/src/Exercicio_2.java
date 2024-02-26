import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade de lanches consumidos do primeiro momento: ");
        int lanches_1 = entrada.nextInt();
        System.out.println("Insira a quantidade de lanches consumidos do segundo momento: ");
        int lanches_2 = entrada.nextInt();
        System.out.println("Insira a quantidade de lanches consumidos do terceiro momento: ");
        int lanches_3 = entrada.nextInt();

        int total = lanches_1+lanches_2+lanches_3;
        float media = (total)/3f;

        String mediaFormatada = String.format("%.2f", media);

        System.out.println("O total de lanches foi: " + total);
        System.out.println("A média de lanches consumidos foi de: " + mediaFormatada);

        entrada.close();

    }
}
