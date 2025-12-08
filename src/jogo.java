import java.util.Scanner;

public class jogo {

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
        int escolha1 = sc.nextInt();
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


}
