
package Feladat_7.Iskola;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nap: ");
        String nap = sc.next();
        System.out.print("Hány órát szeretnénk hozzáadni: ");
        int db = sc.nextInt();
        System.out.println("Óra adatok!");
        
        
        int kod, kezdet;
        String nev;
        Ora[] o = new Ora[db];
        for(int i=0; i<db; i++){
            System.out.println("Új óra hozzáadás:");
            System.out.print("Kód: ");
            kod = sc.nextInt();
            System.out.print("Név: ");
            nev = sc.next();
            System.out.print("Kezdet: ");
            kezdet = sc.nextInt();
            o[i] = new Ora(kod, nev, kezdet);
        }
        
        Orarend oRend = new Orarend(nap);
        
        for(int i=0; i<db; i++){
            if(oRend.oratHozzaad(o[i]))
                System.out.println("Sikeres hozzáadás!");
            else
                System.out.println("Nem sikerült a hozzáadás!");
        }
        
        //Teszt
        System.out.println(oRend.getNap());
        for(int i=0; i<oRend.getSzamlalo(); i++){
            System.out.println(oRend.getTomb()[i].toString());
        }
        
        
    }
}
