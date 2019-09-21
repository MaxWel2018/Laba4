package laba4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        University university = University.getInstance();

        ArrayList students = university.getListStudent();
        university.filterByGroup(students,"Group_4_Gr");
        university.filterByGroup(students,"Group_1_Sl");

    }
}
