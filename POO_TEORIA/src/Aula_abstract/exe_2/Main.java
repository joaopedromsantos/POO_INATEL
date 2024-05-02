package Aula_abstract.exe_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Classe1 classe1 = new Classe1("Ford", 14);
        Classe2 classe2 = new Classe2("Chevrolet", 16);
        Classe3 classe3 = new Classe3("Volkswagen", 11);

        List<Abstrata> lista = new ArrayList<>();

        lista.add(classe1);
        lista.add(classe2);
        lista.add(classe3);

        Collections.sort(lista);

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).codigo);
        }


    }
}
