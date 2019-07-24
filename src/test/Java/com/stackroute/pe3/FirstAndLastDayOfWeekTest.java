package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {

    FirstAndLastDayOfWeek fstndlstday;
    @Before
    public void setUp() throws Exception {
        this.fstndlstday = new FirstAndLastDayOfWeek();
    }

    @After
    public void tearDown() throws Exception {
    }
//    @Test
//    public String givenWeekAsInputShouldReturnFirstAndLastDayOfWeek(){
//
//        //act
//        boolean actualResult = this.fstndlstday.startDate();
//
//        //assert
//
//        assertEquals("");
//    }
//
//    @Test
//    public String givenWeekAsInputShouldReturnFirstAndLastDayOfWeek(){
//
//        //act
//        boolean actualResult = this.fstndlstday.endDate();
//    }
}