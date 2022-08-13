package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(5, 3, 4, 7);
        System.out.println("result (5, 3) to (4, 7) " + result);

        result = Point.distance(24, 45, 12, 23);
        System.out.println("result (24, 45) to (12, 23) " + result);

    }
}