package me.maxagin.Euler;

import me.maxagin.MasterClasses.IsPrime;

public class SumOfPrimes {
    public static void main(String[] args) {
        long total = 2;
        for (int i = 3; i < 2000000; i++){
            if(IsPrime.isPrime(i)){
                System.out.println("added " + i + " to" + total);
                total += i;
            }
            else{}
        }
        System.out.println(total);
    }
}
