package domain;

public class Pedra extends Algoritmo {
        //TODO: Criar as demais classes para cobrir os 5 algoritmos
        @Override
        public void execute(TipoJogada tipo) {
            switch (tipo) {
                case SPOCK -> System.out.println("Perdeu! Spock vaporiza a Pedra.");
                case PAPEL -> System.out.println("Perdeu! Papel embrulha a Pedra.");
                case TESOURA -> System.out.println("Venceu! Pedra estoura a tesoura.");
                case LAGARTO -> System.out.println("Venceu! Pedra esmaga o Lagarto.");
                default -> System.out.println("Empatou");
            }
        }
    }


