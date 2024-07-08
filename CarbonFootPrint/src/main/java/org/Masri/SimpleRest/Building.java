package org.Masri.SimpleRest;

public class Building implements CarbonFootprint {
    private double electricityUsagePerYear;
    private String fuelUsage;

    public Building(double electricityUsage, String fuelUsage) {
        if(electricityUsage <= 0.0){
            throw new IllegalArgumentException("electricity Usage Per Year must be > 0.0 ");
        }
        this.electricityUsagePerYear = electricityUsage;
        this.fuelUsage = fuelUsage;
    }


    public String getFuelUsage(){
        return this.fuelUsage;
    }
    @Override
    public double CarbonFootprint() {
        return (electricityUsagePerYear*0.7)+(600*EmissionFactors.getEmissionFactors(this));
    }
}
