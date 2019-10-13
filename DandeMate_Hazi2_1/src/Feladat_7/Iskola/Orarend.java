/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_7.Iskola;

import java.util.ArrayList;

public class Orarend extends Ora{
    private String nap;
    private Ora[] tomb;
    private int szamlalo;

    public Orarend(String nap) {
        
        this.nap = nap;
        this.szamlalo = 0;
        this.tomb = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getTomb() {
        return tomb;
    }

    public void setTomb(Ora[] tomb) {
        this.tomb = tomb;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo() {
        this.szamlalo++;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", tomb=" + tomb + ", szamlalo=" + szamlalo + '}';
    }
    
    public boolean oratHozzaad(Ora o){
        boolean volt = false;
        if(this.getSzamlalo()!=12){
            for(int i=0; i<this.getSzamlalo(); i++){
                if(this.getTomb()[i].getKezdet() == o.getKezdet())
                    volt = true;
            }
            if(!volt){
                
                this.setKód(o.getKód());
                this.setNév(o.getNév());
                this.setKezdet(o.getKezdet());
                
                Ora[] t = this.getTomb();
                t[this.getSzamlalo()] = new Ora(this.getKód(), this.getNév(), this.getKezdet());
                
                this.setTomb(t);
                this.setSzamlalo();

                return true;
            }
    
        }
        return false;
    }
    
    
}