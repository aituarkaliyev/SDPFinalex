package Decorator;

import strategy.InterestCalculationStrategy;
import model.Contract;

public class ServiceFeeDecorator extends InterestDecorator {
    private static final double SERVICE_FEE = 1500.0;

    public ServiceFeeDecorator(InterestCalculationStrategy wrappedStrategy) {
        super(wrappedStrategy);
    }

    @Override
    public double calculateInterest(Contract contract) {
        return super.calculateInterest(contract) + SERVICE_FEE;
    }
}