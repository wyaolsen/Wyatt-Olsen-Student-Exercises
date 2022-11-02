package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats = 0;
    private int totalCoachSeats;
    private int bookedCoachSeats = 0;



    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        if(forFirstClass){
            if(totalFirstClassSeats >= (bookedFirstClassSeats + totalNumberOfSeats)){
                this.bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            }else{
                return false;
            }
        }else {
            if (totalCoachSeats >= (bookedCoachSeats + totalNumberOfSeats)) {
                this.bookedCoachSeats += totalNumberOfSeats;
                return true;
            }else{
                return false;
            }
        }
    }

    public String getPlaneNumber() {
        return this.planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return this.totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return this.bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return this.totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return this.bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats(){

        return this.totalFirstClassSeats - this.bookedFirstClassSeats;
    }

    public int getAvailableCoachSeats(){
        return this.totalCoachSeats - this.bookedCoachSeats;
    }


}
