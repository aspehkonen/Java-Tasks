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
public class Harjoitus24 {
    
    public static void run() {
        Person24 p = new Person24("Pekka", "Kuninkaankatu 21");
        Student24 st = new Student24("IT-insinööri", 2, 40.5, "Jorma", "Vuorikatu 1");
        Staff24 s = new Staff24("Savonia", 2000.5, "Helena", "Koskikuja 2");
        
        System.out.println(p.toString());
        System.out.println(st.toString());
        System.out.println(s.toString());
    }
}
