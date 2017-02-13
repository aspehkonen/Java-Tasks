/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitukset;

import java.util.Scanner;

/**
 *
 * @author s698929
 */
public class Harjoitus23 {
    public static void run() {
        Scanner s = new Scanner(System.in);
        Henkilot23 h = new Henkilot23();
        for (int i = 0; i < 5; i++) {
            System.out.println("Etunimi");
            String e = s.nextLine();
            System.out.println("Sukunimi");
            String su = s.nextLine();
            System.out.println("Palkka");
            int p = s.nextInt();
            s.nextLine();
            Tyontekija22 t = new Tyontekija22(e, su, p);
            h.add(t);
        }
        
        System.out.println("Keskipalkka : " + h.keskipalkka());
    }
}
