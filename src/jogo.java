import java.util.Scanner;

public class jogo {
    public int escolha1;
    player p = new player();
    combate c = new combate();
    Inimigo i = new Inimigo();

    public void chegadaAIlhaVerde(Scanner sc) {

        System.out.println("Garon:");
        System.out.println("Chegamos. Esta é a vila de Porthar. Antes de qualquer coisa, você precisa de cuidados.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Elda:");
        System.out.println("Então este é o náufrago? Você teve sorte de estar vivo. Consegue falar?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Acho que sim... minha cabeça ainda dói. Onde exatamente estou?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Elda:");
        System.out.println("Em Ilhaverde, uma das ilhas de Norfjell. Você foi encontrado na praia, quase sem vida.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("E agora vem a pergunta importante...");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("O que pretende fazer daqui pra frente?");
        System.out.println("1 - Tentar entender o que aconteceu com meu navio.");
        System.out.println("2 - Ir embora sozinho e sobreviver por conta própria.");
        System.out.print("Escolha: ");
        escolha1 = sc.nextInt();
        sc.nextLine();
        System.out.println();
        if (escolha1 == 1) {
            ramificacao ram = new ramificacao();
            ram.ProcurarNavio(sc);
        } else if (escolha1 == 2) {
            ramificacao ram = new ramificacao();
            ram.irSo(sc);
        }


    }

    public void NovamentePraia(Scanner sc) {
        System.out.println("Garon:");
        System.out.println("Certo. Vamos voltar à praia onde te encontrei. Talvez algo do naufrágio tenha ficado por lá.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Se isso me ajudar a entender o que aconteceu… vale a pena.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Narrador:");
        System.out.println("Vocês caminham pela trilha costeira. O vento gelado bate no rosto e a maré avança com força.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Ali. Foi bem ali que te achei. Vamos procurar ao redor.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Narrador:");
        System.out.println("Você vasculha entre pedaços de madeira, cordas encharcadas e redes rasgadas.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Espera… isso aqui…");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Narrador:");
        System.out.println("Um pequeno fragmento de metal retorcido, preso nas fibras de uma rede. Não parece ter vindo do mar.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Deixe-me ver… hm. Isso não veio de pedra, nem de coral. Parece… serrado.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Serrado? Então… meu barco não afundou sozinho.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Navios têm desaparecido. Mas ninguém quer falar disso abertamente…");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Narrador:");
        System.out.println("Antes que Garon continue, um rosnado forte ecoa entre as árvores.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Droga… ele de novo. O Lobo da Estrada.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Você está em condições de lutar?");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Não sei… mas não posso ficar parado.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Narrador:");
        System.out.println("O lobo surge correndo entre as árvores, enorme, com olhos amarelos e espuma entre as presas.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Prepare-se! Ele vem direto para nós!");
        System.out.print("...");
        sc.nextLine();
        System.out.println();


        System.out.println("Narrador:");
        System.out.println("O lobo salta contra você com violência, e ao tentar se esquivar, sua cabeça atinge uma pedra escondida na vegetação.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Argh… minha cabeça…");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Narrador:");
        System.out.println("Por um instante, tudo fica branco. Sons se apagam. Um lampejo de memória aparece, como se viesse de muito longe.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Memória:");
        System.out.println("… ‘Levante-se, " + p.getNome() + " … o mar não espera.’");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Meu nome… Eu me lembro agora. " + p.getNome() + ". Esse é o meu nome.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Você está sangrando! Fique atento! O lobo ainda está vindo!");
        System.out.print("...");
        sc.nextLine();
        System.out.println();
        combateLobo(p, sc);
    }

    public void combateLobo(player p, Scanner sc) {

        System.out.println("Narrador:");
        System.out.println("O lobo salta contra você, a boca cheia de dentes amarelos e respiração quente como fumaça.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Fique atrás de mim se não souber lutar! Esse bicho já matou três pescadores!");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Jogador:");
        System.out.println("Não… eu consigo lutar!");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Narrador:");
        System.out.println("Você firma os pés na terra molhada. O lobo circunda, rosnando, esperando o momento certo.");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("Garon:");
        System.out.println("Quando ele avançar, escolha seu ataque. Não hesite!");
        System.out.print("...");
        sc.nextLine();
        System.out.println();

        System.out.println("=== Escolha seu ataque ===");
        System.out.println("[1] Ataque rápido");
        System.out.println("[2] Ataque pesado");
        System.out.println("[3] Defender");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();
        System.out.println();

        switch (escolha) {
            case 1:
                System.out.println("Jogador:");
                System.out.println("Ataque rápido!");
                System.out.print("...");
                sc.nextLine();
                sc.nextLine();
                System.out.println();
                System.out.println("Narrador:");
                System.out.println("Você avança velozmente e corta o flanco do lobo!");
                c.lutar(p, i);
                break;

            case 2:
                System.out.println("Jogador:");
                System.out.println("Ataque pesado!");
                System.out.print("...");
                sc.nextLine();
                sc.nextLine();
                System.out.println();
                System.out.println("Narrador:");
                System.out.println("Você ergue a arma com força e desce um golpe poderoso!");
                c.lutar(p, i);
                break;

            case 3:
                System.out.println("Jogador:");
                System.out.println("Defender!");
                System.out.print("...");
                sc.nextLine();
                sc.nextLine();
                System.out.println();
                System.out.println("Narrador:");
                System.out.println("Você levanta os braços, tentando absorver o impacto da investida!");
                c.lutar(p, i);
                break;

            case 4:
                System.out.println("Jogador:");
                System.out.println("Esquivar!");
                System.out.print("...");
                sc.nextLine();
                sc.nextLine();
                System.out.println();
                System.out.println("Narrador:");
                System.out.println("Você salta para o lado, tentando escapar das presas mortais!");
                c.lutar(p, i);
                break;

            default:
                System.out.println("Narrador:");
                System.out.println("Você hesita… e o lobo avança com violência!");
                c.lutar(p, i);
                break;
        }


    }



}
