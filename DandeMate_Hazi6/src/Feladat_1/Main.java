/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dande
 */

public class Main {
    static List<Élelmiszer> eList = new ArrayList<>();
    static List<TartósFogyCikk> tList = new ArrayList<>();
    
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] token;
            Élelmiszer e;
            TartósFogyCikk t;
            while((line = br.readLine())!= null){
                token = line.split(";");
                if(token[0].equals("E")){
                    e = new Élelmiszer(token[1], Integer.parseInt(token[5]), token[3], 
                        Double.parseDouble(token[2]), Integer.parseInt(token[4]));
                    //equals metódust át kell írni, hogy működjön
                    if(eList.contains(e)){
                        int index = eList.indexOf(e);
                        int db = eList.get(index).getMennyiség();
                        eList.get(index).setMennyiség(db+Integer.parseInt(token[5]));
                        
                    }
                    else{
                        eList.add(e);
                    }    
                }
                if(token[0].equals("T")){
                    t = new TartósFogyCikk(token[1], Integer.parseInt(token[4]), token[3], 
                            Double.parseDouble(token[2]));
                    //equals metódust át kell írni, hogy működjön
                    if(tList.contains(t)){
                        int index = tList.indexOf(t);
                        int db = tList.get(index).getMennyiség();
                        tList.get(index).setMennyiség(db+Integer.parseInt(token[4]));
                    }
                    else{
                        tList.add(t);
                    }    
                }
            }
            
            for (Élelmiszer i: eList) {
                System.out.println(i.toString());
            }
            
            for (TartósFogyCikk i: tList) {
                System.out.println(i.toString());
            }
            
            //Bővítés
            //Beviteli forma élelmiszer: E;név;egységár;mértékegység;szavatosság;darab
            //példa:E;kutyahús;1000.0;kg;10;5
            //példa:E;kígyóuborka;129.0;darab;7;15
            //Beviteli forma tartós: T;név;egységár;mértékegység;darab
            //példa:T;súlyzókészlet;5990.0;szett;5
            //példa:T;hűtő;99999.0;db;1
            try{
                System.out.print("Termék bevitel: ");
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                line = input.readLine();
                token = line.split(";");

                if(token[0].equals("E")){
                    e = new Élelmiszer(token[1], Integer.parseInt(token[5]), token[3], 
                        Double.parseDouble(token[2]), Integer.parseInt(token[4]));
                    if(eList.contains(e)){
                        int index = eList.indexOf(e);
                        int db = eList.get(index).getMennyiség();
                        eList.get(index).setMennyiség(db+Integer.parseInt(token[5])); 
                    }
                    else{
                        eList.add(e);
                    }   
                }
                if(token[0].equals("T")){
                     t = new TartósFogyCikk(token[1], Integer.parseInt(token[4]), token[3], 
                            Double.parseDouble(token[2]));
                    if(tList.contains(t)){
                        int index = tList.indexOf(t);
                        int db = tList.get(index).getMennyiség();
                        tList.get(index).setMennyiség(db+Integer.parseInt(token[4]));
                    }
                    else{
                        tList.add(t);
                    }    
                }
                
            for (Élelmiszer i: eList) {
                System.out.println(i.toString());
            }
            
            for (TartósFogyCikk i: tList) {
                System.out.println(i.toString());
            }
                
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
            //Termék eladás
            try{
                System.out.print("Termék vásárlás: ");
                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
                line = input2.readLine();
                token = line.split(";");
                if(token.length==1){
                    boolean van = false;
                    for (Élelmiszer i: eList) {
                        if(i.getNév().equals(token[0])){
                            van = true;
                            int index=0;
                            int legkisebbSzavatosság = i.getSzavatosság();
                            if(i.getSzavatosság()<=legkisebbSzavatosság){
                                e = new Élelmiszer(token[0], i.getMennyiség(), i.getMennyiségiEgység(), 
                                    i.getEgységÁr(), i.getSzavatosság());
                                index = eList.indexOf(e);
                            }
                            int db = eList.get(index).getMennyiség();
                            eList.get(index).setMennyiség(db-1);
                            break;
                        }
                    }
                    if(!van){
                        for (TartósFogyCikk i: tList) {
                            if(i.getNév().equals(token[0])){
                                t = new TartósFogyCikk(token[0], i.getMennyiség(), i.getMennyiségiEgység(), 
                                i.getEgységÁr());
                                int index = tList.indexOf(t);
                                int db = tList.get(index).getMennyiség();
                                tList.get(index).setMennyiség(db-1);
                                break;
                            }
                        }
                    }
                    if(van){
                        
                    }
                    else{
                        throw new Exception("Nincs ilyen termék név!");
                    }
                    
                    
                    
                }else{
                    if(token[0].equals("E")){
                        e = new Élelmiszer(token[1], Integer.parseInt(token[5]), token[3], 
                            Double.parseDouble(token[2]), Integer.parseInt(token[4]));
                        if(!(eList.equals(e))){
                            throw new Exception("Nincs ilyen termék!");
                        }else{
                            int index = eList.indexOf(e);
                            int db = eList.get(index).getMennyiség();
                            if(db<Integer.parseInt(token[5])){
                                eList.get(index).setMennyiség(0);
                                int hiányzik = Integer.parseInt(token[5])-db;
                                throw new Exception("Sajnos csak "+db+token[3]+ " állt rendelkezésre. Hiányzik még "+hiányzik+token[3]+"!");
                            }else{
                                eList.get(index).setMennyiség(db-Integer.parseInt(token[5]));
                            }

                        }
                    }
                    if(token[0].equals("T")){
                        t = new TartósFogyCikk(token[1], Integer.parseInt(token[4]), token[3], 
                                Double.parseDouble(token[2]));
                        if(!(tList.equals(t))){
                            throw new Exception("Nincs ilyen termék!");
                        }else{
                            int index = tList.indexOf(t);
                            int db = tList.get(index).getMennyiség();
                            if(db<Integer.parseInt(token[5])){
                                tList.get(index).setMennyiség(0);
                                int hiányzik = Integer.parseInt(token[5])-db;
                                throw new Exception("Sajnos csak "+db+token[3]+ " állt rendelkezésre. Hiányzik még "+hiányzik+token[3]+"!");
                            }else{
                                tList.get(index).setMennyiség(db-Integer.parseInt(token[5]));
                            }

                        }
                    }
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
            for (Élelmiszer i: eList) {
                if(i.getMennyiség()==0){
                    eList.remove(i);
                }
                else{   
                    System.out.println(i.toString());
                }
            }
            
            for (TartósFogyCikk i: tList) {
                if(i.getMennyiség()==0){
                    tList.remove(i);
                }
                else{
                   System.out.println(i.toString());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
