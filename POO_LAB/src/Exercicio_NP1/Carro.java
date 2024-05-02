package Exercicio_NP1;

public class Carro {
    private Motor motor;
    private int tipoDePneu;

    public int getTipoDePneu() {
        return tipoDePneu;
    }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        this.motor = new Motor(potencia, turbo);
        this.tipoDePneu = tipoDePneu;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }
}
