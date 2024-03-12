package Aula_3;

public class Main {
    public static void main(String[] args) {
        Gato gatinho = new Gato();
        gatinho.setNome("Morgana");
        System.out.println(gatinho.getNome());

        Gato gatinho2 = new Gato();

        System.out.println(Gato.getNumDeGatos());
    }
}
