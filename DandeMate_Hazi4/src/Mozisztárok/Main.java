/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Comparator;

/**
 *
 * @author dande
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Map<Integer, String>> filmek = new TreeMap<>();
        Map<Integer, String> ertek = new TreeMap<Integer, String>();
        String[] token1;
        String[] token2;
        String[] token3;
        int db = 0;
        while(sc.hasNextLine()){
            token1 = sc.nextLine().split(":");
            
            token2 = token1[0].split("[\\(\\)]");
            //System.out.println(token2.length);
            token3 = token1[1].split(",");
            //System.out.println(token3.length);
            for(int i=0; i<token3.length; i++){
                if(!filmek.containsKey(token3[i])){
                    ertek = new TreeMap<Integer, String>();
                    ertek.put(Integer.parseInt(token2[1]), token2[0]);
                    filmek.put(token3[i], ertek);
                    
                }else{
                    
                    filmek.get(token3[i]).put(Integer.parseInt(token2[1]), token2[0]);
                }
            }
        }
       
        

        for (Map.Entry<String, Map<Integer, String>> e : filmek.entrySet()) {
            System.out.println(e.getKey());
            for(Map.Entry<Integer, String> f : e.getValue().entrySet()){
                System.out.println(f.getKey()+": "+f.getValue());
            }
        }
    }
}
