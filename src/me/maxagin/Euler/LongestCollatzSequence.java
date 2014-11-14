package me.maxagin.Euler;

public class LongestCollatzSequence {

    public static void main(String [] args){
        System.out.print(longCollatz(13));
    }

    public static int longCollatz(int max){
        int steps = 0;
        int longeststeps = 0;
        for (int i = 1; i < max; i ++){
            int num = i;
            while (num != 1){
                if (num % 2 == 0){
                    num = num/2;
                }
                else{
                    num = num * 3 + 1;
                }
                steps ++;
            }
            if (steps > longeststeps){
                longeststeps = steps;
            }
        }

        return longeststeps;
    }
}
