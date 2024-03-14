package Exercicios_3.Conta_Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente usuario_1 = new Cliente("Joaquim","135.786.655-90", 980,1700);
        Cliente usuario_2 = new Cliente("Roberto","222.124.543-60", 2000,1000);
        Cliente usuario_3 = new Cliente("Luíza","651.234.111-10", 100,300);

        usuario_1.sacarDinheiro(100);
        System.out.println(usuario_1);

        usuario_2.depositarDinheiro(300);
        System.out.println(usuario_2);

        usuario_2.comprarComCredito(200);
        System.out.println(usuario_2);

        usuario_1.transferir(usuario_3, 500);
        System.out.println(usuario_1);
        System.out.println("-------------");
        System.out.println(usuario_3);

        System.out.println(" ");
        System.out.println("Final ficou assim");
        System.out.println(usuario_1);
        System.out.println("-------------");
        System.out.println(usuario_2);
        System.out.println("-------------");
        System.out.println(usuario_3);
        System.out.println("-------------");


    }
}
