package com.daniilamark.university.laba_5;

public class SubscriptionService implements ISubscription{
    Subscription subscription = new Subscription("standart", 190);
    Subscription presentSubscription = new Subscription("present");
    Subscription freeSubscription = new Subscription("free");

    Subscription[] subscriptions = {subscription, presentSubscription, freeSubscription};

    int countSubscriptions = 0;

    public static void main(String[] args) {
        SubscriptionService service = new SubscriptionService();
        service.printInfo();
        System.out.println("========");
        service.searchByName(service.subscriptions, "free");
        System.out.println("all count: " + service.subscriptions.length);
        System.out.println("count free: " + service.countSubscriptions);
    }

    @Override
    public void printInfo() {
        for (Subscription sub : subscriptions){
            if (sub.getPrice() <= 0){
                System.out.println("Name: " + sub.getName());
            }else{
                System.out.println("Name: " + sub.getName());
                System.out.println("Price: " + sub.getPrice());
            }
            System.out.println("-------------------------");
        }
    }

    public void searchByName(Subscription[] subscriptionsArray, String nameSubscription){
        for (Subscription sub : subscriptionsArray){
            if (nameSubscription == sub.getName()){
                sub.printInfo();
                countSubscriptions ++;
            }
        }
    }
}
