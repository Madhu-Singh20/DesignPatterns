package com.ms.designPatterns.behavioral.command.tv;

public class Client {

   public static void main(String[] args) {
       TV tv = new TV();

       Command tvOn = new TurnOnCommand(tv);
       Command tvOff = new TurnOffCommand(tv);

       Remote remote = new Remote();

       remote.setCommand(tvOn);
       remote.pressButton();

       remote.setCommand(tvOff);
       remote.pressButton();
   }

}
