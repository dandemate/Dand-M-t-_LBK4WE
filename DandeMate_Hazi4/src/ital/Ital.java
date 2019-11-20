/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Objects;

/**
 *
 * @author dande
 */
public class Ital implements Comparable<Ital>{
    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return this.név+", "+this.kiszerelés+", "+this.ár+" Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==null || !(obj instanceof Ital))
            return false;
        Ital i = (Ital) obj;
        return i.név.equals(this.név) && i.kiszerelés.equals(this.kiszerelés);
    }

    @Override
    public int compareTo(Ital o) {
        if(o.ár<this.getÁr())
            return -100;
        else if(o.ár>this.getÁr())
            return 100;
        else
            return 0;
    }
    
    
    
    
    
    
    
}
