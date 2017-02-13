/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitukset;

import java.util.ArrayList;

/**
 *
 * @author s698929
 */
public class Henkilot23 extends ArrayList<Tyontekija22> {
    public double keskipalkka() {
        int p = 0;
        /*for(Tyontekija22 t : this) {
            p += t.getPalkka();
        }*/
        
        p = this.stream().map((t) -> t.getPalkka()).reduce(p, Integer::sum);
        
        return (double) p / this.size();
    }
}
