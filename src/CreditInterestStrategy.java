public class CreditInterestStrategy implements InterestStrategy {
    @Override
    public double calculateInterest(double sum) {
        return sum * 0.22;
    }
}