package Aula_2;

public class Main {
    public static void main(String[] args) {
//        // new é quando cria um novo objeto
//        Steve steve = new Steve(10, 5);
//        steve.vida = 10;
//        steve.fome = 5;
//        steve.xp = 20;
//
//        Steve steve2 = new Steve(30, 56);
//
//        steve.ferramenta.nome = "Machado";
//        System.out.println(steve);
        Carro fusca = new Carro(55, 240, false);
        fusca.correr();
        System.out.println(fusca.pneu);
        System.out.println(fusca.motor.potencia);
        System.out.println(fusca.motor.turbo);
    }
}
