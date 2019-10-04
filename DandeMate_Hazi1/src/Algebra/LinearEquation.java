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
public class LinearEquation {
    private double a,b,c,d,e,f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable(){
        if(this.a*this.d - this.b*this.c != 0) 
            return true; 
        return false;
    }
    
    public double getX()
    {
        double tmp1=(getE()*getD())-(getB()*getF());
        double tmp2=getA()*getD()-getB()*getC();
        return tmp1/tmp2;
    }
    public double getY()
    {

        double tmp1=(getA()*getF())-(getE()*getC());
        double tmp2=(getA()*getD())-(getB()*getC());

        return tmp1/tmp2;
    }
}
