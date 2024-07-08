package org.Masri.SimpleRest;

public class EmissionFactors {
    public static double getEmissionFactors(CarbonFootprint carbonFootprint){
        if(carbonFootprint instanceof Car){
            return 8.89;
        }
        if(carbonFootprint instanceof Building){
                return 5.3;
            }

        if(carbonFootprint instanceof Bicycle){
            return 240;
        }
        return -1;
    }
}
