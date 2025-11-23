package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates;

import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Coin;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Item;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.VendingMachine;

public class InsertMoneyState implements State{

    @Override
    public void start(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Vending machine already started");
    }

    @Override
    public void addCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
       vendingMachine.getCoins().add(coin);
       System.out.println("Coin added of value : "+coin.getValue());
    }

    @Override
    public void startItemSelection(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setState(new ProductSelectionState());
    }


    @Override
    public Item selectItem(VendingMachine vendingMachine, String itemCode) throws Exception {
        throw new Exception("Coins can't get added now.");
    }

    @Override
    public void cancel(VendingMachine vendingMachine) {
        refundMoney(vendingMachine, null);
    }

    @Override
    public void pickItem(VendingMachine vendingMachine, Item item) throws Exception {
        throw new Exception("Coins can't get added now.");
    }

    @Override
    public void refundMoney(VendingMachine vendingMachine, Item item) {
        System.out.println("Refund value : "+ vendingMachine.getCoins().stream().mapToLong(Coin::getValue).sum());
    }
}
