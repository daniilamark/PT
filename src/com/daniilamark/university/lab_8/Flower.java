package com.daniilamark.university.lab_8;

public class Flower {

    private int color;
    private String name;

    Flower(String name, int color){
        this.name = name;
        this.color = color;
    }



    @Override public String toString() {
        return "Person: Name='" + name + "', Color=" + color;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
