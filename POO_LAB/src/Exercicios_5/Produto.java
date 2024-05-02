package Exercicios_5;

public class Produto {
    private double valor;
    private String nome;

    public Produto(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Valor: " + valor);
        System.out.println("Nome: " + nome);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "valor=" + valor +
                ", nome='" + nome + '\'' +
                '}' ;
    }
}
