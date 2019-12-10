/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mérlegelés;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dande
 */

class Telephely implements Comparable<Telephely>{
    private String név;
    private String hely;
    private int év;
    private int osszeg;

    public Telephely(String név, String hely, int év, int osszeg) {
        this.név = név;
        this.hely = hely;
        this.év = év;
        this.osszeg = osszeg;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getHely() {
        return hely;
    }

    public void setHely(String hely) {
        this.hely = hely;
    }

    public int getÉv() {
        return év;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Telephely o = (Telephely)obj;
        if(o==null || !(o instanceof Telephely))
            return false;
        
        return this.név.equals(o.név) && this.hely.equals(o.hely);
    }

    @Override
    public String toString() {
        return this.név+" ("+this.hely+"): "+this.osszeg;
    }

    @Override
    public int compareTo(Telephely o) {
        int result = o.osszeg - this.osszeg; //csökkenő
        if(result != 0) return result; 
        result = this.év - o.év; //növekvő
        if(result != 0) return result;
        return this.név.compareTo(o.név); //növekvő
        
    }
    
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        String[] token;
        List<Telephely> lista = new ArrayList<>();
        Telephely t;
        
        while((line=br.readLine())!=null){
            
            token = line.split(":");
            
            t = new Telephely(token[0], token[1], 1, Integer.parseInt(token[3]));
            if(lista.contains(t)){
                int i = lista.indexOf(t);
                int db = lista.get(i).getOsszeg();
                int dbEv = lista.get(i).getÉv();
                lista.get(i).setOsszeg(db+Integer.parseInt(token[3]));
                lista.get(i).setÉv(dbEv+1);
            }
            else{
                lista.add(t);
            }
        }
        
        Collections.sort(lista);
        
        for (Telephely i : lista) {
            System.out.println(i.toString());
        }
        
    }
    
}
