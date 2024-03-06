package Zumbi_exercicio;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi_1 = new Zumbi();
        Zumbi zumbi_2 = new Zumbi();

        zumbi_1.vida = 120;
        zumbi_2.vida = 230;

        System.out.println(zumbi_1.vida);
        System.out.println(zumbi_2.vida);

        zumbi_1 = zumbi_2;

        System.out.println(zumbi_1.vida);
        System.out.println(zumbi_2.vida);

        System.out.println(zumbi_1.transfereVida(zumbi_2, 190));
    }
}
