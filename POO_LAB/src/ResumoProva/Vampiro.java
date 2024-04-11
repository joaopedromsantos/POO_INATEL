package ResumoProva;

public class Vampiro extends Monstro{
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    // Construtor
    public Vampiro(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public boolean isFormaDeMorcego() {
        return formaDeMorcego;
    }

    public int getMedidorDeSangue() {
        return medidorDeSangue;
    }

    public void setMedidorDeSangue(int medidorDeSangue) {
        this.medidorDeSangue = medidorDeSangue;
    }

    public void setFormaDeMorcego(boolean formaDeMorcego) {
        this.formaDeMorcego = formaDeMorcego;
    }

    public void transformar(){
        System.out.println("Transformando");
        setFormaDeMorcego(!isFormaDeMorcego());
    }

    public void recuperarVida(){
        System.out.println("Recuperando vida");
        setVida(getVida() + 15);
    }

    public void atacarComMordida(Monstro monstroAlvo){
        System.out.println("\nAtacando com mordida o monstro\n");
        setMedidorDeSangue(getMedidorDeSangue() + (monstroAlvo.getVida()/2));
        setEnergia(getEnergia() - 10);
        monstroAlvo.setVida(monstroAlvo.getVida()/2);
    }

    @Override
    public String toString() {
        return  "\nVampiro{" +
                "\n   medidorDeSangue=" + medidorDeSangue +
                "\n   formaDeMorcego=" + formaDeMorcego +
                super.toString();
    }
}
