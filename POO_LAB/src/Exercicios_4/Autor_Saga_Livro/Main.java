package Exercicios_4.Autor_Saga_Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro_1 = new Livro("Harry Potter 1", 321);
        Livro livro_2 = new Livro("Alice", 234);
        Livro livro_3 = new Livro("Corredor", 600);
        Livro livro_4 = new Livro("O Procurado", 111);

        Saga saga_1 = new Saga(77);
        saga_1.adicionarLivro(livro_2);
        saga_1.adicionarLivro(livro_4);

        saga_1.listarLivros();

        Saga saga_2 = new Saga(66);
        saga_2.adicionarLivro(livro_1);
        saga_2.adicionarLivro(livro_3);

        saga_2.listarLivros();

        Autor autor_1 = new Autor("Roberto Cavalcanti");
        autor_1.adicionarSaga(saga_1);
        autor_1.adicionarSaga(saga_2);

        autor_1.listarSagas();

        System.out.println(autor_1);


    }
}
