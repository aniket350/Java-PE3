//Create a class with a main( ) that throws an object of class Exception inside a try block.
//        a. Give the constructor for Exception a String argument.
//        b. Catch the exception inside a catch clause and print the String argument.
//        c. Add a finally clause and print a message to prove you were there.


package com.stackroute.pe3;

public class UserException extends Exception {

    public String toString() {
        return "this is my exception";
    }
}