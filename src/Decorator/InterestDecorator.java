package Decorator;

import strategy.InterestCalculationStrategy;
import model.Contract;

public abstract class InterestDecorator implements InterestCalculationStrategy {
    protected final InterestCalculationStrategy wrappedStrategy;

    public InterestDecorator(InterestCalculationStrategy wrappedStrategy) {
        this.wrappedStrategy = wrappedStrategy;
    }

    @Override
    public double calculateInterest(Contract contract) {
        return wrappedStrategy.calculateInterest(contract);
    }
}