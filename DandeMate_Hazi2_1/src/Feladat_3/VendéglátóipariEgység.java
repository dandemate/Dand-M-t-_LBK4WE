
package Feladat_3;

public class VendéglátóipariEgység {
    private String név;
    private int férőhelyekSzáma;
    private boolean dohányzó;

    public VendéglátóipariEgység(String név, int férőhelyekSzáma, boolean dohányzó) {
        this.név = név;
        this.férőhelyekSzáma = férőhelyekSzáma;
        this.dohányzó = dohányzó;
    }

    public String getNév() {
        return név;
    }

    public int getFérőhelyekSzáma() {
        return férőhelyekSzáma;
    }

    public void setDohányzó(boolean dohányzó) {
        this.dohányzó = dohányzó;
    }

    public boolean isDohányzó() {
        return dohányzó;
    }

    @Override
    public String toString() {
        return "Vend\u00e9gl\u00e1t\u00f3ipariEgys\u00e9g{" + "n\u00e9v=" + név + ", f\u00e9r\u0151helyekSz\u00e1ma=" + férőhelyekSzáma + ", doh\u00e1nyz\u00f3=" + dohányzó + '}';
    }
    
    
}
