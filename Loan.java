package app;

public class Loan {
	private double principal; // The initial loan amount
    private double annualRate; // The annual interest rate (e.g., 5.0 for 5%)
    private int termYears; // The loan term in years

    // Constructor to initialize a new Loan object
    public Loan(double principal, double annualRate, int termYears) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.termYears = termYears;
    }

    // --- Getter Methods ---

    public double getPrincipal() {
        return principal;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public int getTermYears() {
        return termYears;
    }
}
