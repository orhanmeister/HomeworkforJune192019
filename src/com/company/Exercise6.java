package com.company;

import java.util.Scanner;

public class Exercise6
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the salary before increase in $CAD: ");
        int salary = in.nextInt();

        if (salary <= 1000)
            System.out.print("The new salary is: " + salary*1.12);
        else
            System.out.print("The new salary is: " + Math.round(salary*1.15));    }

}





