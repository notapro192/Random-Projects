package me.maxagin.MasterClasses;

public class IsPrime {

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num != 2 && num % i == 0){
                return false;
            }
        }
        return true;
    }
}
