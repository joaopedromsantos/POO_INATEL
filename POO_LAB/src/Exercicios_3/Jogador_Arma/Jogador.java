package Exercicios_3.Jogador_Arma;

public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;

    public void atacar(Jogador alvo){

        if (this.energia >= arma.getCustoDeEnergia()){ // Verificando quantidade de energia
            alvo.vida -= arma.getDano();
            this.energia -= arma.getCustoDeEnergia();
        }else {
            System.out.println("Energia insuficiente");
        }
    }

    public Jogador(){
        System.out.println("Criado");
    }
    public Jogador(Arma arma, int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "arma=" + arma +
                ", energia=" + energia +
                ", vida=" + vida +
                '}';
    }
}
