package Observer;

import model.Contract;

public interface FraudObserver {
    void onContractCreated(Contract contract);
}