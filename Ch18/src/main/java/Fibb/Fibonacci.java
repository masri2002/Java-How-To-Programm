package Fibb;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String []args){
        BigInteger num =BigInteger.valueOf(40);
        System.out.println(fib(num));
    }

    public static BigInteger fib(BigInteger n){
        if(n.equals(BigInteger.ONE)||n.equals(BigInteger.ZERO)){
            return n;
        }
        return fib(n.subtract(BigInteger.ONE)).add(
                fib(n.subtract(BigInteger.TWO)));
    }
}
