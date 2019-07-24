package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks stdntmrks;
    @Before
    public void setUp() throws Exception {
        this.stdntmrks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenInputNumberAndShouldValidateGrades() {

        //act

        int noOfStudents= 4;
        int[] stuGrades = {10,50,110,90};
        String actualresult =  stdntmrks.validateGrades(noOfStudents,stuGrades);

        //assert

        assertEquals("Grades are not between 0 and 100", actualresult);
    }
}