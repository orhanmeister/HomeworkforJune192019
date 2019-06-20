package com.company;

import java.util.Scanner;

public class Exercise5
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        int CAL1 = in.nextInt();

        System.out.print("Enter the second grade: ");
        int CAL2 = in.nextInt();

        System.out.print("Enter the third grade: ");
        int CAL3 = in.nextInt();

        System.out.print("Enter the fourth grade: ");
        int CAL4 = in.nextInt();

        System.out.print("Enter the fifth grade: ");
        int CAL5 = in.nextInt();

        int Average = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5)/5;

        if (Average > 6)
            System.out.print("Approved");
        else
            System.out.print("Not Approved");    }

}





