package me.maxagin.Euler;

public class LargestPrimeFactor{
    public static void main(String [] args){System.out.print(largePrimeFactor(13195));}

    public static int largePrimeFactor (int num){
        for (int i = 2; i < num; i ++){
            while (divisible(i, num)){
                num /= i;
            }
        }
        return num;
    }

    public static boolean divisible(int i, int num){
        return (num % i == 0);

    }
}
