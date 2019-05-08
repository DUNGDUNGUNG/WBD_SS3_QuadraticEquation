package com.codegym.equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quadratic equation: ax2 + bx + x = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        double delta = quadraticEquation.getDiscriminant();
        if (delta>0){
            System.out.println("equation 2 solutions : ");
            System.out.print("x1: " + quadraticEquation.getRoot1() + ", x2: " + quadraticEquation.getRoot2());
        }else if (delta==0){
            System.out.println("equation 1 solutions : ");
            System.out.print("x1 = x2 : " + quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }

        QuadraticEquation quadraticEquation1 = new QuadraticEquation();
        quadraticEquation1.setA(5);
        quadraticEquation1.setB(5);
        quadraticEquation1.setC(5);
        System.out.println("\n ");
        System.out.println("a: " + quadraticEquation1.getA());
        System.out.println("b: " + quadraticEquation1.getB());
        System.out.println("c: " + quadraticEquation1.getC());
    }
}
