package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    // channel constants
    private final int minChannel = 3;
    private final int maxChannel = 18;
    // volume constants
    private final int minVolume = 0;
    private final int maxVolume = 10;

    public void turnOff(){
        this.isOn = false;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void changeChannel(int newChannel){


        // might need <=
        if(this.isOn() && newChannel >= this.minChannel && newChannel <= this.maxChannel){
            this.currentChannel = newChannel;
        }
    }

    public void channelUp(){
        if(this.isOn()){
            if(this.getCurrentChannel() == this.maxChannel){
                this.currentChannel = this.minChannel;
            }else{
                this.currentChannel++;
            }
        }
    }

    public void channelDown(){
        if(this.isOn()){
            if(this.getCurrentChannel() == this.minChannel){
                this.currentChannel = this.maxChannel;
            }else{
                this.currentChannel--;
            }
        }
    }

    public void raiseVolume(){
        if(this.isOn()){
            if(this.getCurrentVolume() == maxVolume){

            }else{
                this.currentVolume++;
            }
        }
    }
    public void lowerVolume(){
        if(this.isOn()){
            if(this.getCurrentVolume() == minVolume){

            }else{
                this.currentVolume--;
            }
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
