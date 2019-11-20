/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_9;

/**
 *
 * @author dande
 */
public class Hátizsák implements Comparable<Hátizsák>{
    private String márka;
    private double űrtartalom;
    private int zsebekszáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekszáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekszáma = zsebekszáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekszáma() {
        return zsebekszáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public String toString() {
        return "H\u00e1tizs\u00e1k{" + "m\u00e1rka=" + márka + ", \u0171rtartalom=" + űrtartalom + ", zsebeksz\u00e1ma=" + zsebekszáma + ", v\u00edzhatlan=" + vízhatlan + '}';
    }
    
    
    
    public int compareTo(Hátizsák t) {
        if(!t.getMárka().equals(this.getMárka()))
        {
            if(t.getZsebekszáma()!=this.zsebekszáma)
            return t.getZsebekszáma()-this.zsebekszáma;
            
        }
        return this.márka.compareTo(t.getMárka());
    }
}
