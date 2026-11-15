package strategy;

import model.Contract;

public class InterestContext {
    private InterestCalculationStrategy strategy;

    public void setStrategy(InterestCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeCalculation(Contract contract) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set!");
        }
        return strategy.calculateInterest(contract);
    }
}