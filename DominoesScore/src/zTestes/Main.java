/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zTestes;

import model.Jogador;
import model.Partida;
import model.Time;
import java.util.Scanner;

/**
 *
 * @author rfrodrigues
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jogador p1 = new Jogador(1, "Rodrigo", "M", 34);
        Jogador p2 = new Jogador(2, "Antonio", "M", 68);
        Jogador p3 = new Jogador(3, "Graca", "F", 64);
        Jogador p4 = new Jogador(4, "Grasiela", "M", 38);

        Time t1 = new Time(p1, p2);
        Time t2 = new Time(p3, p4);

        Partida b1 = new Partida(t1, t2);

        int placarT1 = 0;
        int placarT2 = 0;

        String vencedor;
        int pontosA = 0;
        int pontosB = 0;

        System.out.println("PLACAR DOMINO");
        System.out.println("Partida numero: " + b1.getId());

        String jogaNovamente = "s";

        while (jogaNovamente.equals("s")) {
            while (b1.getPontosTimeA() < 6 && b1.getPontosTimeB() < 6) {
                System.out.print("\nQuem bateu? (A)-Time A, (B) Time B: ");
                vencedor = sc.next();
                if (vencedor.equals("a")) {
                    b1.setPontosTimeA(++pontosA);
                }
                if (vencedor.equals("b")) {
                    b1.setPontosTimeB(++pontosB);
                }

            }
            System.out.println("\nPARTIDA ENCERRADA");
            if (b1.getPontosTimeA() > b1.getPontosTimeB()) {
                System.out.println("TIME A Ganhou");
                System.out.println("Placar A: "+b1.getPontosTimeA()+" Placar B: "+b1.getPontosTimeB());
                System.out.println(b1.getTimeA().getJogadorA().getNome());
                System.out.println(b1.getTimeA().getJogadorB().getNome());
            } else {
                System.out.println("TIME B Ganhou");
                System.out.println("Placar B: "+b1.getPontosTimeB()+" Placar A: "+b1.getPontosTimeA());
                System.out.println(b1.getTimeB().getJogadorA().getNome());
                System.out.println(b1.getTimeB().getJogadorB().getNome());
            }
            
                    
            System.out.print("\nJogar novamente? ");
            jogaNovamente = sc.next();
            if (jogaNovamente.equals("s")){
                pontosA=0;
                pontosB=0;
                b1.setPontosTimeA(0);
                b1.setPontosTimeB(0);
            }
            
        }

    }

}
