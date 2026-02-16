package com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.observer;

public class EmailNotificationObserver implements NotificationObserver {

    public String email;

    public EmailNotificationObserver(String email) {
    }

    @Override
    public void update() {
        System.out.println("Email sent to "+email);
    }
}
