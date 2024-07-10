package org.Masri.Sorting;

import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int ar []=new int [1000000];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=random.nextInt(1000);
        }
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubbleSort(int[] ar) {
        boolean swapped = true;
        while (swapped) {
            swapped=false;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                     int temp = ar[i + 1];
                     swapped=true;
                    ar[i + 1] = ar[i];
                    ar[i] = temp;
                }
            }
        }
    }
    }

