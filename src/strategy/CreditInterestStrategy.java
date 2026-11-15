package strategy;

import model.Contract;

public class CreditInterestStrategy implements InterestCalculationStrategy {
    private static final double CreditInterestRATE = 0.20;

    @Override
    public double calculateInterest(Contract contract) {
        return contract.getSumOfContract() * CreditInterestRATE * contract.getLoanTerm();
    }
}