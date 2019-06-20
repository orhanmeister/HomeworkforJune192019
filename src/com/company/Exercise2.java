package com.company;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount to be converted in CAD: ");
        double CADamount = in.nextDouble();
        double USDamount = CADamount * 0.75;

        System.out.print("$CAD " + CADamount + " = $USD " + Math.round(USDamount * 100.0) / 100.0);
    }
}




