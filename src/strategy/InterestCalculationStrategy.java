package strategy;

import model.Contract;

public interface InterestCalculationStrategy {
    double calculateInterest(Contract contract);
}