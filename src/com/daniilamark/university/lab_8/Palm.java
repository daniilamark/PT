package com.daniilamark.university.lab_8;

public class Palm {
    private int countLife;
    private String name;

    Palm(String name, int countLife){
        this.name = name;
        this.countLife = countLife;
    }

    @Override public String toString() {
        return "Person: Name='" + name + "', Life=" + countLife;
    }
    public int getCountLife() {
        return countLife;
    }

    public void setCountLife(int countLife) {
        this.countLife = countLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
