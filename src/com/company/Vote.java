package com.company;
import ir.huri.jcal.JalaliCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Month;
public class Vote {
    public Person getPerson1() {
        return person1;
    }

    public String getDate() {
        return date;
    }

    private Person person1;

    LocalDate currentdate = LocalDate.now();
    //Getting the current day
    int currentDay = currentdate.getDayOfMonth();
    //getting the current year
    int currentYear = currentdate.getYear();

    JalaliCalendar jalaliDate = new JalaliCalendar(new GregorianCalendar(currentYear, Calendar.MONTH, currentDay));
    String date = String.valueOf(jalaliDate.getDay() +" "+ jalaliDate.getMonth()+ " " + jalaliDate.getYear());
    public Vote(Person person ){
       this.person1=person;
    }





}
