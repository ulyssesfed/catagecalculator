package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float catAge = GetInput("Enter the cat's age");

        System.out.println("The cat is " + catAge(catAge)+ " years old in cat years");
    }
    public static float GetInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextFloat();
    }
    public static float catAge(float catAge){
        float convertedAge;
        if (catAge == 1){
            convertedAge = 15;
        }
        else if (catAge == 2){
            convertedAge = 15 + 9;
        }
        else{
            convertedAge = 15 + 9 + (catAge - 2) * 4;
        }
        return convertedAge;
    }
}

