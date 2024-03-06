package Exercicios_2.Ex_gato_rato;

public class Gato {
    public String cor;
    public int idade;
    public int velocidade;

    public void brincar(){
        System.out.println("O gato está brincando...");
    }
    public void cacar(Rato rato){
        if (rato.escondido || this.velocidade < rato.velocidade){
            System.out.println("Rato não foi caçado pelo gato");
        } else {
            System.out.println("Rato foi caçado pelo gato");
        }
    }
    public String toString(){
        return
                "\nCor: " + cor +
                "\nIdade: " + idade +
                "\nVelocidade: " + velocidade;
    }
}
