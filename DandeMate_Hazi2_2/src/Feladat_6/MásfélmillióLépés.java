
package Feladat_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Emberek implements Comparable<Emberek>
{

    String név;
    int kek_szamai;
    int mas_jelzes_szamai;

    public Emberek(String név, int kek_szamai, int mas_jelzes_szamai) {
        this.név = név;
        this.kek_szamai = kek_szamai;
        this.mas_jelzes_szamai = mas_jelzes_szamai;
    }

    @Override
    public String toString() {
        return név;
    }

    @Override
    public int compareTo(Emberek o) {
       if(this.kek_szamai!=o.kek_szamai)
       {
           return o.kek_szamai-this.kek_szamai;

       }
       if(this.mas_jelzes_szamai!=o.mas_jelzes_szamai)
       {
           return o.mas_jelzes_szamai-this.mas_jelzes_szamai;
       }
        return this.név.compareTo(o.név);
    }
}

public class MásfélmillióLépés {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Emberek> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] token=br.readLine().split(";");
            int kek=0;
            int egyeb_szin=0;
            for (int j = 0; j < token[1].length(); j++) {

                 if(token[1].charAt(j) == 'K')
                {
                    kek++;
                }
                if(token[1].charAt(j)=='P' || token[1].charAt(j)=='S' || token[1].charAt(j)=='Z' )
                {
                    egyeb_szin++;
                }
            }
            lista.add(new Emberek(token[0],kek,egyeb_szin));
        }
        Collections.sort(lista);
        for (Emberek i:
             lista) {
            System.out.println(i.toString());
        }
    }
}
