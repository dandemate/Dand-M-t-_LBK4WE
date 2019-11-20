/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyetem.zh;
import egyetem.Pontozhato;
/**
 *
 * @author dande
 */
public class Dolgozat implements Pontozhato{
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if(pontszam==-1)
        {
            
            return false;
        }  
        else if(pontszam>=35)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }
}
