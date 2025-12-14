package com.ms.designPatterns.structural.adapter.weighingMachineAdapterDesing.adaptee;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class WeightMachineForBabies implements WeighingMachine{

    public double getWeightInPound(){
        return 100;
    }
}
