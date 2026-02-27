package com.ms.designPatterns.behavioral.mediator.onlineAuction;

import java.util.ArrayList;
import java.util.List;

public interface AuctionMediator {

    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, double bidAmount);
}
