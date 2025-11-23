package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine;

import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates.State;

public class Main {

    public static void main(String[] args){
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.initialize();

        State state= vendingMachine.getState();
        try {
            vendingMachine.getState().start(vendingMachine);
            vendingMachine.getState().addCoin(vendingMachine, new Coin(50));
            vendingMachine.getState().startItemSelection(vendingMachine);
            Item item=vendingMachine.getState().selectItem(vendingMachine,"101");
            vendingMachine.getState().pickItem(vendingMachine,item);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
