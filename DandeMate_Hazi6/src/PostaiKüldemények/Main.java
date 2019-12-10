/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package PostaiKüldemények;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author dande
 */

class Csomag implements Comparable<Csomag>{
    private String címzett;
    private String város;
    private String utca;
    private int házszám;
    private int érték;

    public Csomag(String címzett, String város, String utca, int házszám, int érték) {
        this.címzett = címzett;
        this.város = város;
        this.utca = utca;
        this.házszám = házszám;
        this.érték = érték;
    }

    public String getCímzett() {
        return címzett;
    }

    public void setCímzett(String címzett) {
        this.címzett = címzett;
    }

    public String getVáros() {
        return város;
    }

    public void setVáros(String város) {
        this.város = város;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getHázszám() {
        return házszám;
    }

    public void setHázszám(int házszám) {
        this.házszám = házszám;
    }

    public int getÉrték() {
        return érték;
    }

    public void setÉrték(int érték) {
        this.érték = érték;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public int compareTo(Csomag o) {
        int res = this.város.compareTo(o.város); //Növekvő
        if(res>0) 
            return 1;
        else if(res<0)
            return -1;

        res = this.utca.compareTo(o.utca); //növekvő
        if(res>0) 
            return 1;
        else if(res<0) 
            return -1;
        
        res = this.házszám - o.házszám; //növekvő
        if(res>0) 
            return 1;
        else if(res<0) 
            return -1;
        
        res = this.címzett.compareTo(o.címzett); //növekvő
        if(res>0) return 1;
        else if(res<0) return -1;
        else
            return o.érték - this.érték; //csokkenő
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //ProgCont-hoz ki kell törölni felülről a package PostaiKüldemények; sort
        //továbbá a fájl helyére args[0] -t kell írni így: new FileReader(args[0])
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        String[] token;
        //Mivel kulcs érték szerint sorba(növekvő) kell rendezni így TreeMap-et használok,
        //ami automatikusan sorba rendezi a kulcsokat
        Map<Integer, List<Csomag>> csomagMap = new TreeMap<>();
        Csomag cs;
        
        //Az irányítószámot nem szükséges eltárolni a listában, mert
        //az lesz a MAP kulcs értéke
        while((line=br.readLine())!=null){
            //token[1] -> irányítószám
            token = line.split(":");
            //példányosítok egy Csomag típusú objektumot
            cs = new Csomag(token[0], token[2], token[3], Integer.parseInt(token[4]), Integer.parseInt(token[5]));
            //Ha már van ilyen kulcsú elem akkor az ahhoz a kulcshoz tartozó listához így adom hozzá
            //az előzőleg cs néven létrehozott példányt
            //mapváltozónév.get(kulcs).add 
            if(csomagMap.containsKey(Integer.parseInt(token[1]))){
                csomagMap.get(Integer.parseInt(token[1])).add(cs);
            }else{ 
                //Egyébként, ha nincs ilyen kulcsú elem akkor új listát hozok létre
                //majd a cs nevű példányt hozzáadom a listához, 
                //és a .put al adom hozzá a kulcsot és az egy elemű listát is
                List<Csomag> lista = new ArrayList<>();
                lista.add(cs);
                csomagMap.put(Integer.parseInt(token[1]), lista);
            }
   
        }
        //Rendezés
        //A kulcshoz tartozó listákat rendezi, a .getValue() listát ad vissza
        for (Map.Entry<Integer, List<Csomag>> i : csomagMap.entrySet()) {
            Collections.sort(i.getValue());
        }
       
        
        int osszeg; //Ebben tárolom az összértéket
        for (Map.Entry<Integer, List<Csomag>> i : csomagMap.entrySet()) {
            osszeg = 0; 
            for (Csomag j : i.getValue()) {
                osszeg += j.getÉrték();
            }
            System.out.println(i.getKey()+": "+osszeg+" Ft");
            for (Csomag j : i.getValue()) {
                System.out.println(j.getVáros()+", "+j.getUtca()+" "+j.getHázszám()+"., "+j.getCímzett()+", "+j.getÉrték()+" Ft");
            }
        }
       
    }
}
