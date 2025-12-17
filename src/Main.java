import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        combate c = new combate();
        jogo j = new jogo();
        introducao intro = new introducao();
        player p = new player();
        Inimigo i = new Inimigo();

        intro.iniciar(sc, p);
        intro.missao01(sc, p);
        j.chegadaAIlhaVerde(sc);
        c.lutar(p, i);
        }
}