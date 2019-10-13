/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Hőmérséklet implements Comparable<Hőmérséklet>
{
    String varos;
    int hőfok;

    public Hőmérséklet(String varos, int hőfok) {
        this.varos = varos;
        this.hőfok = hőfok;
    }

    @Override
    public String toString() {
        return varos+" ("+hőfok+")";
    }

    @Override
    public int compareTo(Hőmérséklet o) {
       if(this.hőfok!=o.hőfok)
           return o.hőfok-this.hőfok;
        return this.varos.compareTo(o.varos);
    }
}


public class IzzasztóFeladat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] token = br.readLine().split(" ");
        int n = Integer.parseInt(token[0]);
        String keresendo = token[1];
        boolean flag = false;
        int hofok=0;
        ArrayList<Hőmérséklet> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            token=br.readLine().split(":");
            if(token[0].equals(keresendo))
            {
                flag = true;
                hofok=Integer.parseInt(token[1]);
            }
            lista.add(new Hőmérséklet(token[0],Integer.parseInt(token[1])));
        }
        if(flag) {
            Collections.sort(lista);
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).hőfok>hofok)
                {
                    System.out.println(lista.get(i).toString());
                }
            }
        }
        else
        {
            System.out.println("Missing data");
        }
    }
}
