package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
          System.out.println(ages.length);
        String[] surnames = new String[100500];
          System.out.println(surnames.length);
        float[] prices = new float[40];
          System.out.println(prices.length);
          String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Sidor Sidorov";
        names[3] = "John Petrucci";
          System.out.println(names[0]);
          System.out.println(names[1]);
          System.out.println(names[2]);
          System.out.println(names[3]);

    }
}
