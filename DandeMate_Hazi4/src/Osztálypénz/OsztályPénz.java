/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztálypénz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dande
 */
class Money implements Comparable
    {
    String név;
    int forint;

    public Money(String név, int forint) {
        this.név = név;
        this.forint = forint;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getForint() {
        return forint;
    }

    public void setForint(int forint) {
        this.forint = forint;
    }

    @Override
    public String toString() {
        return név+";"+forint;
    }
    
    
    
    @Override
    public int compareTo(Object o) {
        Money obj = (Money)o;
        if(this.forint!=obj.forint)
        {
            return obj.forint-this.forint;
        }
        return this.név.compareTo(obj.név);
    }
    
}

public class OsztályPénz {
    public static void main(String[] args)  {
        List<Money> lista  = new ArrayList<Money>();
        Scanner sc = new Scanner(System.in);
    
        while(sc.hasNextLine())
        {
            String[] token=sc.nextLine().split(";");
            int k=-1;

            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).név.equals(token[0]))
                {
                    k=i;
                    break;
                }

            }
            if(k==-1)
            {
                lista.add(new Money(token[0],Integer.parseInt(token[1])));
            }
            else
            {
                lista.get(k).forint+=Integer.parseInt(token[1]);
            }

        }
        Collections.sort(lista);
        for(Money i:lista)
        {
            System.out.println(i.toString());
        }
    }
}
