package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates;

import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Coin;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Item;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.VendingMachine;

public interface State {

    void start(VendingMachine vendingMachine) throws Exception;
    void addCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    void startItemSelection(VendingMachine vendingMachine) throws Exception;
    Item selectItem(VendingMachine vendingMachine, String itemCode) throws Exception;
    void cancel(VendingMachine vendingMachine);
    void pickItem(VendingMachine vendingMachine, Item item) throws Exception;
    void refundMoney(VendingMachine vendingMachine, Item item) throws Exception;;


}
