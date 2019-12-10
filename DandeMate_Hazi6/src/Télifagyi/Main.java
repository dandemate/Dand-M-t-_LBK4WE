/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Télifagyi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dande
 */
class Rendeles{
    private String név;
    private String[] ízek;

    public Rendeles(String név, String[] ízek) {
        this.név = név;
        this.ízek = ízek;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String[] getÍzek() {
        return ízek;
    }

    public void setÍzek(String[] ízek) {
        this.ízek = ízek;
    }
    
    
}

class Fagyi{
    private String íz;
    private int ár;

    public Fagyi(String íz, int ár) {
        this.íz = íz;
        this.ár = ár;
    }

    public String getÍz() {
        return íz;
    }

    public void setÍz(String íz) {
        this.íz = íz;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }
    
    
}


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("fagyik.txt"));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Rendeles> rLista = new ArrayList<>();
        String[] token;
        String line;
        String[] izek;
        Rendeles r;
        
        while((line=br.readLine())!=null){
            token = line.split(";");
            izek = token[1].split(",");
            r = new Rendeles(token[0], izek);
            rLista.add(r);
        }
        
        
        
        List<Fagyi> fList = new ArrayList<>();
        Fagyi f;
        while((line = input.readLine())!=null){
            token = line.split(";");
            f = new Fagyi(token[0], Integer.parseInt(token[1]));
            fList.add(f);
        }
        
        int osszeg = 0;
        for (Rendeles re : rLista) {
            for(Fagyi fa : fList){
                for(int i=0; i<re.getÍzek().length; i++){
                    System.out.println(re.getÍzek()[i]);
                }
            }
        }
    }
}
