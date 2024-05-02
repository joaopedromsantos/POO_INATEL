package Aula_5;

public abstract class Profissao {
    public String nome;

    public float calcularSalario(float salario){
      return salario;
    };

    public abstract void trabalhar(int horas);
}
