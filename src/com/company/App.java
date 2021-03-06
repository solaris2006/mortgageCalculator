package com.company;

public class App {

    public static void run() {

        var read = new Read();
        var principal = (int) read.readNumber("Principal: ", 1000, 1_000_000);
        var annualInterest = (float) read.readNumber("Annual Interest Rate: ", 1, 30);
        var years = (byte) read.readNumber("Period (Years): ", 1, 30);
        var mortgage = new Mortgage(principal,annualInterest, years);
        mortgage.printMortgage(mortgage.calculateMortgage());
        mortgage.printPaymentSchedule(years);

    }

}
