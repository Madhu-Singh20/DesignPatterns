package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Item {

    private Product product;
    private String itemCode;
    private boolean available;
}
