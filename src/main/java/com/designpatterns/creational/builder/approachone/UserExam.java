package com.designpatterns.creational.builder.approachone;

import java.security.InvalidParameterException;

public class UserExam {
    private String name;
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;

    public UserExam(UserExamParameters userExamParameters){
        if (userExamParameters.englishMarks > 100 || userExamParameters.scienceMarks > 100 ||
                userExamParameters.mathsMarks > 100) {
            throw new InvalidParameterException("Marks can't be greater than 100");
        }

        if (userExamParameters.mathsMarks + userExamParameters.englishMarks > 150) {
            throw new InvalidParameterException("Maths + English can't be greater than 150");
        }

        if (userExamParameters.name.startsWith("0")) {
            throw new InvalidParameterException("Name can't start with 0");
        }

        this.name = userExamParameters.name;
        this.englishMarks = userExamParameters.englishMarks;
        this.mathsMarks = userExamParameters.mathsMarks;
        this.scienceMarks = userExamParameters.scienceMarks;
    }

    public String getName() {
        return name;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    @Override
    public String toString() {
        return "UserExam{" +
                "name='" + name + '\'' +
                ", englishMarks=" + englishMarks +
                ", mathsMarks=" + mathsMarks +
                ", scienceMarks=" + scienceMarks +
                '}';
    }
}
