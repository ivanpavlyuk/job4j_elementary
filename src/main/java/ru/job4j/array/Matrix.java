package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multTable = new int[size][size];
        for (int row = 0; row < multTable.length; row++) {
            for (int cell = 0; cell < multTable[row].length; cell++) {
                multTable[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return multTable;
    }
}
