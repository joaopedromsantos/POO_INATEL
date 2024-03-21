package Exercicios_4.Banda_Musica;

public class Main {
    public static void main(String[] args) {
        Banda banda_1 = new Banda("Carrossel", 6);

        banda_1.adicionarMusica(new Musica("Castelo Amarelo", "Pilot"));
        banda_1.adicionarMusica(new Musica("Asa de Trovão", "Querer"));
        banda_1.adicionarMusica(new Musica("Enriquecido", "Assim Espero"));

        banda_1.tocarMusica(2);

        banda_1.deletarMusica("Enriquecido");

        banda_1.tocarShow();

        System.out.println(banda_1);

    }
}
