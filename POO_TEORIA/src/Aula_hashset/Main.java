package Aula_hashset;

import Aula_abstract.exe_2.Abstrata;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        double quantidade = 10000000000.0;

        List<Integer> lista = new ArrayList<>();

        double ti = System.currentTimeMillis();

        for(int i = 0; i < quantidade; i++){
            lista.add(1);
        }

        double tf = System.currentTimeMillis();

        System.out.println(tf - ti);
    }
}
