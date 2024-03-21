package Exercicios_4.Autor_Saga_Livro;

import java.util.Arrays;

public class Autor {
    private String nome;
    private Saga[] sagas = new Saga[20];

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void listarSagas(){
        for (Saga saga : sagas) {
            if (saga != null) {
                System.out.println(saga);
            }
        }
    }

    public void adicionarSaga(Saga saga){
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] == null){
                sagas[i] = saga;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", sagas=" + Arrays.toString(sagas) +
                '}';
    }
}
