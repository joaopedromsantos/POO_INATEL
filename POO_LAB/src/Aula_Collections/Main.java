package Aula_Collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item item_1 = new Item(67, "Avião de Brinquedo");
        Item item_2 = new Item(222, "Mini Cavalo");
        Item item_3 = new Item(10, "Carrinho de Mão");
        Item item_4 = new Item(78, "Palhaço Azul");

        Estoque estoque_1 = new Estoque(new ArrayList<Item>());

        estoque_1.adicionarArray(item_1);
        estoque_1.adicionarArray(item_2);
        estoque_1.adicionarArray(item_3);
        estoque_1.adicionarArray(item_4);

        estoque_1.buscar(2);

        estoque_1.deletar(0);
        estoque_1.deletar(item_3);

        estoque_1.modificar(item_3, 1);

        System.out.println(estoque_1);
    }
}
