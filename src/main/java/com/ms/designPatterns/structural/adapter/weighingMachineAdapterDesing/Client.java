package com.ms.designPatterns.structural.adapter.weighingMachineAdapterDesing;

import com.ms.designPatterns.structural.adapter.weighingMachineAdapterDesing.adaptee.WeightMachineForBabies;
import com.ms.designPatterns.structural.adapter.weighingMachineAdapterDesing.adapter.WeightAdapter;
import com.ms.designPatterns.structural.adapter.weighingMachineAdapterDesing.adapter.WeightAdapterImpl;

public class Client {

    public static void main(String[] args){

        WeightAdapter weightAdapter=new WeightAdapterImpl(new WeightMachineForBabies());
        double weightInKG=weightAdapter.getWeightInKG();
        System.out.println("Weight in kg is : "+weightInKG);
    }
}
