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
public class Élelmiszer {
    private String név;
    private int mennyiség;
    private String mennyiségiEgység;
    private double egységÁr;
    private int szavatosság;

    public Élelmiszer() {
    }

    
    
    public Élelmiszer(String név, int mennyiség, String mennyiségiEgység, double egységÁr, int szavatosság) {
        this.név = név;
        if(mennyiség == 0)
            this.mennyiség = 1;
        else
            this.mennyiség = mennyiség;
        this.mennyiségiEgység = mennyiségiEgység;
        this.egységÁr = egységÁr;
        this.szavatosság = szavatosság;
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

    public int getSzavatosság() {
        return szavatosság;
    }

    public void setSzavatosság(int szavatosság) {
        this.szavatosság = szavatosság;
    }

    @Override
    public String toString() {
        return "Név: " + név + 
                " | Mennyiség: "+mennyiség+
                " | Mennyiségi egység: " + mennyiségiEgység + 
                " | Egységár: " + egységÁr + 
                " | Szavatosság: " + szavatosság + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null || !(obj instanceof Élelmiszer) )
            return false;
        
        Élelmiszer o = (Élelmiszer)obj;
        
        return this.név.equals(o.getNév()) && this.szavatosság==o.szavatosság;
    }
    
    
}
