//Write a java program to calculate first and last date of a week.
//        Output:
//        First Date of Week: Mon 24/07/2017
//        Last date of the week: Sun 30/07/2017
package com.stackroute.pe3;

import java.util.*;
import java.time.*;
import java.text.*;

public class FirstAndLastDayOfWeek {

    public boolean startDate() {
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        String s1 = df.format(c.getTime());
        if (s1.equals("Mon 18/07/2019"))
            return true;
        else
            return false;

    }

    public boolean endDate() {
        Calendar c = Calendar.getInstance();
        String s2 = "";
// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
            //  System.out.println( c.add(Calendar.DATE,1));
        }
        s2 = (df.format(c.getTime()));
        if (s2.equals("Sun 24/07/2019"))
            return true;
        else
            return false;

    }
}