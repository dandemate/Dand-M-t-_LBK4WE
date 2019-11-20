/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_7;

/**
 *
 * @author dande
 */
public class Lakóház implements Comparable{

   public final double emeletMagasság=3.2;
    private String cím;
    private int emeletekSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletekSzáma, double alapterület) {
        this.cím = cím;
        this.emeletekSzáma = emeletekSzáma;
        this.alapterület = alapterület;
    }

    public String getCím() {
        return cím;
    }

    public int getEmeletekSzáma() {
        return emeletekSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }
    
    public double légköbméter()
    {
        return this.alapterület*this.emeletMagasság*this.emeletekSzáma;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Lakóház: ");
       sb.append("Emelet magasság:");
       sb.append(emeletMagasság);
       sb.append(",emeletek száma=");
       sb.append(emeletekSzáma);
       sb.append(",alapterület=");
       sb.append(alapterület);
       sb.append(",Légköbméterje=");
       sb.append(légköbméter());
           
        return sb.toString();
        
    }

    @Override
    public int compareTo(Object o) {
        Lakóház l = (Lakóház) o;
        if(l.légköbméter()<légköbméter())
            return 100;
        else if(l.légköbméter()>légköbméter())
            return -100;
        
        return 0;
    }
    
}
