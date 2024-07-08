package org.Masri.SimpleRest;

public class Car  implements CarbonFootprint{
    private double AnnualKMPerYear;
    private double fuelEfficiency;

    public Car(double annualKM, double fuelEfficiency) {

        this.AnnualKMPerYear = annualKM;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double CarbonFootprint() {
        return (AnnualKMPerYear/fuelEfficiency)*EmissionFactors.getEmissionFactors(this);
    }
}
