package Exercicios_4.Banda_Musica;

import java.util.Arrays;

public class Banda {
    private Musica[] musicas = new Musica[20];
    private String nome;
    private int numeroDeIntegrantes;

    public Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }

    public void tocarMusica(int posicao){
        if (musicas[posicao] != null){
            System.out.println("A música " + musicas[posicao].toString() + ", está tocando...");
        }
    }

    public void tocarShow(){
        System.out.println("A banda está tocando no show!!!");
    }

    public boolean adicionarMusica(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null){
                musicas[i] = musica;
                return true;
            }
        }
        return false;
    }

    public boolean deletarMusica(String nome){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i].getNome() == nome){
                musicas[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Banda{" +
                "musicas=" + Arrays.toString(musicas) +
                ", nome='" + nome + '\'' +
                ", numeroDeIntegrantes=" + numeroDeIntegrantes +
                '}';
    }
}
