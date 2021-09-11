package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the principal amount? ");
        float principal = sc.nextFloat();

        System.out.println("What is the rate? ");
        float rate = sc.nextFloat();

        System.out.println("What is the number of years? ");
        int years = sc.nextInt();

        System.out.println("What is the number of times the interest is compounded per year? ");
        int times = sc.nextInt();

        //calculate
        double base = (1 + (rate / (100 * times)));
        double exponent = times * years;
        double value = principal * Math.pow(base, exponent);

        System.out.printf("$%.0f invested at %.1f%% for %d years compounded %d times per year is $%.2f.",
                principal, rate, years, times, value);
    }
}