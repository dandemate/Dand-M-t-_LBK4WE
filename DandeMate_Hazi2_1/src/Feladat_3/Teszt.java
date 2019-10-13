
package Feladat_3;
import java.lang.String;
import java.util.ArrayList;

public class Teszt {
    public static void main(String[] args) {
        VendéglátóipariEgység[] t = new VendéglátóipariEgység[]{
            new Étterem("Étterem1", 1000, new String[] {"Vajaskenyér", "Zsemle", "Fény"}),
            new Étterem("Étterem2", 900, new String[] {"Kecske", "Galamb", "Kutya"}),
            new Étterem("Étterem3", 800, new String[] {"Hús1", "Hús2", "Hús3"}),
            new Étterem("Étterem4", 700, new String[] {"Valami1", "Valami2", "Valami3"}),
            new Étterem("Étterem5", 600, new String[] {"Bécsi szelet", "Cola", "Rizs"}),
            new Kocsma("Étterem5", 600, new String[] {"Sőr1", "Sör2", "Sör3"}),
            new Kocsma("Étterem5", 600, new String[] {"Vodka3", "Vodka2", "Vodka1"}),
            new Kocsma("Étterem5", 600, new String[] {"Bor1", "Bor3", "Bor2"}),
            new Kocsma("Étterem5", 600, new String[] {"Víz1", "Víz3", "Víz5"}),
            new Kocsma("Étterem5", 600, new String[] {"Whisky1", "Sör2", "Whisky0"}),      
        };
        
        adottItaltKínálóKocsmák("Sör2", t);
    }
    
    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] t){
        ArrayList<Kocsma> tomb = new ArrayList<>();
        
        int db=0;
        for(int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma ){
                for(String s : ((Kocsma)t[i]).getSörlap()){
                    if(s == ital){
                        tomb.add(db, (Kocsma)t[i]);
                    }
                }
            }
        }
        
        for(Kocsma k : tomb){
            System.out.print("Név: "+k.getNév()+" Férőhely: "+k.getFérőhelyekSzáma()+" Sörlap: ");
            for(String s : k.getSörlap()){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        
        return tomb.toArray(new Kocsma[tomb.size()]);
    }
}
