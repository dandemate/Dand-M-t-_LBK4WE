/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyetem.zh;

import java.util.Random;

/**
 *
 * @author dande
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    

    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public void setMennyitKeszult(int mennyitKeszult) {
        this.mennyitKeszult = mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }

    public void setSokatTanul(boolean sokatTanul) {
        this.sokatTanul = sokatTanul;
    }
    
    public   Dolgozat dolgozatotIr()
    {
        
        if(this.isSokatTanul())
        {
            Random rnd = new Random();
            int szam=rnd.nextInt(3+1)+4;
            szam*=this.getMennyitKeszult();
            Dolgozat dolgozat = new Dolgozat(szam);
            
            return dolgozat;
            
            
        }
        if(!this.isSokatTanul())
        {
            Random rnd = new Random();
            int szam=rnd.nextInt(5+1);
            szam*=this.getMennyitKeszult();
            Dolgozat dolgozat = new Dolgozat(szam);
            
            return dolgozat;
        }
        else
        {
            Dolgozat dolgozat=new Dolgozat(-1);
            
            return dolgozat;
        }
    }
}
