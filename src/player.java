import java.util.Scanner;

public class player {
    private String nome;
    private String vida;
    private String arma;

    public  player () {

    }

    public player(String arma, String vida, String nome) {
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

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public void criarPersonagem(Scanner scanner) {
        System.out.println("Digite o nome do seu personagem: ");
        setNome(scanner.nextLine());

    }

}
