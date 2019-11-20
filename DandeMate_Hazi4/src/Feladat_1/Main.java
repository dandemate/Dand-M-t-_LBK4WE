package Feladat_1;

public class Main {
    public static Aszu[] kereso(Bor[] b)
    {
        int szamlalo=0;
        for (int i = 0; i < b.length; i++) {
            
            if(b[i] instanceof Aszu)
            {
                Aszu a = (Aszu)b[i];
                if(a.hanyPuttonyos()==5)
                    szamlalo++;
                
            }
            
        }
        Aszu[] tomb = new Aszu[szamlalo];
        szamlalo=0;
        for (int i = 0; i < b.length; i++) {
            if(b[i] instanceof Aszu)
            {
                Aszu a = (Aszu)b[i];
                if(a.hanyPuttonyos()==5)
                {
                    tomb[szamlalo]=a;
                    szamlalo++;
                }
            }
            
        }
        return tomb;
    }
    
    public static void main(String[] args) {
        Bor[] b1 = new Bor[3];
        b1[0]=new Bor("Hárslevelű","Tokaj","Száraz",3.5);
        b1[1]=new Aszu(5,"Mézes","Badacsony","Édes",3.6);
        b1[2]=new Bor("Kékszőlő","Tokaj","Félédes",3.8);
        Aszu[] kiir = kereso(b1);
        for (int i = 0; i < kiir.length; i++) {
            System.out.println(kiir[i]);
            
        }
    }
}
