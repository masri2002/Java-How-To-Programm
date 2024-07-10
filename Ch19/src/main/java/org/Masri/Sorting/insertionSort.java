package org.Masri.Sorting;

import java.security.SecureRandom;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int ar [] ={56 ,36 ,4 ,10 ,77 ,51 ,93 ,30 ,5 ,52};
        /*          36  56  4  10  77  51  93  30  5  52
                    36  36  56  10  77  51  93  30  5  52
                    4  10  36  56  77  51  93  30  5  52
                    4  10  36  56  77  51  93  30  5  52
                    4  10  36  51  56  77  93  30  5  52
                    4  5  10  30  36  51  56  77  93  52
                    4  5  10  30  36  51  52  56  77  93
         */
        long startTime=System.currentTimeMillis();
        selectionSort(ar);
        long endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(ar));
        System.out.println("Insertion sort take time in millis :" + (endTime-startTime)+"ms");
    }
    private static void selectionSort(int[] ar) {
      for (int i =1 ; i<ar.length;i++){
          int currElement=ar[i];
          int j=i-1;
          while (j>=0 &&ar[j]>currElement){
              ar[j+1]=ar[j];
              j--;
          }
          ar[j+1]=currElement;
      }
    }
}
