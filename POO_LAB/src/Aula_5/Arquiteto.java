package Aula_5;

public class Arquiteto extends Profissao implements GerenciaProjeto{

    @Override
    public void trabalhar(int horas) {
        System.out.println("Trabalhando " + horas + " horas");
    }

    @Override
    public void gerenciar() {

    }

    @Override
    public void consultarCronograma() {

    }
}
