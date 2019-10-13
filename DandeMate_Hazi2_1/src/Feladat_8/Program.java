package Feladat_8;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();


        if(!(line.equals("kő") || line.equals("papír") ||line.equals("olló")|| line.equals("vége")))
        {
            int seged=0;
            line=sc.nextLine();
            if(line.equals("kő"))
            {
                seged=0;
            }
            if(line.equals("papír"))
            {
                seged=1;
            }
            if(line.equals("olló"))
            {
                seged=2;
            }
            if(line.equals("vége"))
            {
                System.out.println("Vége a játéknak.");

            }

            else if(line.equals("kő") || line.equals("papír") || line.equals("olló"))
            {
                Random rand = new Random();
                int szam = rand.nextInt(3);
                if(szam==seged)
                {
                    System.out.println("Döntetlen.");
                }
                if(szam==0 && seged==1)
                {
                    System.out.println("Te nyertél.");
                }
                if(szam==0 && seged==2)
                {
                    System.out.println("Ellenfél nyert.");
                }
                if(szam==1 && seged==0)
                {
                    System.out.println("Te nyertél.");
                }
                if(szam==1 && seged==2)
                {
                    System.out.println("Ellenfél nyert.");
                }
                if(szam==2 && seged==1)
                {
                    System.out.println("Ellenfél nyert.");
                }
                if(szam==2 && seged==0)
                {
                    System.out.println("Te  nyertél.");
                }
            }
        }
        else
        {
            int seged=0;
            if(line.equals("vége"))
            {
                System.out.println("Vége a játéknak.");
            }
            else {
                if (line.equals("kő")) {
                    seged = 0;
                }
                if (line.equals("papír")) {
                    seged = 1;
                }
                if (line.equals("olló")) {
                    seged = 2;
                }

                Random rand = new Random();
                int szam = rand.nextInt(3);
                if (szam == seged) {
                    System.out.println("Döntetlen.");
                }
                if (szam == 0 && seged == 1) {
                    System.out.println("Te nyertél.");
                }
                if (szam == 0 && seged == 2) {
                    System.out.println("Ellenfél nyert.");
                }
                if (szam == 1 && seged == 0) {
                    System.out.println("Te nyertél.");
                }
                if (szam == 1 && seged == 2) {
                    System.out.println("Ellenfél nyert.");
                }
                if (szam == 2 && seged == 1) {
                    System.out.println("Ellenfél nyert.");
                }
                if (szam == 2 && seged == 0) {
                    System.out.println("Te  nyertél.");
                }
            }
        }
    }
}