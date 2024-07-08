package org.Masri.SimpleRest;

public class Bicycle implements CarbonFootprint {
    @Override
    public double CarbonFootprint() {
        return EmissionFactors.getEmissionFactors(this);
    }
}
