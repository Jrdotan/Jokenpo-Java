
package domain;

public class Lagarto extends Algoritmo {
    //TODO: Criar as demais classes para cobrir os 5 algoritmos
    @Override
    public void execute(TipoJogada tipo) {
        switch (tipo) {
            case SPOCK -> System.out.println("Venceu! Lagarto envenena o Spock.");
            case PEDRA -> System.out.println("Perdeu! Pedra esmaga o lagarto.");
            case TESOURA -> System.out.println("Perdeu! Tesoura mata o lagarto.");
            case PAPEL -> System.out.println("Venceu! Lagarto come o Papel.");
            default -> System.out.println("Empatou");
        }
    }
}
