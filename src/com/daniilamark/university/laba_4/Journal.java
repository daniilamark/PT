package com.daniilamark.university.laba_4;

public class Journal {
    private String name;
    private String periodicity;
    private int priceOfOne;
    private int subscriptionCost;
    private int numberOfCopiesReleased;

    public Journal(String name, String periodicity, int priceOfOne, int subscriptionCost, int numberOfCopiesReleased) {
        this.name = name;
        this.periodicity = periodicity;
        this.priceOfOne = priceOfOne;
        this.subscriptionCost = subscriptionCost;
        this.numberOfCopiesReleased = numberOfCopiesReleased;
    }

    public Journal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        if (periodicity != null){
            this.periodicity = periodicity;
        }
    }

    public int getPriceOfOne() {
        priceOfOne = getNumberOfCopiesReleased() / getSubscriptionCost();
        return priceOfOne;
    }

    public void setPriceOfOne(int priceOfOne) {
        if (priceOfOne > 0){
            this.priceOfOne = priceOfOne;
        }
    }

    public int getSubscriptionCost() {
        return subscriptionCost;
    }

    public void setSubscriptionCost(int subscriptionCost) {
        if (subscriptionCost > 0){
            this.subscriptionCost = subscriptionCost;
        }
    }

    public int getNumberOfCopiesReleased() {
        return numberOfCopiesReleased;
    }

    public void setNumberOfCopiesReleased(int numberOfCopiesReleased) {
        if (numberOfCopiesReleased > 0){
            this.numberOfCopiesReleased = numberOfCopiesReleased;
        }
    }

    void displayInfo(){
        System.out.print("Name: " + name + "\nPeriodicity: " + periodicity+ "\npriceOfOne: " + priceOfOne +
                "\nsubscriptionCost: " + subscriptionCost + "\nnumberOfCopiesReleased: " + numberOfCopiesReleased);
    }
}


class Program{
    public static void main(String[] args) {
        /*
        System.out.println("\n-------------------------------------");
        Journal journalCode = new Journal("code", "2 in 7", 150, 20, 10);
        journalCode.setPriceOfOne(-20);
        journalCode.displayInfo();
    */
        System.out.println("\n-------------------------------------");
        Journal journalGame = new Journal();
        journalGame.setName("game");
        journalGame.setPeriodicity("3 in 30");
        journalGame.setPriceOfOne(100);
        journalGame.setSubscriptionCost(30);
        journalGame.setNumberOfCopiesReleased(1200);
        journalGame.displayInfo();

        System.out.println("\n-------------------------------------");
        Journal journalMusic = new Journal();
        journalMusic.setName("music");
        journalMusic.setPeriodicity("1 in 30");
        journalMusic.setPriceOfOne(60);
        journalMusic.setSubscriptionCost(70);
        journalMusic.setNumberOfCopiesReleased(100);
        System.out.println("Name: " + journalMusic.getName() + "\nPeriodicity: " + journalMusic.getPeriodicity() + "\nPriceOfOne: " + journalMusic.getPriceOfOne() +
                "\nSubscriptionCost: " + journalMusic.getSubscriptionCost() + "\nNumberOfCopiesReleased: " + journalMusic.getNumberOfCopiesReleased());
        System.out.println("-------------------------------------");

    }
}
