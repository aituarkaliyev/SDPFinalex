package strategy;

import model.Contract;

public class PersonalLoanInterestStrategy implements InterestCalculationStrategy {
    private static final double AnnualInterestRate = 0.20;

    @Override
    public double calculateInterest(Contract contract) {
        double years = contract.getDurationMonths() / 12.0;
        return contract.getSumOfContract() * AnnualInterestRate * years;
    }
}