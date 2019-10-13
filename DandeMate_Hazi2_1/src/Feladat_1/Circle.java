/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_1;

import java.util.Date;

/**
 *
 * @author dande
 */
public class Circle extends GeometricShape {

    private double radius;
    
    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double area = Math.pow(getRadius(), 2)*Math.PI;
        return area;
    }
    
    public double getPerimeter(){
        double perimeter = 2*getRadius()*Math.PI;
        return perimeter;
    }
    
    public double getDiameter(){
        double diameter = 2*getRadius();
        return diameter;
    }
    
    
    
}
