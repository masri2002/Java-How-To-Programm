package org.Masri.SimpleRest;

import org.w3c.dom.ls.LSOutput;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      int ar []=new int[]{0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
//        System.out.printf("%s%8s%n","index","value");
//      for (int i=0;i<10;i++){
//          System.out.printf("%5d%8d%n",i,ar[i]);
//      }
//        System.out.println("Grade Distribution");
//        for (int i = 0; i <ar.length; i++) {
//            if (i == 10) {
//                System.out.printf("%5d:", i * 10);
//            } else {
//                System.out.printf("%02d-%02d:", i * 10, i * 10 + 9);
//            }
//            for (int j = 0; j < ar[i]; j++){
//                System.out.print("*");
//        }
//            System.out.println();
//        }
//        int freq []=new int[7];
//        SecureRandom random = new SecureRandom();
//        for (int i = 0; i < 6000000; i++) {
//            ++freq[random.nextInt(7)];
//        }
//        AtomicInteger index= new AtomicInteger(1);
//        System.out.printf("%s%12s%n","DiceFace","Frequency");
//        Arrays.stream(freq).forEach(
//
//                (x)->System.out.printf("%5d%12d%n",(index.getAndIncrement()),x)
//
//        );
//        int frequency []= new int [5];
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter the Your Rating form 1-5");
//           for (int i = 0; i < 5; i++) {
//               ++frequency[sc.nextInt()-1];
//           }
//        System.out.printf("%s%18s%n","YourRate","Frequency");
//           String rate []=new String[]{"awful","underAverage","average","good","excellent"};
//           for (int i = 0; i < frequency.length; i++) {
//               System.out.printf("%s:%18d%n",rate[i],frequency[i]);
//           }
//        System.out.println(avg(10.0,20.0));

//        int ar[]=new int[]{1,5,4,3,2};
//        int ar2[]=new int[]{1,2,3,4};
//        Arrays.parallelSort(ar);
//        Arrays.stream(ar).filter((x)->x!=5).forEach(System.out::println);
//
        ArrayList<Integer>x=new ArrayList<>(20);
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.trimToSize();
        System.out.println(x.size());
    }
//    public static double avg(double ... avarage){
//        double total=0;
//        for (double a :avarage){
//            total+=a;
//        }
//        return total/avarage.length;
//    }
    }
