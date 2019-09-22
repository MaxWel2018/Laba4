package Utility;

import laba4.Address;

public final class  MyRandom {

    private MyRandom() {
    }

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
        for (int i = 0; i <= rnd(3, 10); i++) { // длинна строки
            if (i == 0) {
                stringBuilder.append((char) rnd(65, 90));
                continue;
            }
            stringBuilder.append((char) rnd(97, 122)); // буквы от а  до я
        }
        return stringBuilder.toString();
    }



    public static String getRandomFacultyName() {
        String faculty1 = "Gryffindor";
        String faculty2 = "Hufflepuff";
        String faculty3 = "Slytherin";
        int n = rnd(1, 3);
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
