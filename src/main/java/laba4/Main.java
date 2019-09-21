package laba4;

import Utility.MyRandom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        University university = University.getInstance();

        ArrayList students = university.getListStudent();
        university.filterAfterGivenYear(students,2000);

//        university.filterFaculty(students,"Gryffindor");


    }
}
