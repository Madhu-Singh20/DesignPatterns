package com.ms.designPatterns.Observer;

public class MessageNotificationObserver implements NotificationObserver{

    public String phoneNumber;

    public MessageNotificationObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Message sent to "+phoneNumber);
    }
}
