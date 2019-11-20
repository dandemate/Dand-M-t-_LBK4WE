/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_10;

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
        String[] token = sc.nextLine().split(" ");
        Autó auto = new Autó(token[0],Integer.parseInt(token[1]),true);
        System.out.println(auto.toString());
        Autó[] tomb = new Autó[4];
        List<Autó> listam = new ArrayList<Autó>();
        listam.add(new Autó("ABC123",80,true));
        listam.add(new Autó("ABC123",81,true));
        listam.add(new Autó("ABC123",82,true));
        listam.add(new Autó("ABC123",83,true));
        kereső(listam);
        for (int i = 0; i < 2; i++) {
            token=sc.nextLine().split(" ");
            if(token[2].equals("true"))
            {
                tomb[i]=new Autó(token[0],Integer.parseInt(token[1]),true);
            }
            else
            {
                tomb[i]=new Autó(token[0],Integer.parseInt(token[1]),false);
            }
        }
        for (int i = 2; i < 4; i++) {
            token=sc.nextLine().split(" ");
            if(token[2].equals("true"))
            {
                tomb[i]=new TeherAutó(token[0],Integer.parseInt(token[1]),true,Integer.parseInt(token[3]));
            }
            else
            {
                tomb[i]=new TeherAutó(token[0],Integer.parseInt(token[1]),false,Integer.parseInt(token[3]));
            }
            
        }
        for (int i = 0; i < tomb.length-2; i++) {
            
            System.out.println(tomb[i].vizsgalo(tomb[i]));
            
        }
        System.out.println(figyelő(tomb).toString());
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] instanceof Autó)
            {
                if(!tomb[0].getExtra().isEmpty())
                {
                    tomb[0].setExtra("");//törlés
                }
            }
            
        }
        
    }
    
    public static List<TeherAutó> figyelő(Autó[] tomb)
    {
        List<TeherAutó> lista = new ArrayList<TeherAutó>();
        
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] instanceof TeherAutó)
            {
               TeherAutó t = (TeherAutó)tomb[i];
               if(t.getTeherbírás()>=20000)
               {
                   lista.add(t);
               }
                
            }
            
        }
        
        return lista;
    }
    
    public static void kereső(List<Autó> lista)
    {
        if(lista.size()<=3)
        {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).toString());
                
            }
        }
        else
        {
            int max1=-1,max2=-1,max3=-1;
            
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTeljesítmény()>max1)
                {
                    max1=lista.get(i).getTeljesítmény();
                }
                
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTeljesítmény()==max1)
                {
                    System.out.println(lista.get(i).toString());
                }
                
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTeljesítmény()>max2 && lista.get(i).getTeljesítmény()!=max1)
                {
                    max2=lista.get(i).getTeljesítmény();
                }
                
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTeljesítmény()==max2)
                {
                    System.out.println(lista.get(i).toString());
                }
                
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTeljesítmény()>max3 && lista.get(i).getTeljesítmény()!=max2 && lista.get(i).getTeljesítmény()!=max1)
                {
                    max3=lista.get(i).getTeljesítmény();
                }
                
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTeljesítmény()==max3)
                {
                    System.out.println(lista.get(i).toString());
                }
                
            }
        }
    }
}
