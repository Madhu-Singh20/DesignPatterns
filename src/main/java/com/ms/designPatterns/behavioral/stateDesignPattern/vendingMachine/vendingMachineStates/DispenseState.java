package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates;

import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Coin;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Item;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.VendingMachine;

public class DispenseState implements State{

    @Override
    public void start(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Vending machine already started");
    }

    @Override
    public void addCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Can't add money now");
    }

    @Override
    public void startItemSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Not allowed at this stage");
    }

    @Override
    public Item selectItem(VendingMachine vendingMachine, String itemCode) throws Exception {
        throw new Exception("Item selection not allowed at this stage.");
    }

    @Override
    public void cancel(VendingMachine vendingMachine) {
        refundMoney(vendingMachine, null);
    }

    @Override
    public void pickItem(VendingMachine vendingMachine, Item item) throws Exception {
        item.setAvailable(false);
        vendingMachine.setState(new IdealState());
        refundMoney(vendingMachine, item);
    }

    @Override
    public void refundMoney(VendingMachine vendingMachine, Item item) {
        long totalCoinsEntered= vendingMachine.getCoins().stream().mapToLong(Coin::getValue).sum();
        long refund=0;
        if(item!=null){
            refund=totalCoinsEntered-item.getProduct().getPrice();
        }
        System.out.println("Refund value : "+ refund);
    }


}
