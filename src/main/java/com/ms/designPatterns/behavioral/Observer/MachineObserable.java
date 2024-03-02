package com.ms.designPatterns.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class MachineObserable implements StockObserable{

    List<NotificationObserver> machineObserver=new ArrayList<>();
    Integer machinesInStock=0;

    @Override
    public void add(NotificationObserver no) {
        machineObserver.add( no );

    }

    @Override
    public void remove(NotificationObserver no) {
        machineObserver.remove( no );

    }

    @Override
    public void notifyObserver() {
        for (NotificationObserver no:machineObserver){
            no.update();
        }

    }

    @Override
    public void setStock(int n) {
        if(machinesInStock==0) {
           notifyObserver();
        }
        machinesInStock+=n;
    }
}
