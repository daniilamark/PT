package com.daniilamark.university.laba_5;

public class Subscription implements IPrint {
    String name;
    int price;

    Subscription(String name, int price){
        this.name = name;
        this.price = price;
    }

    Subscription(String name){
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name + " price: " + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
