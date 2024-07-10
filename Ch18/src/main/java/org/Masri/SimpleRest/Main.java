package org.Masri.SimpleRest;

import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("Enter Number To Be Factorial");
//        BigInteger n=scanner.nextBigInteger();
//        System.out.println("the Factorial of "+n+"!"+" =" +factorial(n));
//
//        System.out.println(pow(2,3));
        System.out.println(gcd(42,30));
    }
//    public static BigInteger factorial(BigInteger number)
//    {
//        if (number.compareTo(BigInteger.ONE) <= 0)
//            return BigInteger.ONE;
//        else
//            return number.multiply(
//                    factorial(number.subtract(BigInteger.ONE)));
//

//}
//    public static int mystery(int a ,int b){
//        if (b==1){
//            return a;
//        }
//        return a+mystery(a,b-1);
//    }
public static int pow(int a ,int pow){
        if (pow==1){
            return a;
        }
        return a*pow(a,pow-1);
}
public static double gcd(int x,int y){
        if (y==0){
            return x;
        }
        return gcd(y,x%y);
}
}