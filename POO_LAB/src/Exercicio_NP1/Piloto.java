package Exercicio_NP1;

public class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;
    private static int idGeral;
    private int id;

    public int getId() {
        return id;
    }


    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        idGeral += 1;
        this.id = idGeral;
    }

    public void correr(Carro carro){
        System.out.println(this.nome +" correndo");
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", id=" + id +
                '}';
    }
}
