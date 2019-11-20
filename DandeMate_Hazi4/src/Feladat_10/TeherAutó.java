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
public class TeherAutó extends Autó{
    private int teherbírás;

    public TeherAutó( String rendszám, int teljesítmény, boolean automata,int teherbírás) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás = teherbírás;
    }

    public int getTeherbírás() {
        return teherbírás;
    }

    
    @Override
    public String toString() {
        return "TeherAutó=" + "teherbírás=" + teherbírás + ",Rendszám="+this.getRendszám()+",Teljesítmény="+this.getTeljesítmény()+",Automata="+this.isAutomata();
        
    }
}
