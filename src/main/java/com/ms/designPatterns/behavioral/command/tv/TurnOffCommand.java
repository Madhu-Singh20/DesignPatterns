package com.ms.designPatterns.behavioral.command.tv;

public class TurnOffCommand implements Command{

    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOffTV();
    }
}
