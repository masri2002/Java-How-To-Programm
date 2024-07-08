package org.Masri.SimpleRest;

public class WorldPopulationGrowth {
    public static int yearOfDoublePopulation(){
        double currentPopulation =8000000000.0;
         int currentYear = 2020;
         double growthPopulation = 1.03;
        double newPopulation =0;
         while (currentYear<2095){
          double calc =(newPopulation*growthPopulation);
           newPopulation += calc;
             System.out.println("year " + currentYear + "population is " + newPopulation);
           if(newPopulation == (currentPopulation*2)){
                   return currentYear;
           }
           currentYear++;
         }
         return currentYear;
    }
}
