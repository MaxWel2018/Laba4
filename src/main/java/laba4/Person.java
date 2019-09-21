package laba4;

import Utility.MyData;

abstract class Person {
    static final Address ADDRESS_DEFAULT = new Address(0, "", "");
   protected   String name;
    protected String surName;
    protected String patronymic;
    protected  MyData birthday;
    protected  Address address;

     Person(String name, String surName, String patronymic, MyData birthday, Address address) {
         this.surName = surName;
         this.patronymic = patronymic;
         this.birthday = new MyData(birthday.getYear(),birthday.getMonth(),birthday.getDay());
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

     public MyData getBirthday() {
         return birthday;
     }

     public Address getAddress() {
         return address;
     }

 }
