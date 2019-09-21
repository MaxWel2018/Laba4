package Utility;

import laba4.Address;

public class MyRandom {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static MyData getRandomDate() {
        MyData data;
        data = new MyData(rnd(1990, 2010), rnd(1, 12), rnd(1, 31));
        return data;
    }

    public static Address getRandomAddress() {
        Address address;
        address = new Address(rnd(10000, 70000), getRandomString(), getRandomString());
        return address;
    }

    public static String getRandomString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= rnd(3, 10); i++) {
            stringBuilder.append((char) rnd(97, 122));
        }
        return stringBuilder.toString();
    }

    public static String getRandomGroupName() {
        String group1 = "Group1";
        String group2 = "Group2";
        String group3 = "Group3";
        String group4 = "Group4";

        int n = rnd(1, 4);
        switch (n) {
            case 1:
                return group1;
            case 2:
                return group2;
            case 3:
                return group3;
            case 4:
                return group4;
            default:
                return "";
        }

    }
    public static String getRandomFacultyName() {
        String faculty1 = "Gryffindor";
        String faculty2 = "Hufflepuff";
        String faculty3 = "Slytherin";
        int n = rnd(1,3);
        switch (n) {
            case 1:
                return faculty1;
            case 2:
                return faculty2;
            case 3:
                return faculty3;
            default:
                return "";
        }

    }
}
