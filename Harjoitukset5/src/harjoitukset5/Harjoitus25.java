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
public class Harjoitus25 {
    
    public static void run() {
        Database d = new Database();
        Video v = new Video("Central Intelligence", "Jaska Jokunen", "Englanti", 120);
        Textbook t = new Textbook("Maamme säät", "Pekka Pouta", "Suomi", 250);
        CD c = new CD("Paras levy 2k16", "DjTeku", "Suomi", 30);
        v.setComment("Hyvä leffa");
        t.setComment("Kannattaa lukea");
        c.setComment("Hirveetä kuraa");
        
        d.addVideo(v);
        d.addTextbook(t);
        d.addCD(c);
        
        d.list();
    }
}
