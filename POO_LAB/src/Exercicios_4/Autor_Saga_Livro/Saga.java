package Exercicios_4.Autor_Saga_Livro;

import java.util.Arrays;

public class Saga {
    private int nota;
    private Livro[] livros;
    private String nome;

    public Saga(int nota, String nome) {
        this.nota = nota;
        this.nome = nome;
        this.livros = new Livro[5];
    }

    public void listarLivros(){
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro);
            }
        }
    }

    public void adicionarLivro(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null){
                livros[i] = livro;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Saga{" +
                "nota=" + nota +
                ", livros=" + Arrays.toString(livros) +
                '}';
    }
}
