/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Szotar implements Comparable<Szotar>
{
    String angol;
    String magyar;

    public Szotar(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    @Override
    public String toString() {
        return angol+":"+magyar;
    }

    @Override
    public int compareTo(Szotar o) {
        if(!(this.angol.equals(o.angol)))
        {
            return this.angol.compareTo(o.angol);
        }
        return this.magyar.compareTo(o.magyar);
    }
}

public class AngolMagyarSzótár2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Szotar> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] token = br.readLine().split(":");
            lista.add(new Szotar(token[0],token[1]));
        }
        Collections.sort(lista);
        for (Szotar i:
             lista) {
            System.out.println(i.toString());
        }
    }
}
