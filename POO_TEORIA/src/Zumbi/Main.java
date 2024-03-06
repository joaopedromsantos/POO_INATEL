package Zumbi;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi.vida = 60;
        zumbi.altura = 1.76F;
        zumbi.forca = 874;
        zumbi.nome = "Elias";

        zumbi2.nome = "João";

        System.out.println(
                "O nome do Zumbi é " + zumbi.nome
        );

        zumbi.andar();
        zumbi.seAlimentar();

        zumbi.iniciar();

        System.out.println(
                "O nome do Zumbi é " + zumbi.nome
        );

    }
}
