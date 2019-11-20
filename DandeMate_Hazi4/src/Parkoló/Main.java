/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkoló;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dande
 */
class Autó implements Comparable
{
    String név;
    int férőhely;

    public Autó(String név, int férőhely) {
        this.név = név;
        this.férőhely = férőhely;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getFérőhely() {
        return férőhely;
    }

    public void setFérőhely(int férőhely) {
        this.férőhely = férőhely;
    }

    @Override
    public String toString() {
        return név+": "+férőhely+" szabad hely";
    }
    
    
    @Override
    public int compareTo(Object o) {
        Autó obj = (Autó)o;
        if(this.férőhely!=obj.férőhely)
        {
            return obj.férőhely-this.férőhely;
        }
        return this.név.compareTo(obj.név);
    }
    
}
public class Main {
    public static void main(String[] args) {
        List<Autó> lista = new ArrayList<Autó>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String[] token = sc.nextLine().split(";");
            if(token.length==3)
            {
                lista.add(new Autó(token[0],Integer.parseInt(token[2])));
            }
            else
            {
               lista.add(new Autó(token[0],Integer.parseInt(token[2])-(token.length-3))); 
            }
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).férőhely>=3)
            {
                System.out.println(lista.get(i).toString());
            }
            
        }
    }
}
