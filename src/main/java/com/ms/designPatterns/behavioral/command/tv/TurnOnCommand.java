package com.ms.designPatterns.behavioral.command.tv;

public class TurnOnCommand implements Command{
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOnTV();
    }
}
