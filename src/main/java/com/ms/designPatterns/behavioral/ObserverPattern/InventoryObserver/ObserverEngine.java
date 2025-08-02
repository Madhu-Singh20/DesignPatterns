package com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver;

import com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver.obserable.MachineObserable;
import com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver.obserable.MobileObserable;
import com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver.observer.EmailNotificationObserver;
import com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver.observer.MessageNotificationObserver;
import com.ms.designPatterns.behavioral.ObserverPattern.InventoryObserver.observer.NotificationObserver;

public class ObserverEngine {

    public static void main(String[] args){

        NotificationObserver no1=new EmailNotificationObserver("abc@gmail.com");
        NotificationObserver no2=new MessageNotificationObserver( "123" );

        MachineObserable machineObserable=new MachineObserable();
        machineObserable.add( no1 );
        machineObserable.add( no2 );

        MobileObserable mobileObserable=new MobileObserable();
        machineObserable.add( no1 );
        mobileObserable.add( no2 );



    }

}
