package Aula_4.Musico_Album;

public class Main {
    public static void main(String[] args) {
        Musico slash = new Musico();

        slash.adicionar(new Album("Stranged", 90));
        slash.adicionar(new Album("Sei La", 6));
        slash.adicionar(new Album("Carp", 10));

        slash.listar();

        slash.deletar(1);

        System.out.println("\nApós deletado: ");

        slash.listar();
    }
}
