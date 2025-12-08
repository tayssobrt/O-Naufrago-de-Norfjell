import java.util.Scanner;

public class player {
    private String nome;
    private double vida;
    private String arma;

    public  player () {

    }

    public player(String arma, double vida, String nome) {
        this.arma = arma;
        this.vida = vida;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void criarPersonagem(Scanner scanner) {
        System.out.println("Digite o nome do seu personagem: ");
        setNome(scanner.nextLine());
    }

    public void playerMorto() {
        System.out.println("Você morreu");
        System.exit(0);
    }

    public void ataque() {

        switch(getArma()) {
            case "Espada":
                    double dano = 10 + 3;
                break;
            case "Machado":
                 dano = 10 + 5;
                 dano = Math.random() * dano;
                break;
            case "Lança":
                dano = 10 + 2;
                dano = Math.random() * dano;
                break;
            case "Adagas":
                dano = 10 + 1;
                dano = Math.random() * dano;
                break;
            default:
                dano = 10;
                dano = Math.random() * dano;
                break;
        }

    }


}
