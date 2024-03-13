package Exercicios_3.Conta_Cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf, double saldo, double limite) {
        this.conta = new Conta(saldo, limite);
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public boolean sacarDinheiro(double valor){
        if(this.conta.getSaldo() >= valor){
            this.conta.setSaldo(this.conta.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }
    public void depositarDinheiro(double valor){
        this.conta.setSaldo(
                valor + this.conta.getSaldo()
        );
    }

    public boolean comprarComCredito(double valor){
        if ((this.conta.getLimite()) >= valor){

        }
    }

    public boolean transferir(Conta contaParaReceber,double valor){

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conta=" + conta +
                '}';
    }
}
