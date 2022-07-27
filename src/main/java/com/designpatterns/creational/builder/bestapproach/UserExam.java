package com.designpatterns.creational.builder.bestapproach;

import java.security.InvalidParameterException;

public class UserExam {

    private String name;
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;

    private UserExam(){

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

    public static UserExamBuilder getBuilder(){
        return new UserExamBuilder();
    }
    public static class UserExamBuilder {
        private String name;
        private int englishMarks;
        private int mathsMarks;
        private int scienceMarks;

        private UserExamBuilder(){

        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExam build(){
            validateParameters(this);
            UserExam userExam = new UserExam();
            userExam.name = this.name;
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.englishMarks = this.englishMarks;
            return userExam;
        }

        public void validateParameters(UserExamBuilder userExamBuilder){
            if (userExamBuilder.englishMarks > 100 || userExamBuilder.scienceMarks > 100 ||
                    userExamBuilder.mathsMarks > 100) {
                throw new InvalidParameterException("Marks can't be greater than 100");
            }

            if (userExamBuilder.mathsMarks + userExamBuilder.englishMarks > 150) {
                throw new InvalidParameterException("Maths + English can't be greater than 150");
            }

            if (userExamBuilder.name.startsWith("0")) {
                throw new InvalidParameterException("Name can't start with 0");
            }

        }
    }

}
