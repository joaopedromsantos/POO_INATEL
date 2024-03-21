package Exercicios_4.Autor_Saga_Livro;

import java.util.Arrays;

public class Saga {
    private int nota;
    private Livro[] livros = new Livro[20];

    public Saga(int nota) {
        this.nota = nota;
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
