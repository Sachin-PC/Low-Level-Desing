package com.designpatterns.creational.builder.approachone;

public class UserExamParameters {

    public String name;
    public int englishMarks;
    public int mathsMarks;
    public int scienceMarks;

    public void setName(String name) {
        this.name = name;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }
}
