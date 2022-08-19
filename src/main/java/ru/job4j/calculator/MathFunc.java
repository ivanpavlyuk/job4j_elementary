package ru.job4j.calculator;

public class MathFunc {

    public static int xSquarePlus1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int divide1ByX(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.xSquarePlus1(3);
        int result2 = MathFunc.divide1ByX(5);
        int result3 = MathFunc.xSquarePlus1(100);
        int total = result1 + result2;
        System.out.println(total);
    }
}