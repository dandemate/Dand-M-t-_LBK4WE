
package Feladat_7.Iskola;


public class Ora {
    private int kód;
    private String név;
    private int kezdet;

    public Ora() {
    }

    public Ora(int kód, String név, int kezdet) {
        this.kód = kód;
        this.név = név;
        if(kezdet < 8) 
            this.kezdet = 8;
        else if(kezdet > 19) 
            this.kezdet = 19;
        else 
            this.kezdet = kezdet;
 
    }

    public int getKód() {
        return kód;
    }

    public String getNév() {
        return név;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKezdet(int kezdet) {
        if(kezdet < 8) 
            this.kezdet = 8;
        else if(kezdet > 19) 
            this.kezdet = 19;
        else 
            this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Ora{" + "k\u00f3d=" + kód + ", n\u00e9v=" + név + ", kezdet=" + kezdet + '}';
    }
    
    
    
    
}
