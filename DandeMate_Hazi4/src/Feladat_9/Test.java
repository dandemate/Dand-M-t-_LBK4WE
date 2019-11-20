/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dande
 */
public class Test {
    public static void main(String[] args) {
        List<Hátizsák> lista=new ArrayList<Hátizsák>();
        lista.add(new Hátizsák("Adidas",3.0,2,true));
        lista.add(new Hátizsák("Adidas2",2.7,4,true));
        lista.add(new Hátizsák("Adidas3",2.8,1,true));
        lista.add(new Hátizsák("Adidas4",2.9,5,true));
        lista.add(new Hátizsák("Adidas5",2.5,7,true));
        lista.add(new Hátizsák("Adidas6",3.1,22,true));
        lista.add(new Hátizsák("Adidas7",3.5,11,true));
        lista.add(new Hátizsák("Adidas9",3.4,99,true));
        lista.add(new Hátizsák("Adidas8",3.3,99,true));
        lista.add(new Hátizsák("Adidas10",3.2,12,true));
        kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(lista);
        
    }
    public static void kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<Hátizsák> lista)
    {
        
        
        
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
            
        }
    }
}
