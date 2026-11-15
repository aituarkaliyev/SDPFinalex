package strategy;

import model.Contract;

public class MortgageInterestStrategy implements InterestCalculationStrategy {
    private static final double MORTGAGE_ANNUAL_RATE = 0.12;

    @Override
    public double calculateInterest(Contract contract) {
        double years = contract.getDurationMonths() / 12.0;
        return contract.getSumOfContract() * MORTGAGE_ANNUAL_RATE * years;
    }
}