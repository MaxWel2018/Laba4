package laba4;

import Utility.MyRandom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        University university = University.getInstance();

        ArrayList students = university.getListStudent();

        for (Object student : students) {
            System.out.println(student);

        }

    }
}
