package Exercicios_5;

public class Console extends Produto {
    private String geracao;
    private String marca;

    public Console(double valor, String nome) {
        super(valor, nome);
    }

    public void jogar(){
        System.out.println("Está jogando!");
    }


}
