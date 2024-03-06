package Aula_2;

public class Carro {
    public Motor motor;
    public int pneu;
    public void correr(){
        System.out.println("Carro está correndo.......");
    }
    public Carro(int pneu, int potencia, boolean turbo){
        this.pneu = pneu;
        // Fortemente ligado
        this.motor = new Motor(potencia, turbo);
    }
}
