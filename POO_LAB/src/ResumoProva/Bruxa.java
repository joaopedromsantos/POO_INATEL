package ResumoProva;

import java.util.Arrays;

public class Bruxa extends Monstro{
    private Feitico[] feiticos = new Feitico[10];

    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public boolean aprenderFeitico(String nome, int poder){
        for(int i = 0; i < feiticos.length; i++){
            if(feiticos[i] == null){
                feiticos[i] = new Feitico(nome, poder);
                return true;
            }
        }
        return false;
    }

    public void listarFeiticos(){
        for (Feitico feitico : feiticos) {
            if (feitico != null) {
                System.out.println(feitico);
            }
        }
    }

    public  void esquecerFeitico(int posicao){
        feiticos[posicao] = null;
    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao){
        if(feiticos[posicao] != null) {
            System.out.println("Atacando com o feitiço: " + feiticos[posicao]);
            setEnergia(getEnergia() - 30);
            monstroAlvo.setVida(monstroAlvo.getVida() - feiticos[posicao].getPoder());
        } else {
            System.out.println("Feitiço não encontrado!!");
        }
    }

    @Override
    public String toString() {
        return  "\nBruxa{" +
                "\n   feiticos=" + Arrays.toString(feiticos) +
                super.toString();
    }
}
