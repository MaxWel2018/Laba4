package laba4;

 abstract class Person {
     String name;
     String surName;
     String patronymic;
     String birthday;
     Address address;

     Person(String name, String surName, String patronymic, String birthday, Address address) {
         this.surName = surName;
         this.patronymic = patronymic;
         this.birthday = birthday;
         this.address = address;
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public String getSurName() {
         return surName;
     }

     public String getPatronymic() {
         return patronymic;
     }

     public String getBirthday() {
         return birthday;
     }

     public Address getAddress() {
         return address;
     }

 }
