package com.designpatterns.creational.builder.approachone;

import java.security.InvalidParameterException;

public class BuilderClient {

    public static void main(String args[]) {
        UserExamParameters userExamParameters = new UserExamParameters();
        userExamParameters.setName("Sachin");
        userExamParameters.setEnglishMarks(50);
        userExamParameters.setMathsMarks(60);
        userExamParameters.setScienceMarks(70);

        try {
            UserExam userExam = new UserExam(userExamParameters);
            System.out.println("User Exam object Succesfully Craeted using Builder Pattern." +
                    "User Details = "+userExam.toString());
        } catch (InvalidParameterException e){
            throw e;
        }

    }
}
