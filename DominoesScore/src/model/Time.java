/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rfrodrigues
 */
public class Time {
    
    private Jogador jogadorA;
    private Jogador jogadorB;
    
    public Time() {
    }
    
    public Time(Jogador jogadorA, Jogador jogadorB) {
        this.jogadorA = jogadorA;
        this.jogadorB = jogadorB;
    }

    public Jogador getJogadorA() {
        return jogadorA;
    }

    public void setJogadorA(Jogador jogadorA) {
        this.jogadorA = jogadorA;
    }

    public Jogador getJogadorB() {
        return jogadorB;
    }

    public void setJogadorB(Jogador jogadorB) {
        this.jogadorB = jogadorB;
    }
    
    
    
}
