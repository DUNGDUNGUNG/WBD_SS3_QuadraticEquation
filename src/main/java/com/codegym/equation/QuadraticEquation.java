package com.codegym.equation;

public class QuadraticEquation {
    private double a,b,c;

    QuadraticEquation() {
    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }

    void setA(double a) {
        this.a = a;
    }

    double getB() {
        return b;
    }

    void setB(double b) {
        this.b = b;
    }

    double getC() {
        return c;
    }

    void setC(double c) {
        this.c = c;
    }

    private double delta;

    double getDiscriminant(){
        delta = (Math.pow(b, 2)) - (4 * a * c);
        return delta;
    }

    double getRoot1(){
        return (-b + (Math.sqrt(delta)) / (2 * a));
    }

    double getRoot2(){
        return (-b - (Math.sqrt(delta)) / (2 * a));
    }
}
