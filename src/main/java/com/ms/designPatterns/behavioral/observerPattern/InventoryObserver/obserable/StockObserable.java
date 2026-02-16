package com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.obserable;

import com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.observer.NotificationObserver;

public interface StockObserable {

    void add(NotificationObserver no);
    void remove(NotificationObserver no);
    void notifyObserver();
    void setStock(int n);

}
