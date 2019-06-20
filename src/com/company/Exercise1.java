package com.company;

import java.util.Scanner;

public class Exercise1
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        if (num1 > num2)
            System.out.print(num1 + " is the largest number, and " + num2 + " is the smallest number. ");
        else
            System.out.print(num2 + " is the largest number, and " + num1 + " is the smallest number. ");    }

}





