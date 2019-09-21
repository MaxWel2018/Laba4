package laba4;

import java.util.ArrayList;

import static Utility.MyRandom.*;

public class University {
    private static final int NUMBER_OF_STUDENTS = 100;
    private final ArrayList<Student> students = new ArrayList<>();
    public static University instance = new University();

    private University() {
    }

    public static synchronized University getInstance() {
        if (instance == null) instance = new University();
        return instance;
    }

    {
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {

            int course = rnd(1, 4);
            String faculty = getRandomFacultyName();
            String group ="Group" +"_" + course + "_" + faculty.charAt(0) + faculty.charAt(1);
            students.add(Student.builder()
                    .withSurName(getRandomString())
                    .withName(getRandomString())
                    .withPhone(rnd(100000000, 999999999))
                    .withPatronymic(getRandomString())
                    .withBirthday(getRandomDate())
                    .withAddress(getRandomAddress())
                    .withCourse(course)
                    .withFaculty(faculty)
                    .withGroup(group)
                    .build()
            );
        }
    }

    void filterByFaculty(ArrayList<Student> students, String nameFaculty) {
        if (students != null && nameFaculty != null) {
            students.stream().filter(x -> x.getFaculty().equals(nameFaculty)).forEach(System.out::println);
        }
    }
    void filterByGroup(ArrayList<Student> students, String nameGroup) {
        if (students != null && nameGroup != null) {
            students.stream().filter(x -> x.getGroup().equals(nameGroup)).forEach(System.out::println);
        }
    }
    void filterByAfterGivenYear(ArrayList<Student> students, int year) {
        if (students != null && year >=0) {
            students.stream().filter(x -> x.getBirthday().getYear()>=year).forEach(System.out::println);
        }
    }

    void filterByFacultyAndCourse(ArrayList<Student> students) {
        if (students != null) {
            System.out.println("\n=================== Gryffindor =============================");
            students.stream().filter(x -> x.getFaculty().equals("Gryffindor")).forEach(System.out::println);
            System.out.println("\n=================== Hufflepuff =============================");
            students.stream().filter(x -> x.getFaculty().equals("Hufflepuff")).forEach(System.out::println);
            System.out.println("\n=================== Slytherin =============================");
            students.stream().filter(x -> x.getFaculty().equals("Slytherin")).forEach(System.out::println);
            System.out.println();
            System.out.println("\n=================== 1 Courses =============================");
            students.stream().filter(x -> x.getCourse() == 1).forEach(System.out::println);
            System.out.println("\n=================== 2 Courses =============================");
            students.stream().filter(x -> x.getCourse() == 2).forEach(System.out::println);
            System.out.println("\n=================== 3 Courses =============================");
            students.stream().filter(x -> x.getCourse() == 3).forEach(System.out::println);
            System.out.println("\n=================== 4 Courses =============================");
            students.stream().filter(x -> x.getCourse() == 4).forEach(System.out::println);
        }
    }

    ArrayList getListStudent() {
        return students;
    }
}
