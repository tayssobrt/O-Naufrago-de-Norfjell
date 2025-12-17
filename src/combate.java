public class combate {
    int dano = 10;
    double danoInimigo = 7;
    public void lutar(player p, Inimigo i) {

        switch(p.getArma()) {
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
                case "Nada":
                    dano = 5;
                    break;
                default:
                    dano = 10;
                    dano = Math.random() * dano;
                    break;
            }

                System.out.println("Você ataca com sua " + p.getArma() + " e causa " + dano + " de dano.");
                i.setVida(i.getVida() - dano);

                danoInimigo = Math.random() * danoInimigo;

                System.out.println("Você perdeu " + dano + " de vida.");
                p.setVida(p.getVida() - danoInimigo);


        }
    }

