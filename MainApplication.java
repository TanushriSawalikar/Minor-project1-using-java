package app;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Hello, financial project is running!");
		Scanner scanner = new Scanner(System.in);

        System.out.println("--- Simple Loan Calculator ---");
        
        System.out.print("Enter Loan Principal Amount (e.g., 200000): $");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate (e.g., 4.5 for 4.5%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter Loan Term in Years (e.g., 30): ");
        int termYears = scanner.nextInt();
        
        scanner.close();
    
        Loan userLoan = new Loan(principal, annualRate, termYears);

        LoanCalculator calculator = new LoanCalculator();

        double monthlyPayment = calculator.calculateMonthlyPayment(userLoan);

        System.out.println("\n--- Loan Summary ---");
        System.out.printf("Principal: $%,.2f%n", userLoan.getPrincipal());
        System.out.printf("Rate: %.2f%%%n", userLoan.getAnnualRate());
        System.out.printf("Term: %d years%n", userLoan.getTermYears());

        System.out.println("\n==================================");
        System.out.printf("The fixed MONTHLY PAYMENT is: $%,.2f%n", monthlyPayment);
        System.out.println("==================================");
        
    }

	}
