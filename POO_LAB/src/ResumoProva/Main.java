package ResumoProva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi_1 = new Zumbi(45, 100, 77);

        Vampiro vampiro_1 = new Vampiro(44, 100, 40);
        vampiro_1.transformar();
        vampiro_1.recuperarVida();

        vampiro_1.atacarComMordida(zumbi_1);

        Bruxa bruxa_1 = new Bruxa(12, 100, 80);
        bruxa_1.aprenderFeitico("Rateire", 34);
        bruxa_1.aprenderFeitico("Ordenus", 12);
        bruxa_1.aprenderFeitico("Lurus", 50);
        bruxa_1.esquecerFeitico(2);
        bruxa_1.listarFeiticos();
        // lançar feitiço abate da vida baseado no poder do feitiço
        bruxa_1.lancarFeitico(vampiro_1, 1);

        // assustar do zumbi esta com sobreposição para atacar com mordida
        zumbi_1.assustar(bruxa_1);

        System.out.println("\n\n Então ficou assim os monstros:");
        System.out.println(zumbi_1);
        System.out.println(vampiro_1);
        System.out.println(bruxa_1);


    }
}
