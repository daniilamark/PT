package com.daniilamark.university.lab_6;

public class SubscriptionService implements ISearch {

    SubscriptionArray subscriptionArray = new SubscriptionArray();

    Subscription[] array = subscriptionArray.subscriptions;

    int allCountSubscriptions = array.length;
    int countSubscriptions;
    String res = null;

    @Override
    public void searchByName(String nameSubscription){

        countSubscriptions = 0;
        res = null;
        for (Subscription sub : array){
            //System.out.println(sub.getName());
            if (sub.getName() == nameSubscription){
                countSubscriptions ++;
                System.out.println(sub.getName());
                res = sub.getName();
            }
        }


        /*
        if(countSubscriptions == 0){
            res = "Такой подписки нет";
        }else{
            res = String.valueOf(countSubscriptions);
        }

         */
    }
}
