package Zumbi_exercicio;

public class Zumbi {
    double vida;
    String nome;

    public double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(this.vida > quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        } else {
            System.out.println("Não posso transferir a quantidade de vida");
            return false;
        }

    }
}
