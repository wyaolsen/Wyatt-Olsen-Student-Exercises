package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen = false;

    public Elevator(int numberOfLevers){
        this.numberOfFloors = numberOfLevers;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void openDoor(){
        this.doorOpen = true;
    }

    public void closeDoor(){
        this.doorOpen = false;
    }

    public void goUp(int desiredFloor){
        if(!(isDoorOpen()) && isFloorReal(desiredFloor) && desiredFloor > this.currentFloor){
            this.currentFloor = desiredFloor;
        }
    }

    public void goDown(int desiredFloor){
        if(!(isDoorOpen()) && isFloorReal(desiredFloor) && desiredFloor < this.currentFloor){
            this.currentFloor = desiredFloor;
        }
    }

    private boolean isFloorReal(int desiredFloor){
        if(desiredFloor >= 1 && desiredFloor <= this.numberOfFloors){
            return true;
        }else{
            return false;
        }
    }
}
