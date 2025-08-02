package com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver.obserable;

import com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver.observer.NotificationObserver;

public interface StockObserable {

    void add(NotificationObserver no);
    void remove(NotificationObserver no);
    void notifyObserver();
    void setStock(int n);

}
