package Observer;

import model.Contract;

public class FraudDetectionAlert implements FraudObserver {
    private static final double HighRiskThreshold = 5000000.0;

    @Override
    public void onContractCreated(Contract contract) {
        if (contract.getSumOfContract() >= HighRiskThreshold) {
            System.out.println("--> [FRAUD ALERT] Attention! High-value contract detected for IIN: "
                    + contract.getIIN() + " with amount: " + contract.getSumOfContract()
                    + ". Please check the client for potential fraud!");
        }
    }
}