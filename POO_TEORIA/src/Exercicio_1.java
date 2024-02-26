public class Exercicio_1 {
    public static void main(String[] args) {

        int lanches_1 = 10;
        int lanches_2 = 4;
        int lanches_3 = 2;

        int total = lanches_1+lanches_2+lanches_3;
        float media = (total)/3f;

        String mediaFormatada = String.format("%.2f", media);

        System.out.println("O total de lanches foi: " + total);
        System.out.println("A média de lanches consumidos foi de: " + mediaFormatada);

    }
}