package me.maxagin.Euler;

public class EvenFibonnaciNumbers {

    public static void main(String [] args){
        System.out.print(sumEvenFibonacci(4));
    }

    public static int sumEvenFibonacci(int max){
        int x = 1;
        int y = 2;
        int count = 1;
        int tot = 0;
        while(count < max){
            count++;
            if (count % 2 == 0){
                x = x + y;
            }
            else{
                y = x + y;
            }
            if(x%2 == 0){
                tot += x;
            }
            else if(y%2 == 0){
                tot += y;
            }

        }
        return tot;
    }
}
