package com.ms.designPatterns.behavioral.mediator.onlineAuction;

public class Client {

    public static void main(String[] args){

        AuctionMediator auctionMediator=new Mediator();

        Bidder bidder1=new Bidder("Madhu", auctionMediator);
        Bidder bidder2=new Bidder("Swastika", auctionMediator);

        bidder1.placeBid(1000);
        bidder2.placeBid(2000);

    }
}
