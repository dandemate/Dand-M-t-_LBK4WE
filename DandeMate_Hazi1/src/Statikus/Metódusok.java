package Statikus;

import java.util.*;

public class Metódusok {
    public static void novekvo(int a, int b, int c){
        Integer[] t = {a,b,c};
        Arrays.sort(t);
        System.out.println(t[0]+" "+t[1]+" "+t[2]);
    }
    
    public static void minAbsMax(double a, double b, double c){
        double[] t = {a, b, c};
        double min = Arrays.stream(t).min().getAsDouble();
        
        //Abs meghatározás
        for(int i=0; i<3; i++){
            if(t[i]<0)
                t[i] = t[i]*(-1);
        }
        double max = Arrays.stream(t).max().getAsDouble();
        
        System.out.println("Min: "+min+"\n"+"Max: "+max);
              
    }
    
    public static void negyValosSzam(double a, double b, double c, double d){
        System.out.println(a+" "+b+" "+c+" "+d);
        if(d>=0)
            System.out.println(a+" "+c+" "+b+" "+d);
        else
            System.out.println(a+" "+b+" "+d+" "+c);
    }
    
    public static boolean haromszog(double a, double b, double c){
        if(a<b+c && b<a+c && c<a+b) 
            return true;
        return false;
    }
    
    public static int szokoEv(int a, int b){
        int db=0;
        for(int i=a; i<=b; i++){
            if((i%4==0 && i%100!=0) || i%400==0)
                db++;
        }
        return db;
    }
    
    private static void dolgozat(int a){
        switch(a){
            case 1: 
                System.out.println("Elégtelen");
                break;
            case 2: 
                System.out.println("Elégséges");
                break;
            case 3: 
                System.out.println("Közepes");
                break;
            case 4: 
                System.out.println("Jó");
                break;
            case 5: 
                System.out.println("Ötös");
                break;
            default: 
                System.out.println("Nem érdemjegy!");
                break;
        }
    }
    
    public static void kivonas(int a,int b)
    {
        int c=0;
        while(a>=b)
        {
            a-=b;
            c+=1;
        }
        System.out.println(c);
    }
    
    public static void primSzam(int a){
        int osztok=0;
        for (int i = 1; i <= a; i++) {
            if(a%i==0)
                osztok+=1;
            
        }
        if(osztok==2)
            System.out.println("Prím");
        else
            System.out.println("Nem prím");
    }
    
    public static void fiboNaccsi(int db){
        int a=1; 
        int b=0;
        for (int i=1; i<=db; i++) {
            System.out.print(b);
            b+=a;
            a=b-a;
            System.out.print(" ");
        }
        System.out.println("");
    }
    
    public static void forditva(int n){
        System.out.print("Régi szám: "+n);
        int ujszam = 0;
        while(n!=0){
            ujszam = ujszam*10+n%10;
            n /= 10;
        }
        System.out.println(" Új szám: "+ujszam);
    }
    
    public static int faktorialis(int n){
        if(n==0)
            return 1;
        else
            return(n*faktorialis(n-1));
    }
    
    public static void kvalOszthatoIze(int a, int b, int k){
        System.out.print("K-val osztható számok: ");
        for(int i=a; i<=b; i++){
            if(i%k==0)
                System.out.print(i+" ");
        }
        System.out.println("");
    }
    
    public static int fiboNaccsiKeres(int n){
        int a=1;
        int b=0;
        for (int i = 1; i<n; i++) {
            if(b>n)
                return b;
            b+=a;
            a=b-a;
        }
        return 0;
    }
    
    public static void ezernélKisebbSzámok(){
        for(int i=0; i<1000; i++){
            int tmp=i;
            int osszeg=0;
            while(tmp>0){
                osszeg += Math.pow(tmp%10, 3);
                tmp/=10;
            }
            
            if(osszeg==i) 
                System.out.print(i+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        System.out.println("1. Feladat");
        novekvo(3,2,1);
        System.out.println("\n2. Feladat");
        minAbsMax(-6.0, 2.2, 1.6);
        System.out.println("\n3. Feladat");
        negyValosSzam(1.2, 3.6, -5.4, 0);
        System.out.println("\n4. Feladat");
        System.out.println(haromszog(3, 3, 3));
        System.out.println("\n5. Fleadat");
        System.out.println(szokoEv(100, 400));
        System.out.println("\n6. Feladat");
        dolgozat(5);
        System.out.println("\n7. Feladat");
        kivonas(40, 20);
        System.out.println("\n8. Feladat");
        primSzam(7);
        System.out.println("\n9. Feladat");
        fiboNaccsi(10);
        System.out.println("\n10. Feladat");
        forditva(12345);
        System.out.println("\n11. Feladat");
        System.out.println(faktorialis(5));
        System.out.println("\n12. Feladat");
        kvalOszthatoIze(0, 100, 5);
        System.out.println("\n13. Feladat");
        System.out.println(fiboNaccsiKeres(12));
        System.out.println("\n14. Feladat");
        ezernélKisebbSzámok();
        
    }
}
