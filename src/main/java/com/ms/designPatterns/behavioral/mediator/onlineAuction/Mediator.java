package com.ms.designPatterns.behavioral.mediator.onlineAuction;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements AuctionMediator{

    List<Colleague> bidderList=new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        this.bidderList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, double bidAmount) {
        for(Colleague bidder1 : bidderList){
            if(!bidder.getName().equals(bidder1.getName())){
                bidder1.getNotification(bidAmount);
            }
        }
    }
}
