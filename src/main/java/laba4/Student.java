package laba4;

public class Student extends Person {
    private static int id = 0;
    private int phone;
    private String faculty;
    private int course;
    private String group;


    private Student(Builder builder) {
        super(builder.name, builder.surName, builder.patronymic, builder.birthday, builder.address);
        this.phone = builder.phone;
        this.faculty = builder.faculty;
        this.course = builder.course;
        this.group = builder.group;
        id++;
    }

    static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int phone;
        private String faculty = "";
        private String name = "";
        private int course;
        private String group = "";
        private String surName = "";
        private String patronymic = "";
        private String birthday = "";
        private Address address = new Address(0, "", "");

        private Builder() {
            // private constructor
        }

        Builder withName(String name) {
            if (name != null)
                this.name = name;
            else
                name = "";

            return this;
        }

        Builder withPhone(int phone) {
            this.phone = phone;
            return this;
        }

        Builder withFaculty(String faculty) {
            if (faculty != null)
                this.faculty = faculty;
            else
                faculty = "";
            return this;
        }

        Builder withCourse(int course) {
            this.course = course;
            return this;
        }

        Builder withGroup(String group) {
            if (group != null)
                this.group = group;
            else
                group = "";
            return this;
        }

        Builder withSurName(String surName) {
            if (surName != null)
                this.surName = surName;
            else
                surName = "";
            return this;
        }

        Builder withPatronymic(String patronymic) {
            if (surName != null)
                this.patronymic = patronymic;
            else
                patronymic = "";

            return this;
        }

        Builder withBirthday(String birthday) {
            if (birthday != null)
                this.birthday = birthday;
            else
                birthday = "";
            return this;
        }

        Builder withAddress(Address address) {
            if (address != null)
                this.address = address;
            else
                address = new Address(0, "", "");
            return this;
        }

        Student build() {
            return new Student(this);
        }


    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address=" + address +
                '}';
    }
}
