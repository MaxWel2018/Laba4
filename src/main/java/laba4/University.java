package laba4;

import java.util.ArrayList;

import static Utility.MyRandom.*;

public class University {
    private final ArrayList<Student> students = new ArrayList<>();
    public static University instance = new University();

    private University() {
    }

    public static synchronized University getInstance() {
        if (instance == null) instance = new University();
        return instance;
    }
    public static final int NUMBER_OF_STUDENTS = 50;

    {

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {

        int course = rnd(1, 6);
        String faculty = getRandomFacultyName();
        String group = getRandomGroupName() +"_" +course +"_"+ faculty.charAt(0) + faculty.charAt(1);
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

    ArrayList getListStudent() {
        return students;
    }
}
