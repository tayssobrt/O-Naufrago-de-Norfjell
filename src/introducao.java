import java.util.Scanner;

public class introducao {

    player p = new player();

    public void iniciar(Scanner sc) {

        System.out.println("----------------------");
        System.out.println("Bem-vindo ao NorfJell!");
        System.out.println("----------------------");
        System.out.println("Aperte Qualquer tecla após");
        System.out.println("uma fala para continuar o jogo");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Você acorda na praia de Porthar, sem memória do que aconteceu nas últimas horas.");
        System.out.println("Um pescador chamado Garon te encontra e te leva para dentro da vila.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Ei... você está vivo? Consegue me ouvir?");
        System.out.print("Você: ...Onde... eu estou...? ");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Na praia de Porthar. Te encontrei preso nas algas, quase sem ar.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Você:");
        System.out.println("Meu... barco... o que aconteceu?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Calma. Você bateu forte a cabeça. Consegue se levantar?");
        System.out.print("Você: Acho... que sim.");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Cuidado aí. O mar não pegou leve contigo.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Você:");
        System.out.println("Eu... não consigo lembrar de tudo.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("É normal. Depois de um naufrágio, a memória foge da gente.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Você:");
        System.out.println("Eu lembro só de ondas... e gritos...");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Hm. Então você não foi o único.");
        System.out.print("Você: 'O único'? O que quer dizer?");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Algumas pessoas estão sumindo no mar. Não é só tempestade.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Antes de seguirmos, preciso saber...");
        System.out.println("Com qual arma você sabe lutar?");
        System.out.println();

        System.out.println("1 - Espada");
        System.out.println("2 - Machado");
        System.out.println("3 - Lança");
        System.out.println("4 - Adagas");
        System.out.print("Escolha sua arma: ");
        int escolhaArma = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch(escolhaArma) {
            case 1:
                System.out.println("Você:");
                System.out.println("Espada. Nada muito elegante, só o básico.");
                p.setArma("Espada");
                break;
            case 2:
                System.out.println("Você:");
                System.out.println("Machado. Se vier na minha direção, eu corto.");
                p.setArma("Machado");
                break;
            case 3:
                System.out.println("Você:");
                System.out.println("Lança. Mantém distância, é isso que importa.");
                p.setArma("Lança");
                break;
            case 4:
                System.out.println("Você:");
                System.out.println("Adagas. Rápido, silencioso... preciso de movimento.");
                p.setArma("Adagas");
                break;
            default:
                System.out.println("Você:");
                System.out.println("Eu... não sei. Mas vou descobrir no caminho.");
                break;
        }
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Boa. Uma arma dessas pode salvar tua vida neste lugar.");
        System.out.println("Você:");
        System.out.println("Eu vou precisar dela... não é?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Vai. E mais cedo do que pensa.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Um lobo enorme — maior que qualquer outro — anda caçando perto da estrada norte.");
        System.out.println("Você:");
        System.out.println("E quer que eu enfrente isso... logo agora?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Sei que mal consegue ficar de pé, mas a vila está com medo.");
        System.out.println("Você:");
        System.out.println("E você não consegue lidar com isso sozinho?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Se eu pudesse, não estaria pedindo.");
        System.out.println();
        System.out.println("1 - Aceitar ajudar");
        System.out.println("2 - Recusar");
        System.out.print("Escolha: ");
        int ajuda = sc.nextInt();
        sc.nextLine();
        System.out.println();

        if(ajuda == 1) {
            System.out.println("Você:");
            System.out.println("Tá certo... eu ajudo. Não vou ficar sentado esperando.");
            System.out.println("Garon:");
            System.out.println("Assim se fala. Pegue sua arma. Vamos resolver isso antes do anoitecer.");
        } else {
            System.out.println("Você:");
            System.out.println("Desculpe... eu mal sei quem sou. Não posso lutar agora.");
            System.out.println("Garon:");
            System.out.println("Entendo. Mas a vila vai estranhar.");
            System.out.println("Você:");
            System.out.println("Eu só... preciso de tempo.");
            System.out.println("Garon:");
            System.out.println("Tempo é coisa rara por aqui, estrangeiro. Mas tudo bem. Descanse.");
        }
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        if(ajuda == 1) {
            System.out.println("p.getNome()");
            System.out.println("Esse lobo... você o viu?");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Garon:");
            System.out.println("De longe. Olhos amarelos. Grande demais pra ser normal.");
            System.out.println("Você:");
            System.out.println("Ótimo... é tudo que eu precisava hoje.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();

            System.out.println("Garon:");
            System.out.println("Ha! Pelo menos não perdeu o humor.");
            System.out.print("...");
            sc.nextLine();
            System.out.println();
        }
    }

    public void missao01(Scanner sc) {
        // INÍCIO DA MISSÃO DO LOBO

        p.setVida(100);
        System.out.println("NARRADOR:");
        System.out.println("Você caminha pela estrada norte. O vento frio corta o rosto, e um cheiro de sangue fraco paira no ar.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("NARRADOR:");
        System.out.println("O lobo aparece... enorme, com pelos desgrenhados e olhos vermelhos brilhando.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Lobo:");
        System.out.println("*Rugido feroz ecoando entre as árvores*");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

// FALA DO JOGADOR VARIADA PELA ARMA
        switch(p.getArma()) {
            case "Espada":
                System.out.println("Você:");
                System.out.println("Com a espada em punho, vou perfurar o coração dessa fera.");
                break;
            case "Machado":
                System.out.println("Você:");
                System.out.println("Com o machado pronto, vou esmagar o que vier até mim.");
                break;
            case "Lança":
                System.out.println("Você:");
                System.out.println("Com a lança, mantenho distância. Puxem-se para trás.");
                break;
            case "Adagas":
                System.out.println("Você:");
                System.out.println("Adagas na mão. Vou tentar cortar e sair antes que ele contra-ataque.");
                break;
            default:
                System.out.println("Você:");
                System.out.println("Sem arma certa, vou improvisar e confiar na sorte.");
                break;
        }
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("NARRADOR:");
        System.out.println("A luta é rápida e brutal. O lobo ataca com ferocidade, mas você conhece sua arma.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        switch(p.getArma()) {
            case "Espada":
                System.out.println("NARRADOR:");
                System.out.println("Você desfere um golpe limpo com a espada, abrindo o flanco do lobo. Ele cambaleia e cai.");
                break;
            case "Machado":
                System.out.println("NARRADOR:");
                System.out.println("Você levanta o machado e desce com toda a força — o impacto faz o lobo tombar.");
                break;
            case "Lança":
                System.out.println("NARRADOR:");
                System.out.println("Com a lança você crava o ferro no peito do lobo, mantendo distância segura enquanto a fera sucumbe.");
                break;
            case "Adaga":
                System.out.println("NARRADOR:");
                System.out.println("Você salta para perto, fincando uma adaga entre as costelas, depois recua para evitar a mordida final.");
                break;
            default:
                System.out.println("NARRADOR:");
                System.out.println("Você luta com o que tem, consegue ferir o animal e, por sorte, ele cai.");
                break;
        }
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("NARRADOR:");
        System.out.println("O lobo cai. Entre seus dentes, algo metálico brilha.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("O que é isso...? Parece... parte do casco de um navio?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("NARRADOR:");
        System.out.println("Você pega o fragmento. Ele é liso, serrado... claramente cortado por mãos humanas.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Mostre isso pra mim. Já vi essas marcas antes.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Talvez tenha sido sabotagem... por que um lobo teria isso?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Navios estão sumindo. Dizem que alguém está derrubando barcos de propósito...");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("NARRADOR:");
        System.out.println("Com o fragmento em mãos, você retorna para Porthar. A vila observa, curiosa e apreensiva.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();
    }
}
