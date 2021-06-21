package ru.stqa.pft.sandbox;

import com.sun.org.apache.xpath.internal.objects.XString;

public class MFP {

    public static void main(String[] args) {
        hello("world");
        double l = 5;
        System.out.println("площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("площадь прям-ка со сторонами " + a + " и " + b + " = " + area(a,b));


    }


    public static void hello(String smbd) {
        System.out.println("Hello " + smbd + "!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}