package org.Masri.SimpleRest;

import java.util.Scanner;

public class GasMileage {

    public static void gasMileage() {
                  float miles=0;
                  float gallon=0;
                  while(true) {
                      Scanner in = new Scanner(System.in);
                      System.out.print("Enter miles or -1 to: ");
                      System.out.println();
                       miles = in.nextFloat();
                       if(miles==-1) {
                           break;
                       }
                      System.out.println("----------------");
                       System.out.print("Enter gallons : ");
                      System.out.println("----------------");
                       gallon = in.nextFloat();
                      System.out.println("---------------");
                      System.out.printf("Gas mileage is %.2f mile\n", miles/gallon);

                  }
    }
}
