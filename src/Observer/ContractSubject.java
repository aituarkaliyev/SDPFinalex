package Observer;

import model.Contract;

public interface ContractSubject {
    void registerObserver(FraudObserver observer);
    void removeObserver(FraudObserver observer);
    void notifyObservers(Contract contract);
}