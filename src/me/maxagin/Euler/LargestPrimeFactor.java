package me.maxagin.Euler;

public class LargestPrimeFactor{
    public static void main(String [] args){System.out.print(largePrimeFactor(600851475143L));}

    public static long largePrimeFactor (long num){
        for (int i = 2; i < num; i ++){
            while (divisible(i, num)){
                num /= i;
            }
        }
        return num;
    }

    public static boolean divisible(int i, long num){
        return (num % i == 0);

    }
}
