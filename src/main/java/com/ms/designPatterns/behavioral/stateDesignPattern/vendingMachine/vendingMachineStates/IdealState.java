package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates;

import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Coin;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Item;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.VendingMachine;

public class IdealState implements State{

    @Override
    public void start(VendingMachine vendingMachine) {
        vendingMachine.setState(new InsertMoneyState());
    }

    @Override
    public void addCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Coins can't get added now.");
    }

    @Override
    public void startItemSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Not allowed at this stage");
    }

    @Override
    public Item selectItem(VendingMachine vendingMachine, String itemCode) throws Exception {
        throw new Exception("Coins can't get added now.");
    }

    @Override
    public void cancel(VendingMachine vendingMachine) {
           vendingMachine.setState(new IdealState());
    }

    @Override
    public void pickItem(VendingMachine vendingMachine, Item item) throws Exception {
        throw new Exception("Coins can't get added now.");
    }

    @Override
    public void refundMoney(VendingMachine vendingMachine, Item item) throws Exception {
        System.out.println("Refund value : "+ vendingMachine.getCoins().stream().mapToLong(Coin::getValue).sum());
    }
}
