package org.chapter1.item1;

public class Date {

    private final int day;
    private final int month;
    private final int year;

    private Date(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static Date from(final int day, final int month, final int year) {
       return new Date(day, month, year);
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

}
