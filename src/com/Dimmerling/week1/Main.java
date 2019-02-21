package com.Dimmerling.week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a Fahrenheit temperature");
        int userInput = Integer.parseInt(input.nextLine());
        System.out.println("This temp in celsius is " + (userInput - 32) * 5/9 );

        while (userInput > -460) {
            userInput = Integer.parseInt(input.nextLine());
            System.out.println("Give me a Fahrenheit temperature");
            System.out.println("This temp in celsius is " + (userInput - 32) * 5/9 );
        }
    }
}
