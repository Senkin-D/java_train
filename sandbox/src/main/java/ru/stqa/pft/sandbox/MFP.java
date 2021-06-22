package ru.stqa.pft.sandbox;

public class MFP {
    public static void main(String[] args) {
        Point p1 = new Point(1, 6);
        Point p2 = new Point(1, -2);
        System.out.println("Расстояние между точкой (" + p1.x + ";" + p1.y + ")" + " и точкой (" + p2.x + ";" + p2.y + ") равно " + p1.distance(p2));
    }
}