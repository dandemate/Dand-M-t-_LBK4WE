
package Feladat_2;

import java.util.Scanner;

class Diak
{
    private String nev;
    private String elozo;
    private String sapka;

    public Diak(String nev, String elozo, String sapka) {
        this.nev = nev;
        this.elozo = elozo;
        this.sapka = sapka;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getElozo() {
        return elozo;
    }

    public void setElozo(String elozo) {
        this.elozo = elozo;
    }

    public String getSapka() {
        return sapka;
    }

    public void setSapka(String sapka) {
        this.sapka = sapka;
    }

    @Override
    public String toString() {
        return "Diak{" +
                "nev='" + nev + '\'' +
                ", elozo='" + elozo + '\'' +
                ", sapka='" + sapka + '\'' +
                '}';
    }
}

public class Fejesek_2 {
    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        String[] sor = sc.nextLine().split(";");

        Diak[] d = new Diak[Integer.parseInt(sor[0])];
        d[0]=new Diak(sor[1],"","piros");
        String kit = sor[2];
        for (int i = 1; i < d.length; i++) {
            sor= sc.nextLine().split(";");
            d[i]=new Diak(sor[0],sor[1],"");
        }
        for (int i = 1; i < d.length; i++) {
            int j=i;
            while (j<d.length) {
                if (d[j].getElozo().equals(d[i - 1].getNev())) {
                    if (d[i - 1].getSapka().equals("piros")) {
                        d[j].setSapka("kék");

                    } else {
                        d[j].setSapka("piros");
                    }


                    Diak tmp = d[i];
                    d[i] = d[j];
                    d[j] = tmp;
                    break;
                }
                j++;
            }

        }
        int piros=0;
        int kek=0;
        for (int i = 0; i < d.length; i++) {
            if(d[i].getNev().equals(kit))
            {
                System.out.println(piros+" "+kek);
            }
            if(i%2==0)
            {
                piros++;
            }
            else
            {
                kek++;
            }
        }
    }
}
