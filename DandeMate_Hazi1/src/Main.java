/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dande
 */
public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont(0,1);
        Pont p2 = new Pont(1,1);
        Pont p3 = new Pont(1,0);
        Pont p4 = new Pont(0,0);
        
        p1.setY(p1.getY()+5);
        p2.setY(p2.getY()+5);
        p3.setX(p3.getX()-3.4);
        p4.setX(p4.getX()-3.4);
        
        System.out.println("P1: "+p1.getX()+";"+p1.getY()+
                "\nP2: "+p2.getX()+";"+p2.getY()+
                "\nP3: "+p3.getX()+";"+p3.getY()+
                "\nP4: "+p4.getX()+";"+p4.getY());
    }
}
