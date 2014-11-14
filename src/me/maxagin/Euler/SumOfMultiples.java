package me.maxagin.Euler;

public class SumOfMultiples {

    public static void main(String [] args){

        System.out.print(sumOfMultiples(3,5,1000));
    }

    public static int sumOfMultiples(int a, int b, int max){
        int sum = 0;
        for (int i = 0; i < max; i++){
            if (i % a == 0 || i % b == 0){
                sum += i;
            }
        }
        return sum;
    }
}
