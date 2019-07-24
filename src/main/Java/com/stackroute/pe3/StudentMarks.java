//        Create a class called StudentMarks, which prompts user for the number of students, reads
//        it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user
//        for the grades of each of the students and saves them in an int array called stuGrades. Your
//        program shall check that the grade is between 0 and 100 else has to trow an error message.

package com.stackroute.pe3;

public class StudentMarks {

        String result="";
        public String validateGrades(int num, int[] array){

            for(int i = 0; i<=array.length-1;i++){

                if(array[i]<0 || array[i]>100){
                    result="Grades are not between 0 and 100";
                }else{
                    result="Grades are between 0 and 100";
                }
            }

            return result;
        }
    }
