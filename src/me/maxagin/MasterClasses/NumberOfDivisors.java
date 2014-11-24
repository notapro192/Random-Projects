package me.maxagin.MasterClasses;

public class NumberOfDivisors {
    public static int numberOfDivisors(int num){
        int count = 0;
        for(int i = 1; i < num; i++){
            if(Divisible.divisible(i,num)){
                count++;
            }
        }
    return count;
    }
}
