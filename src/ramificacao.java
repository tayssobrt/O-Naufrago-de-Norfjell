import java.util.Scanner;

public class ramificacao {

    public void ProcurarNavio(Scanner sc) {
            System.out.println("Elda:");
            System.out.println("Então sua memória não voltou… isso é preocupante. Talvez algo no acidente te afetou.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Garon:");
            System.out.println("Se quer respostas, comece falando com os pescadores ao norte. Eles viram algo na noite da tempestade.");
            System.out.print("...");
            sc.nextLine();
            jogo j = new jogo();
            j.NovamentePraia(sc);

    }

    public void irSo(Scanner sc) {
        System.out.println("Elda:");
        System.out.println("Seguir sozinho? Você mal consegue se manter em pé. Por favor, repense isso.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Mas se essa é sua escolha… não vou impedir. Só saiba que Ilhaverde não é gentil com forasteiros.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Eu preciso ir… não posso ficar parado.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Então escolha seu caminho:");
        System.out.println("1 - Voltar para a praia, talvez haja algo lá.");
        System.out.println("2 - Entrar na floresta ao leste.");
        System.out.print("Escolha: ");
        int escolhaSozinho = sc.nextInt();
        sc.nextLine();
        System.out.println();

        if (escolhaSozinho == 1) {
            System.out.println("Narrador:");
            System.out.println("Você retorna à praia donde acordou. O mar parece calmo… calmo demais.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Você se aproxima da água, tentando lembrar algo… qualquer coisa.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Então sente algo agarrar seu tornozelo.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Uma Sereia surge sob a água… e te puxa com força para baixo.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Seu grito ecoa por um segundo… até desaparecer sob as ondas geladas.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("GAME OVER.");
            System.exit(0);
        } else {
            System.out.println("Narrador:");
            System.out.println("Você segue para a floresta ao leste. A névoa cobre o chão e o silêncio é absoluto.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Algo se move entre as árvores… passos leves, circulando você.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Um rosnado baixo ecoa. E então outro. E outro.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Quando percebe, já está cercado por três lobos enormes.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("Você tenta correr, mas eles avançam antes que dê um passo.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Narrador:");
            System.out.println("O último som que você ouve é o rasgo rápido das presas.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("GAME OVER.");
            System.exit(0);

                }
            }
        }





