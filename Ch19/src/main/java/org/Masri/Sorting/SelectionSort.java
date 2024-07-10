package org.Masri.Sorting;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int ar [] =new int[10];
        SecureRandom random=new SecureRandom();
        for (int i = 0; i < ar.length; i++) {
            ar[i]= 1+random.nextInt(10);
        }
        long startTime=System.currentTimeMillis();
        selectionSort(ar);
        long endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(ar));
        System.out.println("selection sort take time in millis :" + (endTime-startTime)+"ms");
    }

    private static void selectionSort(int[] ar) {
      for (int i =0 ; i<ar.length;i++){
          int min=ar[i];
          int index=i;
          for (int j = i+1; j < ar.length; j++) {
              if(ar[j]<min) {
                  min = ar[j];
                  index=j;
              }
          }
          swap(ar,i , index);
      }
    }

    private static void swap(int[] ar, int i, int index) {
        int temp=ar[i];
        ar[i]=ar[index];
        ar[index]=temp;
    }

}
