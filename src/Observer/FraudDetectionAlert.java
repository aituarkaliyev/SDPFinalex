package Observer;

import model.Contract;

public class FraudDetectionAlert implements FraudObserver {
    private static final double HighRiskThreshold = 15000000.0;

    @Override
    public void onContractCreated(Contract contract) {
        if (contract.getSumOfContract() >= HighRiskThreshold) {
            System.out.println("--> [FRAUD ALERT] Attention! High-value contract detected for client: "
                    + contract.getClientName() + " with amount: " + contract.getSumOfContract()
                    + ". Please check the client for potential fraud!");
        }
    }
}