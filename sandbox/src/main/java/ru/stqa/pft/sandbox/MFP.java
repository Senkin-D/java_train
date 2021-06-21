package ru.stqa.pft.sandbox;

public class MFP {
    public static void main(String[] args) {
// Для наглядного сравнения сделаю два класса - Point и Points
// Сперва - реализация подзаданий 2 и 3. Через класс Point.
        Point p1 = new Point(1, 6);
        Point p2 = new Point(1, -3);
        System.out.println("1. Расстояние между точкой (" + p1.x + ";" + p1.y + ")" + " и точкой (" + p2.x + ";" + p2.y + ") равно " + distance(p1, p2));
// Теперь - реализация подзадания 4. Через класс Points.
        Points p = new Points(1, 6, 1, -2);
        System.out.println("2. Расстояние между точкой (" + p.x1 + ";" + p.y1 + ")" + " и точкой (" + p.x2 + ";" + p.y2 + ") равно " + p.distance());
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}