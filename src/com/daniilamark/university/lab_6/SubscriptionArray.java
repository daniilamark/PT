package com.daniilamark.university.lab_6;

public class SubscriptionArray {
    Subscription subscription = new Subscription("standart", 190);
    Subscription presentSubscription = new Subscription("present");
    Subscription freeSubscription = new Subscription("free");
    Subscription freeSubscription1 = new Subscription("free");

    Subscription[] subscriptions = {subscription,
                                    presentSubscription,
                                    freeSubscription,
                                    freeSubscription1};

}
