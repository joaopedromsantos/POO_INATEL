package Aula_4.Musico_Album;

public class Musico {
    private String nome;
    private Album[] albuns = new Album[15];

    public void adicionar(Album album){
        for (int i = 0; i < albuns.length; i++) {
            if (albuns[i] == null){
                albuns[i] = album;
                break;
            }
        }
    }

    public void listar(){
        for (Album albun : albuns) {
            if (albun != null) {
                System.out.println(albun.getNome() + " ---- " + albun.getNota());
            }
        }
    }

    public void deletar(int posicao){
        albuns[posicao] = null;
    }

    public void deletar(String nome){
        for (int i = 0; i < albuns.length; i++) {
            if(albuns[i] != null){
                if (albuns[i].getNome() == nome){
                    albuns[i] = null;
                }
            }
        }
    }

}
