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
public class Harjoitukset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Mikä tehtävä ajetaan: ");
        x = scan.nextInt();

        switch (x) {
            case 21:
                Harjoitus21.run();
                break;
            case 22:
                Harjoitus22.run();
                break;
            case 24:
                Harjoitus24.run();
                break;
            case 25:
                Harjoitus25.run();
                break;
            default:
                System.out.println("Tehtävää ei löydy");
        }
    }

}
