package java_with_mosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter loan term in years: ");
        int years = input.nextInt();

        input.close();

        if (principal <= 0 || annualRate < 0 || years <= 0) {
            System.out.println("Please enter valid positive values.");
            return;
        }

        int totalMonths = years * 12;
        double monthlyRate = annualRate / 100 / 12;

        double monthlyPayment;
        if (monthlyRate == 0) {
            monthlyPayment = principal / totalMonths;
        } else {
            monthlyPayment = principal * monthlyRate /
                    (1 - Math.pow(1 + monthlyRate, -totalMonths));
        }

        double totalPayment = monthlyPayment * totalMonths;
        double totalInterest = totalPayment - principal;

        System.out.println();
        System.out.println("Mortgage Summary");
        System.out.println("----------------");
        System.out.printf("Loan Amount: $%.2f%n", principal);
        System.out.printf("Annual Rate: %.2f%%%n", annualRate);
        System.out.printf("Loan Term: %d years (%d months)%n", years, totalMonths);
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Payment: $%.2f%n", totalPayment);
        System.out.printf("Total Interest: $%.2f%n", totalInterest);
    }
}
