package com.day08;

public class MyDate {
    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    int year;
    int month;
    int day;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate){
            MyDate my = (MyDate)obj;
            if(this.year == my.year &&this.month == my.month&&this.day==my.day){
                return true;
            }

        }
        return false;
    }
}
