package Decorator;

import strategy.InterestCalculationStrategy;
import model.Contract;

public class ServiceFeeDecorator extends InterestDecorator {
    private static final double ServiceFee = 1500.0;

    public ServiceFeeDecorator(InterestCalculationStrategy wrappedStrategy) {
        super(wrappedStrategy);
    }

    @Override
    public double calculateInterest(Contract contract) {
        return super.calculateInterest(contract) + ServiceFee;
    }
}