package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine;

import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates.IdealState;
import com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine.vendingMachineStates.State;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {

    private State state;
    private List<Coin> coins;
    private List<Item> items;

    public void initialize(){
        state=new IdealState();
        coins=new ArrayList<>();

        initializeItems();
    }

    public void initializeItems(){
        Product pepsi = new Product("Pepsi", 20);
        Product cocacola = new Product("Cocacola", 30);
        Product lays = new Product("Lays", 10);
        Product puffcorn = new Product("Puffcorn", 25);
        Product popcorn = new Product("Popcorn", 20);

        items=new ArrayList<>();
        items.add(new Item(pepsi, "100", true));
        items.add(new Item(pepsi, "101", true));
        items.add(new Item(pepsi, "102", true));
        items.add(new Item(pepsi, "103", true));
        items.add(new Item(pepsi, "104", true));
        items.add(new Item(pepsi, "105", true));
        items.add(new Item(pepsi, "106", true));
        items.add(new Item(pepsi, "107", true));
        items.add(new Item(pepsi, "108", true));
        items.add(new Item(pepsi, "109", true));


    }
}
