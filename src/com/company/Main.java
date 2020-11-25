package com.company;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double principal = readNumber("Please enter the principal ", 1, 100000);
        byte numberOfPayments = (byte)(readNumber("Please enter number of payments ", 1, 360));
        double interestRate = readNumber("Please enter interest rate ", 1, 6);
        double monthlyPayment = mortgageCalculator(interestRate, numberOfPayments, principal);
        String result  = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.print("Your monthly payment is " + result);

    }

        public static double readNumber(String prompt, int min, int max) {
            double value;
            System.out.print(prompt);
            Scanner sc = new Scanner(System.in);

            while (true) {
                value = sc.nextDouble();
                if (value < min || value > max) {
                    System.out.println("Please enter a value between" + min + " and " + max);
                }else{
                    break;
                }

            }
            return value;
        }

        public static double mortgageCalculator(double interestRate,
                                                byte numberOfPayments,
                                                double principal) {
            final byte PERCENTAGE = 100;
            final byte MONTHS = 12;
             interestRate = (interestRate / PERCENTAGE) / MONTHS;
            double temp = Math.pow((1 + interestRate), numberOfPayments);
            return principal * ((interestRate * temp)  / (temp - 1  ));
        }
}