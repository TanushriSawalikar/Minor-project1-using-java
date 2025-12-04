package app;

public class Loan {
	private double principal; 
    private double annualRate; 
    private int termYears; 

    public Loan(double principal, double annualRate, int termYears) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.termYears = termYears;
    }

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
