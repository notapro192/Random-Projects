package me.maxagin.Euler;

public class SmallestMultiple {
    public static void main(String [] args){
        int count = 0;
        int ans = 0;
        while (count < 20){
            for (int i = 50; ; i++){
                for(int x = 1; x <= 20; x++){
                    if(i % x == 0){
                        count++;
                    }
                    else {
                        count = 0;
                    }
                }
                ans = i;
                if (count == 20){
                    break;
                }
            }
        }
    System.out.print(ans);
    }
}
