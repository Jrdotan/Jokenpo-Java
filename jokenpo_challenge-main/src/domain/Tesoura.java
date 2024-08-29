package domain;

public class Tesoura extends Algoritmo {
    //TODO: Criar as demais classes para cobrir os 5 algoritmos
    @Override
    public void execute(TipoJogada tipo) {
        switch (tipo) {
            case SPOCK -> System.out.println("Perdeu! Spock quebra a tesoura.");
            case PEDRA -> System.out.println("Perdeu! Pedra quebra a tesoura.");
            case PAPEL -> System.out.println("Venceu! Tesoura corta o Papel.");
            case LAGARTO -> System.out.println("Venceu! A tesoura mata o lagarto.");
            default -> System.out.println("Empatou");
        }
    }
}
