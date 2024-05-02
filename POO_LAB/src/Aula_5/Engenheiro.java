package Aula_5;

public class Engenheiro extends Profissao implements GerenciaProjeto{

    @Override
    public float calcularSalario(float salario) {
        return (salario*1.5f);
    }

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
