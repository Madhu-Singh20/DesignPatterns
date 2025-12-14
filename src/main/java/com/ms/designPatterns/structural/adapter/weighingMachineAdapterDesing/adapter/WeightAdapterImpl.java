package com.ms.designPatterns.structural.adapter.weighingMachineAdapterDesing.adapter;

import com.ms.designPatterns.structural.adapter.weighingMachineAdapterDesing.adaptee.WeighingMachine;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WeightAdapterImpl implements WeightAdapter{

    private final WeighingMachine weighingMachine;

   public double getWeightInKG(){
       return weighingMachine.getWeightInPound() * .45;
   }

}
