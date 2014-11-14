package me.maxagin.SnowDayCalc;

import java.util.Scanner;

public class Trial {
    public static void main(String [] args){
        Scanner best = new Scanner(System.in);
        System.out.println("How much snow is predicted to fall: ");
        double amountSnow = best.nextDouble();
        best.nextLine();
        System.out.println("How many snow days have there been this year: ");
        int snowDays = best.nextInt();
        best.nextLine();
        System.out.println("Is your school a suburban public school, an urban public school, a rural public school, a private school or a boarding school:");
        String schoolType = best.nextLine();
        double score = (amountSnow * 10);

        if (schoolType.equalsIgnoreCase("suburban public school")){
            score *= 0.9;
        }
        else if (schoolType.equalsIgnoreCase("urban public school")){
            score *= 0.8;
        }
        else if (schoolType.equalsIgnoreCase("rural public school")){
            score *= 1.1;
        }
        else if (schoolType.equalsIgnoreCase("private school")){
            score *= 1.1;
        }
        else if (schoolType.equalsIgnoreCase("boarding school")){
            score *= 0.6;
        }

        if (snowDays < 10) {
            for (int i = 0; i < 10; i ++){
                if(snowDays == 0){
                    score *= 1;
                }
                else if(snowDays == i){
                    score *= (snowDays/10);
                }
                else{

                }
            }
        }
        else{
            score *= 0.1;
        }
        System.out.println(score);
    }
}
