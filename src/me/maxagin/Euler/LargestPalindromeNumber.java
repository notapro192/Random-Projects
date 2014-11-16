package me.maxagin.Euler;

public class LargestPalindromeNumber {
    public static void main(String [] args){
        String firstNum;
        int masterNum = 0;
        for (int i = 999; i > 900; i--){
            for (int x = 999; x > 900; x--){
                int num = x * i;
                firstNum = "" + num;
                String reverseNum = new StringBuffer(firstNum).reverse().toString();
                if(firstNum.equalsIgnoreCase(reverseNum)){
                    int first = Integer.parseInt(firstNum);
                    if (first > masterNum){
                    masterNum = first;
                    }
                }
            }
        }
        System.out.print(masterNum);
    }
}
