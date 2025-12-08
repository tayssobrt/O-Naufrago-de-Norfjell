import java.util.Random;

public class inimigo {
    private String nome;
    private String vida;
    private String dano;

    public inimigo() {
    }

    public inimigo(String nome, String vida, String dano) {
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

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
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
