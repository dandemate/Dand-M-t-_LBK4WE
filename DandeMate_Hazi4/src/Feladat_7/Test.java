/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dande
 */
public class Test {
    public static void main(String[] args) {
        List<Lakóház> lista = new ArrayList<Lakóház>();
        lista.add(new Lakóház("Cim1",1,3.8));
        lista.add(new Lakóház("Cim2",2,3.9));
        lista.add(new Lakóház("Cim3",3,4.0));
        lista.add(new Lakóház("Cim4",4,4.1));
        lista.add(new Lakóház("Cim5",5,4.2));
        lista.add(new Lakóház("Cim6",6,4.4));
        lista.add(new Lakóház("Cim7",7,4.3));
        lista.add(new Lakóház("Cim8",8,5.4));
        lista.add(new Lakóház("Cim9",9,2.9));
        lista.add(new Lakóház("Cim10",10,1.9));
        Collections.sort(lista);
        tágasLakóházak(lista,380);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
            
        }
        
        
    }
    public static List<Lakóház> tágasLakóházak(List<Lakóház> lista,double térfogat)
    {
        List<Lakóház> vissza = new ArrayList<Lakóház>();
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).légköbméter()>=térfogat)
            {
                vissza.add(new Lakóház(lista.get(i).getCím(),lista.get(i).getEmeletekSzáma(),lista.get(i).getAlapterület()));
            }
            
        }
        
        return vissza;
    }
}
