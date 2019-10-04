/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author dande
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter(int oldal, double hossz){
        double eredmeny=0;
        for(int i=0; i<oldal; i++){
            eredmeny+=hossz;
        }
        return eredmeny;
    }
    
    public double getArea(int oldal, double hossz){
        double szog = 360/oldal;
        return oldal*Math.pow(hossz, 2)*Math.sin(Math.toRadians(szog))/2;
    }

    @Override
    public String toString() {
        return "Kerület: "+ this.getPerimeter(this.getN(), this.side)+"\n"+
                "Terület: "+this.getArea(this.getN(), this.side);
    }
    
    
}
