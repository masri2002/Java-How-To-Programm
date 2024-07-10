package org.Masri.Searching;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LinearSearch {
    public static void main(String[] args) {
       int ar[]={1,3,46,7,89,7,4,21,12,5};
       int index=linearSearch(ar,5);
        System.out.println(index);
    }

    private static int linearSearch(int[] ar, int value) {
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==value){
                return i;
            }
        }
    return -1;
    }
}