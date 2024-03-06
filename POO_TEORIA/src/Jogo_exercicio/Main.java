package Jogo_exercicio;

public class Main {
    public static void main(String[] args) {
        Personagem personagem_1 = new Personagem();
        personagem_1.nome = "Reinaldo";

        Arma arma_1 = new Arma();
        arma_1.nome = "Faca";

        personagem_1.arma = arma_1;

    }
}
