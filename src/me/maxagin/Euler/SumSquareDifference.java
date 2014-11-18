package me.maxagin.Euler;

public class SumSquareDifference {
    public static void main(String [] args){
        int squareTot = 0;
        int totAll = 0;
        for (int i = 1; i < 101; i++){
            squareTot += (i * i);
        }
        for (int x = 1; x < 101; x++){
            totAll += x;
        }
        int totAllFin = totAll * totAll;
        int fin = totAllFin - squareTot;
        System.out.print(fin);
    }
}
