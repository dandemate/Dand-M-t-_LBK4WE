/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_10;

/**
 *
 * @author dande
 */
public class Autó implements Comparable{
    private String rendszám; 
    private int teljesítmény; 
    private boolean automata;
    public int counter=0;
    private String extra;
    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        this.extra="";
        counter++;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    

    public String getRendszám() {
        return rendszám;
    }
    public int getHányDarabAutó()
    {
        return counter;
    }
    
    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null || !(obj instanceof Autó))
           return false;
       Autó o = (Autó)obj;
       return this.rendszám.equals(o.getRendszám());
    }

    @Override
    public int compareTo(Object o) {
       Autó obj = (Autó)o;
       if(this.teljesítmény>obj.getTeljesítmény())
           return -100;
       else if(this.teljesítmény<obj.getTeljesítmény())
           return 100;
        return 0;
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", teljes\u00edtm\u00e9ny=" + teljesítmény + ", automata=" + automata+", extra="+extra + '}';
    }
    
    public boolean vizsgalo(Autó auto)
    {
        int counter=0,counter2=0;
        if(auto.rendszám.length()!=6)
            return false;
        for (int i = 0; i < auto.rendszám.length()-3; i++) {
            if(auto.rendszám.charAt(i)>='A' && auto.rendszám.charAt(i)<='Z' )
                counter++;
            
        }
        for (int i = 3; i < auto.rendszám.length(); i++) {
            if(Character.isDigit(auto.rendszám.charAt(i)) )
                counter2++;
            
        }
        
        if(counter==3 && counter2==3)
        return true;
        
       return false; 
    }
}
