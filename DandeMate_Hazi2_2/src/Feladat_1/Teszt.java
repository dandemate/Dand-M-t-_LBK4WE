
package Feladat_1;

public class Teszt {
    public static void main(String[] args) {

        Katona k1 = new Nyilas(6,6,3);
        Katona k2 = new Nyilas(8,7,1);
        Katona k3 = new Lándzsás(6,6);
        System.out.println("Első kör győztese k1 és k2 között: "+megkuzd(k1,k2));
        if(megkuzd(k1,k2).equals(k1))
        {
            System.out.println("Második kör győztese k1 és k3 között: "+megkuzd(k1,k3));
        }
        else
        {
            System.out.println("Második kör győztese k2 és k3 között: "+megkuzd(k2,k3));
        }

    }
    public static Katona megkuzd(Katona k1,Katona k2)
    {
        if(k1.getTámadó_erő()>k2.getVédő_erő())
        return k1;
        if(k2.getTámadó_erő()>k1.getVédő_erő())
            return k2;

        return k1;

    }
    
}
