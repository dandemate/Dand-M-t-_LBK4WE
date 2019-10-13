
package Feladat_1;

public class Teszt {
    public static void main(String[] args) {
Katona kat1 = new Nyilas(6,6,3);
        Katona kat2 = new Nyilas(8,7,1);
        Katona kat3 = new Lándzsás(6,6);



        if(megkuzd(kat1,kat2)==kat1)
        {

            if(megkuzd(kat1,kat3)==kat1)
            {
                System.out.println("Életben maradt: "+kat1.toString());
            }
            else
            {
                System.out.println("Életben maradt: "+kat3.toString());
            }
        }
        else
        {
            if(megkuzd(kat2,kat3)==kat1)
            {
                System.out.println("Életben maradt: "+kat2.toString());
            }
            else
            {
                System.out.println("Életben maradt: "+kat3.toString());
            }
        }


    }
    public static Katona megkuzd(Katona k1,Katona k2)
    {
        System.out.println("Résztvevők: "+k1.toString()+", ellenfele: "+k2.toString());


        if(k1.getTámadó_erő()>k2.getVédő_erő()) {
            System.out.println("Győztes: "+k1.toString());
            return k1;
        }
        if(k2.getTámadó_erő()>k1.getVédő_erő()) {
            System.out.println("Győztes: "+k2.toString());
            return k2;
        }
        else {
            System.out.println("Győztes: "+k1.toString());
            return k1;
        }
    }
    
}
