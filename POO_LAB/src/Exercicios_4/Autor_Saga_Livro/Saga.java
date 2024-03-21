package Exercicios_4.Autor_Saga_Livro;

public class Saga {
    private int nota;
    private Livro[] livros;

    public Saga(int nota, Livro[] livros) {
        this.nota = nota;
        this.livros = livros;
    }

    public void listarLivros(){
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null){
                System.out.println(livros[i]);
            }
        }
    }
}
