package ResumoProva;

public class Feitico {
    private String nome;
    private int poder;

    public int getPoder() {
        return poder;
    }

    public Feitico(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Feitico{" +
                "nome='" + nome + '\'' +
                ", poder=" + poder +
                '}';
    }
}
