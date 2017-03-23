/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unidavi.gamepong;

/**
 *
 * @author Edgar
 */
public class GeradorPonto {

    private String barra01;
    private String barra02;
    int barraInteira01;
    int barraInteira02;

    private String bola01x, bola01y;
    private String bola02x, bola02y;
    int bolaInteira01x, bolaInteira01y;
    int bolaInteira02x, bolaInteira02y;

    public String getBola01x() {
        return bola01x;
    }

    public void setBola01x(String bola01x) {
        this.bola01x = bola01x;
        bolaInteira01x = Integer.parseInt(bola01x);
    }

    public String getBola01y() {
        return bola01y;
    }

    public void setBola01y(String bola01y) {
        this.bola01y = bola01y;
        bolaInteira01y = Integer.parseInt(bola01y);
    }

    public String getBola02x() {
        return bola02x;
    }

    public void setBola02x(String bola02x) {
        this.bola02x = bola02x;
        bolaInteira02x = Integer.parseInt(bola02x);
    }

    public String getBola02y() {
        return bola02y;
    }

    public void setBola02y(String bola02y) {
        this.bola02y = bola02y;
        bolaInteira02y = Integer.parseInt(bola02y);
    }

    public String getBarra01() {
        return barra01;
    }

    public void setBarra01(String barra01) {

        this.barra01 = barra01;
        barraInteira01 = Integer.parseInt(barra01);
    }

    public String getBarra02() {
        return barra02;
    }

    public void setBarra02(String barra02) {
        this.barra02 = barra02;
        barraInteira02 = Integer.parseInt(barra02);
    }

}
