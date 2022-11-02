package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public String getLetterGrade(){
        // grade percent constants
        final double gradeA = .90;
        final double gradeB = .80;
        final double gradeC = .70;
        final double gradeD = .60;

        // percentage grade into letter grade
        double gradePercentage = this.earnedMarks / (double) this.possibleMarks;
        if(gradePercentage >= gradeA){
            return "A";
        }
        if(gradePercentage >= gradeB){
            return "B";
        }
        if(gradePercentage >= gradeC){
            return "C";
        }
        if(gradePercentage >= gradeD){
            return "D";
        }else{
            return "F";
        }
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }
}
