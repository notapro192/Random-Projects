package me.maxagin.Euler;

public class LargestPrimeFactor{
    public static void main(String [] args){largePrimeFactor(600851475143)}

    public static long largePrimeFactor (long num){
        for (int i = 2; i < num; i ++){
            while (divisible(i, num)){
                num /= i;
            }
        }
        return num;
    }

    public static boolean divisible(int i, long num){
        double x = 0;
        x = num / i;
        x *= 10;
        return ()
    }
}
