/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kéktúra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author dande
 */
class Tura{
    private String név;
    private String kezdet;
    private String veg;
    private int km;

    public Tura(String név, String kezdet, String veg, int km) {
        this.név = név;
        this.kezdet = kezdet;
        this.veg = veg;
        this.km = km;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getKezdet() {
        return kezdet;
    }

    public void setKezdet(String kezdet) {
        this.kezdet = kezdet;
    }

    public String getVeg() {
        return veg;
    }

    public void setVeg(String veg) {
        this.veg = veg;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Tura o = (Tura)obj;
        if(o == null || !(o instanceof Tura))
            return false;
        
        return this.név.equals(o.név);
    }
    
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("kektura.txt"));
        List<Tura> turazok = new ArrayList<>();
        String line;
        Tura tura;
        String[] t1;
        String[] t2;
        
        while((line = br.readLine())!=null){
            t1 = line.split(":");
            t2 = t1[1].split("-");
            tura = new Tura(t1[0], t2[0], t2[1], Integer.parseInt(t1[2]));
            turazok.add(tura);
            
        }
        boolean egybefüggő = false; 
        
        for (Tura i : turazok) {
            String kezdet = i.getKezdet();
            String veg = i.getVeg();
            for (Tura j : turazok) {
                if(j.getNév().equals(i.getNév()))
                    
            }
            
                    
        }
        
    }
}
