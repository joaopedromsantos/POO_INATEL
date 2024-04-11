package ResumoProva;

public class Zumbi extends Monstro {
    private int numeroDeCerebrosComidos;

    // Construtor
    public Zumbi(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public int getNumeroDeCerebrosComidos() {
        return numeroDeCerebrosComidos;
    }

    public void setNumeroDeCerebrosComidos(int numeroDeCerebrosComidos) {
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }

    private void atacarComMordida(Monstro monstroAlvo){
        System.out.println("Mordendo");
        monstroAlvo.setVida(0);
        setNumeroDeCerebrosComidos(getNumeroDeCerebrosComidos() + 1);
        setEnergia(getEnergia() - 30);
    }

    @Override
    public void assustar(Monstro monstroAlvo) {
        super.assustar(monstroAlvo);
        atacarComMordida(monstroAlvo);
    }

    @Override
    public String toString() {
        return  "\nZumbi{" +
                "\n   numeroDeCerebrosComidos=" + numeroDeCerebrosComidos +
                super.toString();
    }
}
