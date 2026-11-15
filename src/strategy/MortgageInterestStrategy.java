package strategy;

import model.Contract;

public class MortgageInterestStrategy implements InterestCalculationStrategy {
    private static final double MortgageAnnualRate = 0.12;

    @Override
    public double calculateInterest(Contract contract) {
        double years = contract.getDurationMonths() / 12.0;
        return contract.getSumOfContract() * MortgageAnnualRate * years;
    }
}