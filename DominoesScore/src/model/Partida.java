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
public class Partida {
    
    private int id = 0;
    private Time timeA;
    private Time timeB;
    private int pontosTimeA;
    private int pontosTimeB;
    private int batidaNormal;
    private int batidaCarroca;
    private int batidaLaeLo;
    private int batidaCruzada;
    
    public Partida(){
    }
    
    public Partida (Time timeA, Time timeB){
        this.id = ++id;
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getTimeA() {
        return timeA;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public int getPontosTimeA() {
        return pontosTimeA;
    }

    public void setPontosTimeA(int pontosTimeA) {
        this.pontosTimeA = pontosTimeA;
    }

    public int getPontosTimeB() {
        return pontosTimeB;
    }

    public void setPontosTimeB(int pontosTimeB) {
        this.pontosTimeB = pontosTimeB;
    }

    public int getBatidaNormal() {
        return batidaNormal;
    }

    public void setBatidaNormal(int batidaNormal) {
        this.batidaNormal = batidaNormal;
    }

    public int getBatidaCarroca() {
        return batidaCarroca;
    }

    public void setBatidaCarroca(int batidaCarroca) {
        this.batidaCarroca = batidaCarroca;
    }

    public int getBatidaLaeLo() {
        return batidaLaeLo;
    }

    public void setBatidaLaeLo(int batidaLaeLo) {
        this.batidaLaeLo = batidaLaeLo;
    }

    public int getBatidaCruzada() {
        return batidaCruzada;
    }

    public void setBatidaCruzada(int batidaCruzada) {
        this.batidaCruzada = batidaCruzada;
    }
    
    
    
}
