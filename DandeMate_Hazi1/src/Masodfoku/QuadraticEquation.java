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
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getDiscriminant()
    {
        return (getB()*getB())-(4*getA()*getC());
    }
    public double getRoot1()
    {
        if (getDiscriminant()<0)
        {
            return 0;
        }
        else
        {
            return (-getB()+Math.sqrt(getDiscriminant()))/(2*getA());
        }
    }
    public double getRoot2()
    {
        if (getDiscriminant()<0)
        {
            return 0;
        }
        else
        {
            return (-getB()-Math.sqrt(getDiscriminant()))/(2*getA());
        }
    }

    @Override
    public String toString() {
        return
                "a=" + a +
                        ", b=" + b +
                        ", c=" + c
                ;
    }
}
