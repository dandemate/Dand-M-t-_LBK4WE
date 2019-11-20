/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyetem.zh;

import java.util.Scanner;

/**
 *
 * @author dande
 */
public class Teszt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=Integer.parseInt(sc.nextLine());
         Hallgato[] tomb = new Hallgato[n];
         for (int i = 0; i < n; i++) {
            String[] token = sc.nextLine().split(" ");
            if(token[1].equals("igaz"))
            {
                tomb[i]=new Hallgato(Integer.parseInt(token[0]),true);
            }
            else
            {
                tomb[i]=new Hallgato(Integer.parseInt(token[0]),false);
            }
            
        }
         for (int i = 0; i < tomb.length; i++) {
          
          
          if(tomb[i].dolgozatotIr().getPontszam()>=35 && tomb[i].dolgozatotIr().megfelelt()==true)
          {
              System.out.println("megfelelt");
          }
          if(tomb[i].dolgozatotIr().getPontszam()<35 && tomb[i].dolgozatotIr().megfelelt()==false && tomb[i].dolgozatotIr().getPontszam()>-1  )
          {
              System.out.println("nem felelt meg");
          }
          if(tomb[i].dolgozatotIr().getPontszam()==-1 || tomb[i].dolgozatotIr().megfelelt()==false)
          {
              System.out.println("Nem írt.");
          }
           
            
        }
    }
}
