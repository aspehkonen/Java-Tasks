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
public class Henkilo {
    private String etunimi;
    private String sukunimi;
    
    public Henkilo(String etunimi,String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }
    
    public void print(int palkka) {
        System.out.println("Etunimi: " + etunimi);
        System.out.println("Sukunimi: " + sukunimi);
        System.out.println("Palkka: " + palkka);
    }
}
