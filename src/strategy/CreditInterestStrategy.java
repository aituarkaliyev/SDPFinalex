package strategy;

public class CreditInterestStrategy implements InterestStrategy {
    private static final double rate = 0.22f;
    @Override
    public double calculateInterest(double sum) {
        return sum * rate;
    }
}