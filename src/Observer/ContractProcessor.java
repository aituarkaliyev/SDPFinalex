package Observer;

import model.Contract;
import java.util.ArrayList;
import java.util.List;

public class ContractProcessor implements ContractSubject {
    private final List<FraudObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(FraudObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(FraudObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Contract contract) {
        for (FraudObserver observer : observers) {
            observer.onContractCreated(contract);
        }
    }

    public void processContract(Contract contract) {
        System.out.println("Processing contract for client: " + contract.getClientName());
        notifyObservers(contract);
    }
}