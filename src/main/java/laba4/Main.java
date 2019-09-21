package laba4;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder().withName("max").withSurName("krugovykh").withBirthday(null).build();
        System.out.println(student);
    }
}
