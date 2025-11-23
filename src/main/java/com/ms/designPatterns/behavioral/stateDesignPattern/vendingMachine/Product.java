package com.ms.designPatterns.behavioral.stateDesignPattern.vendingMachine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Product {
     private String name;
     private long price;
}
