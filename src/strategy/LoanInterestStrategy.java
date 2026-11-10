package strategy;

public class LoanInterestStrategy implements InterestStrategy {
    private static final double rate = 0.15f;
    @Override
    public double calculateInterest(double sum) {
        return sum * rate;
    }
}