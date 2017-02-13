/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitukset;

/**
 *
 * @author Admin
 */
public class Tyontekija22 extends Henkilo {
    private int palkka;

    public Tyontekija22(String etunimi,String sukunimi,int palkka) {
        super(etunimi, sukunimi);
        this.palkka = palkka;
    }
    
    public int getPalkka() {
        return palkka;
    }

    public void setPalkka(int palkka) {
        this.palkka = palkka;
    }
    
    public void print() {
        super.print(palkka);
    }
}
