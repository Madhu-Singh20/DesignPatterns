package com.ms.lld.carRentalSystem;

import com.ms.lld.carRentalSystem.products.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        // add store
        List<Store> storeList=new ArrayList<>();

        Location store1Location=new Location(1, "Naubasta", "Hanspuram", "Kanpur", "Kanpur Nagar","UP", 208021l);
        List<Vehicle> store1Vehicles=new ArrayList<>();
        store1Vehicles.add(new Car(1, "UP78123", "Tata", "Punch", VehicleType.CAR, VehicleStatus.ACTIVE));
        addStore(1,storeList,store1Location,store1Vehicles);

        Location store2Location=new Location(1, "Sector 21", "East Gurgaon", "Gurgaon", "Gurgaon","Haryana", 122001l);
        List<Vehicle> store2Vehicles=new ArrayList<>();
        store2Vehicles.add(new Car(1, "HR26123", "Tata", "Nexon", VehicleType.CAR, VehicleStatus.ACTIVE));
        store2Vehicles.add(new Bike(2, "HR26123", "Honda", "Activa", VehicleType.BIKE, VehicleStatus.ACTIVE));
        addStore(2,storeList,store2Location,store2Vehicles);

        //add User
        List<User> userList=new ArrayList<>();

    }

    private static void addStore(int id , List<Store> storeList, Location location, List<Vehicle> vehicleList){
        StoreInventoryManagement storeInventoryManagement=new StoreInventoryManagement();
        storeInventoryManagement.setVehicleList(vehicleList);
        storeList.add(new Store(id, location, storeInventoryManagement ));
    }

    private static void addUser(List<User> us)
}
