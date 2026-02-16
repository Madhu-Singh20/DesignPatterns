package com.ms.designPatterns.behavioral.observerPattern.InventoryObserver;

import com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.obserable.MachineObserable;
import com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.obserable.MobileObserable;
import com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.observer.EmailNotificationObserver;
import com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.observer.MessageNotificationObserver;
import com.ms.designPatterns.behavioral.observerPattern.InventoryObserver.observer.NotificationObserver;

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
