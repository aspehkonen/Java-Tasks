/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitukset;

/**
 *
 * @author s698929
 */
public class Harjoitus21 {

    public static void run() {
        Circle c = new Circle();
        Square s = new Square();
        
        c.setRadius(10);
        s.setWidth(15);
        
        System.out.println("Ympyrä : ");
        System.out.println("Säde : " + c.perimeter());
        System.out.println("Ala : " + c.area());
        System.out.println("-------------------");
        System.out.println("Neliö : ");
        System.out.println("Säde : " + s.perimeter());
        System.out.println("Ala : " + s.area());
    }
}
