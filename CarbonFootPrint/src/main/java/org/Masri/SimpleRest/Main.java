package org.Masri.SimpleRest;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbon =new ArrayList<>();
        Car car=new Car(12000,25);
        Building building=new Building(125000,"Neutral gas");
        Bicycle bicycle=new Bicycle();
        carbon.add(car);
        carbon.add(building);
        carbon.add(bicycle);
        double total=0;
        for(CarbonFootprint c : carbon){
            total+=c.CarbonFootprint();
            System.out.println(c.getClass().getSimpleName() + "  " + c.CarbonFootprint());
        }
        System.out.println();
        System.out.println("total carbonFootPrint = " + total);


    }
}