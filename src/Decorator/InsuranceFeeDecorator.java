package Decorator;

import strategy.InterestCalculationStrategy;
import model.Contract;

public class InsuranceFeeDecorator extends InterestDecorator {
    private static final double InsuranceRate = 0.01;

    public InsuranceFeeDecorator(InterestCalculationStrategy wrappedStrategy) {
        super(wrappedStrategy);
    }

    @Override
    public double calculateInterest(Contract contract) {
        double baseInterest = super.calculateInterest(contract);
        double insurance = contract.getSumOfContract() * InsuranceRate;
        return baseInterest + insurance;
    }
}