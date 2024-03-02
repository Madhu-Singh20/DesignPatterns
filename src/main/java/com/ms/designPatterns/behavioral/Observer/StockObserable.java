package com.ms.designPatterns.behavioral.Observer;

public interface StockObserable {

    void add(NotificationObserver no);
    void remove(NotificationObserver no);
    void notifyObserver();
    void setStock(int n);

}
