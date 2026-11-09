import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualrate = input.nextDouble();

        System.out.print("Enter loan term in years: ");
        int years = input.nextInt();

        input.close();

        if (principal <= 0 || annualrate < 0 || years <= 0) {
            System.out.println("Please enter valid positive numbers.");
            return;
        }

        int totalmonths = years * 12;
        double monthlyrate = annualrate / 100 / 12;

        double monthlypayment;

        if (monthlyrate == 0) {
            monthlypayment = principal / totalmonths;
        } else {
            monthlypayment = principal * monthlyrate /
                    (1 - Math.pow(1 + monthlyrate, -totalmonths));
        }

        double totalpayment = monthlypayment * totalmonths;
        double totalinterest = totalpayment - principal;

        System.out.println();
        System.out.println("Mortgage Summary");
        System.out.println("----------------");

        System.out.printf("Monthly Payment: $%.2f%n", monthlypayment);
        System.out.printf("Total Payment: $%.2f%n", totalpayment);
        System.out.printf("Total Interest: $%.2f%n", totalinterest);
    }
}