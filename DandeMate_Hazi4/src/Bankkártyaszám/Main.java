/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankkártyaszám;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dande
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int sum=0,szam=0;
        for (int i = 0; i < 2; i++) {
            String line = sc.nextLine();
            for (int j = line.length()-1; j >-1; j--) {
                
                if(j%2 ==0)
                {
                    szam = Character.getNumericValue(line.charAt(j))*2;
                    
                    if(szam>=10)
                    {
                        szam-=9;
                        lista.add(szam);
                    }
                    else
                    {
                        lista.add(szam);
                    }
                }
                else
                {
                    lista.add(szam);
                }
                
            }
            for (int j = 0; j < lista.size(); j++) {
                
                sum+=lista.get(i);
                
            }
           
            if(sum%10==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            sum=0;
            lista.clear();
        }
    }
}
