package com.company;

import java.util.Scanner;

public class Exercise4
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to find out if it is positive or negative: ");
        int B = in.nextInt();

        if (B >= 0)
            System.out.print(B + " is a positive number");
        else
            System.out.print(B + " is a negative number ");    }

}





