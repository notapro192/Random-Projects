package me.maxagin.Euler;

import me.maxagin.MasterClasses.Divisible;
import me.maxagin.MasterClasses.NthTriangleNumber;
import me.maxagin.MasterClasses.NumberOfDivisors;

public class DivisibleTriangleNumber {
    public static void main(String[] args){
        int d = 0;
        int triNum = 0;
        for (int i = 1; d < 500; i++){
            triNum = NthTriangleNumber.nthTriNumber(i);
            d = NumberOfDivisors.numberOfDivisors(triNum);
        }
        System.out.println(triNum);
    }
}
