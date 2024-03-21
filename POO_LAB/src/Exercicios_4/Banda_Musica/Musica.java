package Exercicios_4.Banda_Musica;

public class Musica {
    private String nome;
    private String album;

    public String getNome() {
        return nome;
    }

    public Musica(String nome, String album) {
        this.nome = nome;
        this.album = album;
    }

    @Override
    public String toString() {
        return nome + " do Album " + album;
    }
}
