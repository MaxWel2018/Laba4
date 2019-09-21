package Utility;

public final class MyData {
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) { //TODO Как сделать правильную проверку даты
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyData getData() {
        return this;
    }
    @Override
    public String toString() {
        return "[" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ']';
    }
}
