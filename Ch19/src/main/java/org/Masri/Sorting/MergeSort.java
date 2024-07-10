package org.Masri.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int ar[]={5,7,9,6,10,7,11,12,13,4};
        mergeSort(ar);
        System.out.println(Arrays.toString(ar));

    }

    private static void mergeSort(int[] ar) {
    int arrayLength=ar.length;
    if(arrayLength<2){
        return;
    }
    int middleLength=arrayLength/2;
    int leftAr []=new int[middleLength];
    int rightAr[]=new int[arrayLength-middleLength];
    for (int i = 0 ; i<middleLength;i++){
        leftAr[i]=ar[i];
    }
        for (int i = middleLength; i <arrayLength ; i++) {
            rightAr[i-middleLength]=ar[i];
        }
    mergeSort(leftAr);
    mergeSort(rightAr);
    mrege(ar,leftAr,rightAr);
    }

    private static void mrege(int[] ar, int[] leftAr, int[] rightAr) {
     int leftLen=leftAr.length;
     int rightLen=rightAr.length;
     int i=0 , j=0 , k=0;
     while (i<leftLen && j<rightLen){
         if (leftAr[i]<=rightAr[j]){
             ar[k]=leftAr[i];
             i++;
         }else{
             ar[k]=rightAr[j];
             j++;
         }
         k++;
     }
     while (i<leftLen){
         ar[k]=leftAr[i];
         i++;
         k++;
     }
     while (j<rightLen){
         ar[k]=rightAr[j];
         j++;
         k++;
     }
    }
}
