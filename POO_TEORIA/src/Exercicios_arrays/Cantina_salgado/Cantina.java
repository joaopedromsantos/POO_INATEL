package Exercicios_arrays.Cantina_salgado;

public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[5];

    void addSalgado(Salgado novo_Salgado){
        for (int i = 0; i < salgados.length; i++) {
            if(salgados[i] == null){
                salgados[i] = novo_Salgado;
                break;
            }
        }
    }
    void mostraInfo(){
        for (Salgado salgado : salgados) {
            if (salgado != null) {
                System.out.println(salgado.nome);
            }
        }
    }
}
