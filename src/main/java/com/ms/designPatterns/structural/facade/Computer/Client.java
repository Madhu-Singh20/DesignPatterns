package com.ms.designPatterns.structural.facade.Computer;

public class Client {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }

}
