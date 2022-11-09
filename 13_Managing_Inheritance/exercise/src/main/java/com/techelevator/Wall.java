package com.techelevator;

public abstract class Wall {
    private String name;
    private String color;

    public Wall(String name, String color){
        this.name = name;
        this.color = color;
    }

    public abstract int getArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
