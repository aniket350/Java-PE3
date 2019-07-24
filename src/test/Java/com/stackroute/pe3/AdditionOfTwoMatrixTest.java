package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfTwoMatrixTest {


    AdditionOfTwoMatrix addmtrx;

    @Before
    public void setUp() throws Exception {
        this.addmtrx= new AdditionOfTwoMatrix();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenMatrixAsInputAndShouldReturnAddedMatrix() {

        //act

        int noOfRows = 2;
        int noOfColumns = 3;
        int matrix1[][] = {{1,2,3},{4,5,6}};
        int matrix2[][] = {{9,8,7},{6,5,4}};

            int actualresult[][] =  this.addmtrx.sumOfMatrices(noOfRows,noOfColumns,matrix1,matrix2);

            //assert

            assertEquals("{{10,10,10},{10,10,10}}", actualresult);
        }
}
