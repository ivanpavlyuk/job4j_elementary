package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 :
                name = "�����������";
                return name;
            case 2 :
                name = "�������";
                return name;
            case 3 :
                name = "�����";
                return name;
            case 4 :
                name = "�������";
                return name;
            case 5 :
                name = "�������";
                return name;
            case 6 :
                name = "�������";
                return name;
            case 7 :
                name = "�����������";
                return name;
            default :
                name = "������";
                return name;
        }
    }
}