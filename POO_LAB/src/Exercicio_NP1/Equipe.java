package Exercicio_NP1;

import java.util.Arrays;

public class Equipe {
    private Carro carro;
    private Piloto[] pilotos = new Piloto[4];
    private Piloto pilotoAtual;
    private String Nome;

    public Equipe(String nome) {
        Nome = nome;
    }

    private boolean trocarPilotoAtual(int pilotoid){
        if(pilotoAtual.getId() != pilotoid){
            pilotoAtual = pilotos[pilotoid];
            return true;
        }
        return false;
    }
    private boolean trocarPneu(int tipoDePneu){
        if(carro.getTipoDePneu() != tipoDePneu){
            carro.setTipoDePneu(tipoDePneu);
            return true;
        }
        return false;
    }
    public void pitStop(int tipoDePneu, int pilotoId){
        boolean encontrado = false;
        for (Piloto piloto : pilotos) {
            if (piloto != null && piloto.getId() == pilotoId) {
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            trocarPilotoAtual(pilotoId);

            System.out.println("Piloto trocado com sucesso!!!");
        } else {
            System.out.println("Piloto não encontrado na lista!!!!");
        }
        if (tipoDePneu <= 5 && tipoDePneu > 0) {
            trocarPneu(tipoDePneu);
            System.out.println("Pneu trocado com sucesso!!!");
        } else {
            System.out.println("Pneu inválido!!!!");
        }
    }
    public boolean adicionarPiloto(Piloto piloto){
        for(int i = 0; i < pilotos.length; i++){
            if(pilotos[i] == null){
                pilotos[i] = piloto;
                // Lógica para que o piloto atual seja o ultimo
                pilotoAtual = piloto;

                return true;
            }
        }
        return false;
    }
    public boolean retirarPiloto(int pilotoId){
        for(int i = 0; i < pilotos.length; i++){
            if(pilotos[i] != null && pilotos[i].getId() == pilotoId){
                pilotos[i] = null;
                return true;
            }
        }
        return false;
    }
    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo){
        this.carro = new Carro(tipoDePneu, potencia, turbo);
    }

    public Carro getCarro() {
        return carro;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "carro=" + carro +
                ", pilotos=" + Arrays.toString(pilotos) +
                ", pilotoAtual=" + pilotoAtual +
                ", Nome='" + Nome + '\'' +
                '}';
    }
}
