package me.maxagin.Euler;

public class nthPrime {

    public static void main(String [] args){
        int count = 0;
        int countTwo = 0;
        int prime = 0;
        while (count < 10002){
            countTwo ++;
            if (isPrime(countTwo)){
                prime = countTwo;
                count ++;
            }
            else{}
        }
        System.out.print(prime);
    }

    public static Boolean isPrime(int num){
        if(num==2){
            return true;
        }
        for(int i=2;i<=(int)Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
