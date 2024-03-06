package Aula_2;

public class Steve {

    public int vida;
    public int fome;
    public int armadura;
    public float xp;

    public Ferramenta ferramenta = new Ferramenta();
    public void correr(){
        System.out.println("Ele esta correndo");
    }

    public void andar(){
        System.out.println("Ele esta correndo");
    }

    public String toString(){
        return "Vida: " + this.vida + "\nFome: " + this.fome +
                "\nArmadura: " + this.armadura + "\nXP: " + this.xp +
                "\nFerramenta: " + this.ferramenta.nome;
    }

    // construtor
    Steve(int vida, int fome){
        this.vida = vida;
        this.fome = fome;

        System.out.println("Steve criado");
    }
}
