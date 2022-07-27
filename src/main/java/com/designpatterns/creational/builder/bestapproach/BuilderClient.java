package com.designpatterns.creational.builder.bestapproach;

public class BuilderClient {

    public static void main(String args[]){

        UserExam userExam = UserExam.getBuilder()
                .setName("Sachin")
                .setEnglishMarks(50)
                .setMathsMarks(60)
                .setScienceMarks(70)
                .build();

        System.out.println("User Exam object Succesfully Craeted using Builder Pattern." +
                "User Details = "+userExam.toString());
    }
}
