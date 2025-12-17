import java.util.Random;

public class Inimigo {
    private String nome;
    private int vida;
    private double dano;

    public Inimigo() {
    }

    public Inimigo(String nome, int vida, double dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public void atacar(player p) {
        double dano = Math.random() * (5 - 1) + 1;
        double novaVida = p.getVida() - dano;

        if(novaVida < 0) {
            System.out.println("Você morreu");
            p.playerMorto();
        }

        p.setVida(novaVida);
    }

}
