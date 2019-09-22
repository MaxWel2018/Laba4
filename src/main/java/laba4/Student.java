package laba4;

import Utility.MyData;

public class Student extends Person {
    private static int staticId = 0;
    private int id;
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
        staticId++;
        this.id = staticId;
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
        private MyData birthday = BIRTHDAY_DEFAULT;
        private Address address = ADDRESS_DEFAULT;

        private Builder() {
            // private constructor
        }

        Builder withName(String name) {
            if (name != null)
                this.name = name;
            else
                this.name = "";

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
                this.faculty = "";
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
                this.group = "";
            return this;
        }

        Builder withSurName(String surName) {
            if (surName != null)
                this.surName = surName;
            else
                this.surName = "";
            return this;
        }

        Builder withPatronymic(String patronymic) {
            if (surName != null)
                this.patronymic = patronymic;
            else
                this.patronymic = "";

            return this;
        }

        Builder withBirthday(MyData birthday) {
            if (birthday != null)
                this.birthday = new MyData(birthday.getYear(), birthday.getMonth(), birthday.getDay());
            else
                this.birthday = BIRTHDAY_DEFAULT;
            return this;
        }

        Builder withAddress(Address address) {
            if (address != null)
                this.address = address;
            else
                this.address = ADDRESS_DEFAULT;
            return this;
        }

        Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {

        String info = "Name='" + name + '\'' +
                "id=" + id +' '+
                ", Sur name='" + surName + '\'' +
                ", Patronymic='" + patronymic + '\'' +
                ", Phone=" + phone +
                ", Faculty='" + faculty + '\'' +
                ", Course=" + course +
                ", Group='" + group + '\'' +
                ", Address=" + address +
                ", Birthday=" + birthday;

        String shortInfo = "Name='" + name + '\'' +
                "id=" + id +
                ", Sur name='" + surName + '\'' +
                ", Phone=" + phone +
                ", Faculty='" + faculty + '\'' +
                ", Course=" + course +
                ", Group='" + group + '\'';

        return shortInfo;

    }

    public static int getStaticId() {
        return staticId;
    }

    public int getId() {
        return id;
    }

    public int getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }
}
