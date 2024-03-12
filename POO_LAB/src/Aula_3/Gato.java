package Aula_3;

public class Gato {
    public static int numDeGatos;
    private String nome;
    private int idade;
    private int velocidade;

    public Gato(){
        numDeGatos++;
    }

    public static int getNumDeGatos(){
        return numDeGatos;
    }

    // Utilizando getter e setter com alt+insert
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
