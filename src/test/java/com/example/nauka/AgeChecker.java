package com.example.nauka;
import java.util.Scanner;


public class AgeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Age = 0;

        boolean run = true;
        while (run) {
            System.out.println("Enter your age: ");
            Age = sc.nextInt();
            if (Age < 18) {
                System.out.println("""
                    you're too young to:
                        drink alcohol
                        drive a car
                        get a job
                """);
            }
            if (Age > 18) {
                System.out.println("""
                    you're enough old to:
                        drink alcohol
                        drive a car
                        get a job
                        do whatever you want
                """);
            }
        }
    }
}
