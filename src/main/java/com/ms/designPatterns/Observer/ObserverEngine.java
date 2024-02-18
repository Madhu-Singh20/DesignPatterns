package com.ms.designPatterns.Observer;

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
