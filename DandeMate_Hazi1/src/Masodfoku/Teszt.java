/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masodfoku;

/**
 *
 * @author dande
 */
public class Teszt {
    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(1,6,3);
        QuadraticEquation q2 = new QuadraticEquation(1,5,4);
        QuadraticEquation q3 = new QuadraticEquation(1,4,2);


        if(q1.getDiscriminant()==0)
        {
            System.out.println(q1.getRoot1());
        }
        if(q1.getDiscriminant()>0)
        {
            System.out.println("Root1:"+q1.getRoot1()+" Root2:"+q1.getRoot2());
        }
        else
        {
            System.out.println("The equation has no roots.");
        }

        if(q2.getDiscriminant()==0)
        {
            System.out.println(q2.getRoot1());
        }
        if(q2.getDiscriminant()>0)
        {
            System.out.println("Root1:"+q2.getRoot1()+" Root2:"+q2.getRoot2());
        }
        else
        {
            System.out.println("The equation has no roots.");
        }

        if(q3.getDiscriminant()==0)
        {
            System.out.println(q3.getRoot1());
        }
        if(q3.getDiscriminant()>0)
        {
            System.out.println("Root1:"+q3.getRoot1()+" Root2:"+q3.getRoot2());
        }
        else
        {
            System.out.println("The equation has no roots.");
        }


    }
    
}
