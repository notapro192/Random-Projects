package me.maxagin.Euler;

public class SpecialPythagoreanTriple {
    public static void main(String[] args) {
        firstTry();
        /*for (int a = 1; a < 333; a += 2){
            int b;
        }*/
    }

    public static void firstTry(){
        for (int a = 1 ; a < 1000 ; a ++){
            for(int b = 2; b < 1000; b++ ){
                for (int c = 1; c < 1000; c++ ){
                    if ((a + b + c == 1000) && ((a*a)+(b*b)==(c*c))){
                        System.out.println(a*b*c);
                        break;
                    }
                }
            }
        }
        System.out.println("hi there");
    }
}
