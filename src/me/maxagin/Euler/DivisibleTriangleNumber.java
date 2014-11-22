package me.maxagin.Euler;

import me.maxagin.MasterClasses.Divisible;

public class DivisibleTriangleNumber {
    public static void main(String[] args) {
        int count = 0;
        int triNum = 0;
        for(int i = 1; count <500 ;i++){
            triNum = (i*(i+1)/2);
            for(int x = 1; x < triNum ;x++){
                if(Divisible.divisible(triNum,x)){
                    count++;
                }
                else{
                    count = 0;
                }
            }
        }
        System.out.println("3");
    }
}
