package com.daniilamark.university.lab_6;

import java.util.ArrayList;

public class SubscriptionArray {
    Subscription subscription_1 = new Subscription("standart", 190);
    Subscription subscription = new Subscription("VIP", 990);
    Subscription presentSubscription = new Subscription("present");
    Subscription freeSubscription = new Subscription("free");
    Subscription freeSubscription1 = new Subscription("free");

    ArrayList<Subscription> arrayListSub;

    SubscriptionArray() {
        arrayListSub = new ArrayList<Subscription>();

        arrayListSub.add(subscription_1);
        arrayListSub.add(subscription);
        arrayListSub.add(presentSubscription);
        arrayListSub.add(freeSubscription);
        arrayListSub.add(freeSubscription1);
    }
}
