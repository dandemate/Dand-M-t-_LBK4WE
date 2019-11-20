
package Feladat_1;


public class Aszu extends Bor{
    private int puttonySzam;
    
    public Aszu(int puttonyszam, String sz, String t, String i, double a) {
        super(sz, t, i, a);
        this.puttonySzam = puttonyszam;
    }
    
    public int hanyPuttonyos() {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu:"+"Iz="+super.milyenIzu()+",mennyi alkoholt tartalmaz="+super.mennyiAlkoholtTartalmaz()+",milyen szőlőből készült:"+super.milyenSzolobolKeszult()+",Termoterulet="+super.holTermett()+",puttyonszam="+this.puttonySzam;
    }
}
