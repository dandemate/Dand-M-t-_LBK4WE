
package Feladat_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Hullamvasutak implements Comparable<Hullamvasutak>
{
    String nev;
    String vilag;
    int legkisebb_magassag;
    int varakozasi_ido;

    public Hullamvasutak(String nev, String vilag, int legkisebb_magassag, int varakozasi_ido) {
        this.nev = nev;
        this.vilag = vilag;
        this.legkisebb_magassag = legkisebb_magassag;
        this.varakozasi_ido = varakozasi_ido;
    }

    @Override
    public String toString() {
        return nev+"("+vilag+"): "+varakozasi_ido;
    }

    @Override
    public int compareTo(Hullamvasutak o) {
        if(this.varakozasi_ido!=o.varakozasi_ido)
            return this.varakozasi_ido-o.varakozasi_ido;
         if(this.legkisebb_magassag!=o.legkisebb_magassag)
            return o.legkisebb_magassag-this.legkisebb_magassag;
        return this.nev.compareTo(o.nev);
    }
}



public class Hullamvasut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Hullamvasutak> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] token = br.readLine().split(";");
            lista.add(new Hullamvasutak(token[0],token[1],Integer.parseInt(token[2]),Integer.parseInt(token[3])));
        }
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }

    }
}