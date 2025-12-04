package app;

public class LoanCalculator {
public double calculateMonthlyPayment(Loan loan) {
        
        double monthlyRate = (loan.getAnnualRate() / 100.0) / 12.0;

        int numberOfPayments = loan.getTermYears() * 12;

        double principal = loan.getPrincipal();

        if (monthlyRate == 0) {
            return principal / numberOfPayments;
        }

        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments);
        double denominator = Math.pow(1 + monthlyRate, numberOfPayments) - 1;

        double monthlyPayment = principal * (numerator / denominator);
        
        return monthlyPayment;
    }
}
