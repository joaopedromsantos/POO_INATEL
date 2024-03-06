package Zumbi;

public class Zumbi {

    int vida;
    String nome;
    float altura;
    int forca;

    void iniciar(){
        vida = 100;
        nome = "Roberto";
        altura = 1.40F;
        forca = 997;
    }
    void andar(){
        System.out.println("Zumbi Andando...");
    }
    void seAlimentar(){
        System.out.println("Zumbi se alimentando");
    }

}
