package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        char[] array = name.toCharArray();
        if (isLowerLatinLetter(array[0])) {
            for (int i = 1; i < array.length; i++) {
                if (!isSpecialSymbol(array[i]) && !isLowerLatinLetter(array[i]) && !isUpperLatinLetter(array[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95 || Character.isDigit(code);
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}