package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        AlgoArray.change2VariablesInArray(array, 0, 3);
        AlgoArray.change2VariablesInArray(array, 1, 2);
        AlgoArray.change2VariablesInArray(array, 3, 4);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void change2VariablesInArray(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}