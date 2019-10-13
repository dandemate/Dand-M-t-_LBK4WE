/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_1;

/**
 *
 * @author dande
 */
public class Katona {
    private int támadó_erő;
    private int védő_erő;


    public Katona() {
        this.támadó_erő=5;
        this.védő_erő=5;
    }

    public Katona(int támadó_erő, int védő_erő) {
        this.támadó_erő = támadó_erő;
        this.védő_erő = védő_erő;
    }

    public int getTámadó_erő() {
        return támadó_erő;
    }

    public void setTámadó_erő(int támadó_erő) {
        this.támadó_erő = támadó_erő;
    }

    public int getVédő_erő() {
        return védő_erő;
    }

    public void setVédő_erő(int védő_erő) {
        this.védő_erő = védő_erő;
    }

    @Override
    public String toString() {
        return "TE: " + támadó_erő +
                ", VE: " + védő_erő;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Katona))
            return false;
        Katona o = (Katona)obj;
        return this.támadó_erő == o.getTámadó_erő() && this.védő_erő == o.getVédő_erő();

    }
}
