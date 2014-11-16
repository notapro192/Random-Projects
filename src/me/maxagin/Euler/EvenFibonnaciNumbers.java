package me.maxagin.Euler;

public class EvenFibonnaciNumbers {

    public static void main(String [] args){
        System.out.print(sumEvenFibonacci(4000000));
    }

    public static int sumEvenFibonacci(int max){
        int fib1 = 1;
        int fib2 = 0;
        int fibMaster;
        int fibTotal = 0;
        for(int i = 0; ;i ++) {
            fibMaster = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibMaster;
            if (fibMaster > max){
                break;
            }
            else{
                if (isEven(fibMaster)){
                    fibTotal += fibMaster;
                }
            }

        }
        return fibTotal;
    }
    public static boolean isEven(int num){
        return (num % 2 == 0);
    }
}

