import domain.Algoritmo;
import domain.Jokenpo;
import domain.Papel;
import domain.Pedra;
import domain.Tesoura;
import domain.Spock;
import domain.Lagarto;

import domain.TipoJogada;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("JoKenPo V0.PAPEL");
        System.out.println("Escolha uma opção.");
        System.out.println("\n1. PAPEL - 2. TESOURA. - 3. PEDRA. - 4. Lagarto - 5. Spock");

        Scanner in = new Scanner(System.in);

        int opcaoJogador = in.nextInt();

        int computador = new Random().nextInt(5) + 1;

        TipoJogada algoritmoComputador = TipoJogada.getTipo(computador);
        System.out.println("O COMPUTADOR escolheu: " + algoritmoComputador);

        var jokenpo = new Jokenpo();

        TipoJogada tipoJogada = TipoJogada.getTipo(opcaoJogador);

        Algoritmo algoritmo = getAlgoritmo(tipoJogada);

        jokenpo.setAlgoritmo(algoritmo);
        jokenpo.jogar(algoritmoComputador);

        in.close();
    }

    //TODO: Incluir demais algoritmos (Strategies) para concluir compilação
    private static Algoritmo getAlgoritmo(TipoJogada tipo) {
        return switch (tipo) {
            case PAPEL -> new Papel();
            case TESOURA -> new Tesoura();
            case PEDRA -> new Pedra();
            case LAGARTO -> new Lagarto();
            case SPOCK -> new Spock();

            //TODO: Incluir demais statements...
        };
    }
}