package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates;

import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Coin;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.Item;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.VendingMachine;

public class ProductSelectionState implements State{

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
        for(Item item :vendingMachine.getItems()){
            if(item.getItemCode().equals(itemCode) && item.isAvailable()==true){
              System.out.println("Item selected with code : "+ itemCode);
              vendingMachine.setState(new DispenseState());
              return item;
            }
        }
        System.out.println("Item not available with itemCode : "+itemCode);
        vendingMachine.setState(new IdealState());
        refundMoney(vendingMachine, null);
        return null;
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
