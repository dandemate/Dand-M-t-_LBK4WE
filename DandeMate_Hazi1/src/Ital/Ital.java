/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ital;

import java.util.Date;

/**
 *
 * @author dande
 */
public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár;
    protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        Date gyártásiDátum = new Date();

    }

    public static int getÁr() {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = 10;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public boolean equals(Ital obj) {
        return this.név.compareTo(obj.név) == 0 && this.kiszerelés.compareTo(obj.kiszerelés) == 0 && ár == Ital.getÁr();
    }
    public static double getÁrEuróban()
    {
        return getÁr()/335;
    }

    @Override
    public String toString() {
        return  név +
                ", " + kiszerelés + "dl, " +
               getÁr()+"Ft";
    }
}
