package Aula_abstract.exe_2;

public abstract class Abstrata implements Comparable<Abstrata> {
    String nome;
    int codigo;

    public Abstrata(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Abstrata o) {
        return Integer.compare(this.codigo, o.codigo);
    }

    @Override
    public String toString() {
        return "Abstrata{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
