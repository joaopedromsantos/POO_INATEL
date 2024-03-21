package Exercicios_arrays.Cantina_salgado;

public class Main {
    public static void main(String[] args) {
        Cantina cantina_1 = new Cantina();
        cantina_1.nome = "Cantina do Inatel";

        Salgado salgado_1 = new Salgado();
        salgado_1.nome = "Coxinha";

        Salgado salgado_2 = new Salgado();
        salgado_2.nome = "Pastel";

        Salgado salgado_3 = new Salgado();
        salgado_3.nome = "Lanche Natural";



        cantina_1.addSalgado(salgado_1);
        cantina_1.addSalgado(salgado_2);
        cantina_1.addSalgado(salgado_3);

        cantina_1.mostraInfo();
    }
}
