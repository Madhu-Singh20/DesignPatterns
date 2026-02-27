package com.ms.designPatterns.behavioral.mediator.onlineAuction;

public interface Colleague {

    void placeBid(double bidAmount);
    void getNotification(double bidAmount);
    String getName();

}
