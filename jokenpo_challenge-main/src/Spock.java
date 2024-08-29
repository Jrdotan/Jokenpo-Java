
package domain;

public class Spock extends Algoritmo {
    //TODO: Criar as demais classes para cobrir os 5 algoritmos
    @Override
    public void execute(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL -> System.out.println("Perdeu! Papel refuta o Spock.");
            case PEDRA -> System.out.println("Venceu! Spock vaporiza a Pedra.");
            case TESOURA -> System.out.println("Venceu! Spock quebra a tesoura.");
            case LAGARTO -> System.out.println("Perdeu! Lagarto Envenena o Spock.");
            default -> System.out.println("Empatou");
        }
    }
}
