package laba4;

 class Address {
    private int index;
    private String city;
    private String street;

     Address(int index, String city, String street) {
        this.index = index;
        this.city = city;
        this.street = street;
    }

     @Override
     public String toString() {
         return "[" +
                 "index=" + index +
                 ", city='" + city + '\'' +
                 ", street='" + street + '\'' +
                 ']';
     }
 }
