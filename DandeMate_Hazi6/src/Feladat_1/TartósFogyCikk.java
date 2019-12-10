/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_1;

import java.util.Objects;

/**
 *
 * @author dande
 */
public class TartósFogyCikk {
    private String név;
    private int mennyiség;
    private String mennyiségiEgység;
    private double egységÁr;

    public TartósFogyCikk() {
    }

    public TartósFogyCikk(String név, int mennyiség, String mennyiségiEgység, double egységÁr) {
        this.név = név;
        if(mennyiség == 0)
            this.mennyiség = 1;
        else
            this.mennyiség = mennyiség;
        this.mennyiségiEgység = mennyiségiEgység;
        this.egységÁr = egységÁr;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    
    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getMennyiségiEgység() {
        return mennyiségiEgység;
    }

    public void setMennyiségiEgység(String mennyiségiEgység) {
        this.mennyiségiEgység = mennyiségiEgység;
    }

    public double getEgységÁr() {
        return egységÁr;
    }

    public void setEgységÁr(double egységÁr) {
        this.egységÁr = egységÁr;
    }

    @Override
    public String toString() {
        return "Név: " + név + 
                " | Mennyiség: "+mennyiség+
                " | Mennyiségi egység: " + mennyiségiEgység + 
                " | Egységár: " + egységÁr + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof TartósFogyCikk))
            return false;
        
        return this.név.equals(((TartósFogyCikk)obj).név);
    }
    
    
    
    
    
}
