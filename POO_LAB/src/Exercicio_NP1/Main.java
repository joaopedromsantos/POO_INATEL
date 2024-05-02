package Exercicio_NP1;

public class Main {
    public static void main(String[] args) {
        Piloto piloto_1 = new Piloto("Ayrton Senna", 46, "Brasileiro");
        Piloto piloto_2 = new Piloto("Luciano", 22, "Brasileiro");
        Piloto piloto_3 = new Piloto("Renter", 43, "Sueco");
        Piloto piloto_4 = new Piloto("Robert", 30, "Estadunidense");
        Piloto piloto_5 = new Piloto("Vizeu", 18, "Argentino");

        Equipe equipe_1 = new Equipe("Mercedes");

        equipe_1.constroiCarro(2, 870, true);
        equipe_1.adicionarPiloto(piloto_1);
        equipe_1.adicionarPiloto(piloto_2);
        equipe_1.adicionarPiloto(piloto_3);
        equipe_1.adicionarPiloto(piloto_4);
        // Não vai adicionar o quinto
        equipe_1.adicionarPiloto(piloto_5);

        equipe_1.retirarPiloto(3);

        equipe_1.pitStop(1, 1);

        piloto_1.correr(equipe_1.getCarro());

        System.out.println(equipe_1);
    }
}
