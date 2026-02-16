package com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.obserable;

import com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class MobileObserable implements StockObserable {

    List<NotificationObserver> mobileObserver=new ArrayList<>();
    int noOfItemsInStock=0;

    @Override
    public void add(NotificationObserver no) {
        mobileObserver.add( no );

    }

    @Override
    public void remove(NotificationObserver no) {
        mobileObserver.remove( no );

    }

    @Override
    public void notifyObserver() {
        for(NotificationObserver no:mobileObserver){
            no.update();
        }

    }

    @Override
    public void setStock(int n) {
        if(noOfItemsInStock==0){
            notifyObserver();
        }
        noOfItemsInStock=noOfItemsInStock+1;
    }
}
