package Feladat_3;

import java.util.logging.Logger;

public class Étterem extends VendéglátóipariEgység{
    private String[] étlap;

    public Étterem(String név, int férőhelyekSzáma, String[] étlap) {
        super(név, férőhelyekSzáma, false);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return "Etterem{" + "\u00e9tlap=" + étlap + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
