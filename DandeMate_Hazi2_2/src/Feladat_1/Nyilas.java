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
public class Nyilas extends Katona {
    private int lőtáv;

    public Nyilas(int támadó_erő, int védő_erő, int lőtáv) {
        super(támadó_erő, védő_erő);
        this.lőtáv = lőtáv;
    }

    @Override
    public int getTámadó_erő() {
        return super.getTámadó_erő()+getLőtáv();
    }


    public int getLőtáv() {
        return lőtáv;
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas:" +
                "TE: " + getTámadó_erő() +
                ", VE: " + getVédő_erő();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Nyilas))
        {
            return false;
        }
        Nyilas ny = (Nyilas)obj;
        return super.equals(ny) && this.lőtáv == ny.getLőtáv();
    }
}
