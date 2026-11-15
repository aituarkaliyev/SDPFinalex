
package strategy;

public class LoanInterestStrategy implements InterestStrategy {

    private static final double INTEREST_RATE = 0.15;

    @Override
    public double calculateInterest(double sum) {
        validateSum(sum);
        return sum * INTEREST_RATE;
    }

    private void validateSum(double sum) {
        if (!Double.isFinite(sum) || sum <= 0) {
            throw new IllegalArgumentException(
                    "Contract sum must be a positive finite number"
            );
        }
    }
}
