package com.ms.designPatterns.behavioral.mediator.onlineAuction;

public class Bidder implements Colleague{

    double bidAmount;
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(double bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNotification(double bidAmount) {
        this.bidAmount=bidAmount;
        System.out.println(this.name +" Received bid of : "+bidAmount);
    }
}
