/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_1;

/**
 *
 * @author dande
 */
public abstract class Gyumolcsle {
    

    public Gyumolcsle(Gyumolcs gy) {
    
    }
  
    public abstract String mibolFacsartak();
    
    public abstract String mibolKeszult();

    public abstract String milyenIzu();

    @Override
    public String toString() {
        return "Gyumolcsle{}";
    }
}
