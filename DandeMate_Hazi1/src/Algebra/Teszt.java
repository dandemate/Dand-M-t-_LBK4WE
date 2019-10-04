/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algebra;

/**
 *
 * @author dande
 */
public class Teszt {
    public static void main(String[] args) {
        LinearEquation L1=new LinearEquation(1,2,2,4,5,6);
        LinearEquation L2=new LinearEquation(1,2,3,4,5,6);
        LinearEquation L3=new LinearEquation(5,7,6,2,1,3);
        if(!L1.isSolvable())
        {
            System.out.println("The equation has no solution.");
        }
        else
        {
            System.out.println("X="+L1.getX()+" Y="+L1.getY());
        }
        if(!L2.isSolvable())
        {
            System.out.println("The equation has no solution.");
        }
        else
        {
            System.out.println("X="+L2.getX()+" Y="+L2.getY());
        }
        if(!L3.isSolvable())
        {
            System.out.println("The equation has no solution.");
        }
        else
        {
            System.out.println("X="+L3.getX()+" Y="+L3.getY());
        }

    }
}
