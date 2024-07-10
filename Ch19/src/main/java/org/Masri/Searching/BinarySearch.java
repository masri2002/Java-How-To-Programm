package org.Masri.Searching;

public class BinarySearch {
    public static void main(String[] args) {
      int ar[]={2, 3, 5 ,10 ,27 ,30 ,34 ,51 ,56 ,65 ,77 ,81 ,82 ,93 ,99};
       int index=binarySearch(ar,30);
        System.out.println(index);
    }

    private static int binarySearch(int[] ar, int value) {
    int low =0;
    int high=ar.length-1;
    while (low<=high){
        int mid=low+(high-low)/2;
        if (ar[mid]==value){
            return mid;
        }else if(ar[mid]>value){
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return -1;
    }


}
