package Decorator;

import strategy.InterestCalculationStrategy;
import model.Contract;

public class ServiceFeeDecorator extends InterestDecorator {
    private static final double ServiceFee = 2000.0;

    public ServiceFeeDecorator(InterestCalculationStrategy wrappedStrategy) {
        super(wrappedStrategy);
    }

    @Override
    public double calculateInterest(Contract contract) {
        return super.calculateInterest(contract) + ServiceFee;
    }
}