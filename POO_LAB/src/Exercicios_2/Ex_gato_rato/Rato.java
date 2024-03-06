package Exercicios_2.Ex_gato_rato;

public class Rato {
    public float velocidade;
    public boolean escondido;

    public void esconder(){
        escondido = true;
    }
    public void procurarComida(){
        escondido = false;
    }
    public String toString(){
        return
                "\nVelocidade: " + velocidade +
                "\nEscondido: " + (escondido ? "Sim" : "Não");
    }
}
