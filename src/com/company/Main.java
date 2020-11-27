package com.company;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
   final static byte MONTHS_IN_YEAR = 12;
   final static byte PERCENT = 100;



    public static void main(String[] args) {
       //int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        var read = new Read();
        int principal = (int) read.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) read.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) read.readNumber("Period (Years): ", 1, 30);
        var mortgage = new Mortgage(principal,annualInterest, years);
        var balance = mortgage.calculateBalance(principal, annualInterest, years, (short)2);
        mortgage.printMortgage(mortgage.calculateMortgage());
        mortgage.printPaymentSchedule(balance, years);
    }

}