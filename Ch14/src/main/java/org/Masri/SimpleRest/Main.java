package org.Masri.SimpleRest;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      char [] ar ={'a','h','m','a','d'};
//     String s1=new String("ahmad");
//     String s2=new String(ar);
//     String s3=new String(ar,2,3);
//     String s4=new String(s1);
//
//        System.out.printf(
//                 "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
//   String s="Hi man";
//   s.getChars(3,6,ar,2);
//        System.out.println(Arrays.toString(ar));

//        String s4=new String("hello");
//        String s3="  Hello   ";
//        System.out.println(s4.compareTo(s3));
//        System.out.println(s3.regionMatches(true, 0, s4, 0, 5));
//        System.out.println(s3.regionMatches(0, s4, 0, 5));
//        System.out.println(s3.lastIndexOf("ll"));
//        System.out.println(s3.trim().replace("l","ax"));
//        String hi ="hi-my-name-is-ahmad";
//        String [] s =hi.split("-");
//        Arrays.stream(s).forEach(System.out::print);
//        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
//        boolean booleanValue = true;
//        int integerValue = 7;
//        long longValue = 10000000000L;
//        float floatValue = 2.5f;
//        double doubleValue = 33.333;
//        Object objectRef = "hello";
//        System.out.println(String.valueOf(charArray,2,3));
//        System.out.println(String.valueOf(booleanValue));
//        System.out.println(String.valueOf(longValue));
//        System.out.println(String.valueOf(integerValue));
//        System.out.println(String.valueOf(objectRef));
//        System.out.println(String.valueOf(doubleValue));

//        StringBuilder builder = new StringBuilder("java45dsfsd4f55555554f5sd4f5sdf4sd5f4s");
//        System.out.println(builder);
//        String s="java";
//        String s2=" Hi";
//        s+=s2; // need to create new Object
//        builder.append(" Hi");
//        System.out.println(s);
//        System.out.println(builder);
//        System.out.println(builder.capacity());
//        char [] c =new char[builder.length()];
//        builder.getChars(0,builder.length(),c,0);
//        for (char c1 : c) {
//            System.out.println(c1);
//        }
//        StringBuilder b =new StringBuilder("ahmad");
//        b.insert(0,"i");
//        b.insert(2,"Nooooooo");
//        b.delete(3,9);
//        String x="hi-mu";
//        StringTokenizer tokenizer=new StringTokenizer("hi ahmad i am");
//             while (tokenizer.hasMoreTokens()){
//                 System.out.println(tokenizer.nextToken());
//             }
//
//        System.out.println(b);
        String firstString = "This sentence ends in 5 stars *****";
        firstString=firstString.replaceAll("\\*","^");
        firstString=firstString.replaceAll("\\w+","word");
        System.out.println(firstString);
        String s2="1 2 3 4 5 6 7 8";

            s2=s2.replaceAll("\\d+","digit");
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
        String [] strings =secondString.split(",\\s");
        System.out.println(s2);
        for(String s :strings){
            System.out.println(s);
        }
    }
}