
package Feladat_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Turazok implements Comparable<Turazok> {

    String ev;
    String honap;
    String nap;
    String nev;
    int hossz=0;

    public Turazok(String ev, String honap, String nap, String nev, int hossz) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.hossz = hossz;
    }

    @Override
    public String toString() {
        return ev+";"+honap+";"+nap+";"+nev;
    }

    @Override
    public int compareTo(Turazok o) {
        if(!(this.ev.equals(o.ev)))
        {
            return this.ev.compareTo(o.ev);
        }
        else if(!(this.honap.equals(o.honap)))
        {
            return this.honap.compareTo(o.honap);
        }
        else if(!(this.nap.equals(o.nap)))
        {
            return this.nap.compareTo(o.nap);
        }
        return this.nev.compareTo(o.nev);
    }
}

public class BudapestKupa_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Turazok> lista = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int hossz=0;

            String[] token =br.readLine().split(";");
            for (int j = 4; j < token.length; j++) {
                hossz+=Integer.parseInt(token[j]);
            }
            if(hossz>max)
            {
                max=hossz;
            }
            lista.add(new Turazok(token[0],token[1],token[2],token[3],hossz));
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).hossz==max)
            {
                System.out.println(lista.get(i).toString());
            }
        }
    }
}