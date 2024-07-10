package Collections;

import java.util.*;
import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        String [] suits ={"Diamonds" , "Hearts" , "Clubs" , "spades"};
        List<String> s= Arrays.asList(suits);
        //Ascending Order
//        Collections.sort(s);
        //Descending Order
//        Collections.sort(s,Collections.reverseOrder());
        //sort in String Length order
        Collections.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
             //smallest length first
               return Integer.compare(o1.length() , o2.length());
//                greatest
//                return -1*Integer.compare(o1.length() , o2.length());
            }
        });
        System.out.println("The sorted List is :"+s);
    }
}
