package strategy;

import model.Contract;

public class LoanOrSavingsInterestStrategy implements InterestCalculationStrategy {
    private static final double LoanInterestRate= 0.10;
    @Override
    public double calculateInterest(Contract contract) {
        return contract.getSumOfContract() * LoanInterestRate * contract.getLoanTerm();
    }
}