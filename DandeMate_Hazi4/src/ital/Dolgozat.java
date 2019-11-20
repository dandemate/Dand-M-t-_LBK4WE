
package ital;

import java.util.Arrays;

public class Dolgozat {
    public static SzeszesItal[] legMagasabb(Ital[] t){
        
        int szamlalo=0;
        
        for (int i = 0; i < t.length; i++) {
            if(t[i] instanceof SzeszesItal)
            {
                szamlalo++;
            }
            
        }
        
        if(szamlalo<3) return null;
        
        
            SzeszesItal[] tomb = new SzeszesItal[szamlalo];
            SzeszesItal[] tomb2 = new SzeszesItal[3];
            szamlalo=0;
            
            double max1=0.0,max2=0.0,max3=0.0;
            
            for (int i = 0; i < t.length; i++) {
                if(t[i] instanceof SzeszesItal)
            {
                SzeszesItal to = (SzeszesItal) t[i];
                if(to.getAlkoholTartalom()>max1)
                {
                    max1=to.getAlkoholTartalom();
                }
            }
                
                
            }
            
            for (int i = 0; i < t.length; i++) {
                 if(t[i] instanceof SzeszesItal)
            {
                SzeszesItal to = (SzeszesItal) t[i];
                if(to.getAlkoholTartalom()==max1)
                {
                    tomb2[szamlalo]=to;
                    szamlalo++;
                }
            }
                
            }
            
           for (int i = 0; i < t.length; i++) {
                if(t[i] instanceof SzeszesItal)
            {
                SzeszesItal to = (SzeszesItal) t[i];
                if(to.getAlkoholTartalom()>max2 && to.getAlkoholTartalom()!=max1)
                {
                    max2=to.getAlkoholTartalom();
                }
            }
                
                
            }
            
            for (int i = 0; i < t.length; i++) {
                 if(t[i] instanceof SzeszesItal)
            {
                SzeszesItal to = (SzeszesItal) t[i];
                if(to.getAlkoholTartalom()==max2)
                {
                    tomb2[szamlalo]=to;
                    szamlalo++;
                }
            }
                
            }
            for (int i = 0; i < t.length; i++) {
                if(t[i] instanceof SzeszesItal)
            {
                SzeszesItal to = (SzeszesItal) t[i];
                if(to.getAlkoholTartalom()>max3 && to.getAlkoholTartalom()!=max2 && to.getAlkoholTartalom()!=max1)
                {
                    max3=to.getAlkoholTartalom();
                }
            }
                
                
            }
            
            for (int i = 0; i < t.length; i++) {
                 if(t[i] instanceof SzeszesItal)
            {
                SzeszesItal to = (SzeszesItal) t[i];
                if(to.getAlkoholTartalom()==max3)
                {
                    tomb2[szamlalo]=to;
                    szamlalo++;
                }
            }
                
            }
            
            return tomb2;
        
    }
    public static void main(String[] args) {
        Ital[] tombom = new Ital[4];
        tombom[0]=new SzeszesItal(72.0,"Tátra Tea","1 l",7500);
        tombom[1]=new SzeszesItal(40.0,"Whiskey","1 l",3500);
        tombom[2]=new SzeszesItal(4.0,"Sör","2 l",500);
        tombom[3]=new Ital("Coca-Cola","5 dl",350);
        SzeszesItal[] kiir = legMagasabb(tombom);
        Arrays.sort(kiir);
        for (int i = 0; i < kiir.length; i++) {
            System.out.println(kiir[i].toString());
            
        }
    }
        
}
