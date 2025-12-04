package app;

public class LoanCalculator {
public double calculateMonthlyPayment(Loan loan) {
        
        // 1. Convert annual rate to monthly rate (r)
        double monthlyRate = (loan.getAnnualRate() / 100.0) / 12.0;

        // 2. Calculate the total number of payments (n)
        int numberOfPayments = loan.getTermYears() * 12;

        double principal = loan.getPrincipal();

        // Check for 0% interest rate to prevent division by zero in Math.pow calculation
        if (monthlyRate == 0) {
            return principal / numberOfPayments;
        }

        // Standard Loan Payment Formula: M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
        // where:
        // P = Principal
        // i = Monthly Interest Rate (monthlyRate)
        // n = Number of payments (numberOfPayments)
        
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments);
        double denominator = Math.pow(1 + monthlyRate, numberOfPayments) - 1;

        double monthlyPayment = principal * (numerator / denominator);
        
        return monthlyPayment;
    }
}
