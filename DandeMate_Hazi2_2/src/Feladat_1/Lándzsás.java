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
public class Lándzsás extends Katona {
    public Lándzsás(int támadó_erő, int védő_erő) {
        super(támadó_erő, védő_erő);
    }

    @Override
    public String toString() {
        return "Lándzsás:"+super.toString();
    }

}
