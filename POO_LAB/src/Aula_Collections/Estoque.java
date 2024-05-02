package Aula_Collections;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Item> itensArray;

    @Override
    public String toString() {
        return "Estoque{" +
                "itensArray=" +
                itensArray
                +
                '}';
    }

    public Estoque(ArrayList<Item> itensArray) {
        this.itensArray = itensArray;
    }

    public void adicionarArray(Item item){
        itensArray.add(item);
    }
    public void buscar(int posicao){
        System.out.println(itensArray.get(posicao));
    }
    public void deletar(int posicao){
        itensArray.remove(posicao);
        System.out.println("Deletado por posição com sucesso!!");
    }
    public void deletar(Item item){
        itensArray.remove(item);
        System.out.println("Deletado por objeto com sucesso!!");
    }
    public void modificar(Item item, int posicao){
        itensArray.set(posicao, item);
    }
}
