package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int lines = 0; lines < height; lines++) {
            for (int rows = 0; rows < width; rows++) {
                if ((lines + rows) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(5, 5);
    }
}