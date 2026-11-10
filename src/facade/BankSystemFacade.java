package facade;

import Builder.ContractBuilder;
import Decorator.IContract;
import Decorator.NotarySignedDecorator;
import Observer.Observer;
import Visitor.ComplianceVisitor;
import Visitor.ContractVisitor;
import model.Contract;
import strategy.InterestStrategy;

import java.util.ArrayList;
import java.util.List;

public class BankSystemFacade {
    private final List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public IContract processNewContract(
            ContractBuilder builder,
            String firstName,
            String lastName,
            String iin,
            double sum,
            InterestStrategy interestStrategy
    ) {
        Contract contract = builder.setFirst_Name(firstName)
                .setLast_Name(lastName)
                .setIIN(iin)
                .setSum(sum)
                .buildContract();

        notifyObservers("Created new contract for client: " + firstName + " " + lastName);

        double calculatedInterest = interestStrategy.calculateInterest(sum);
        System.out.println("Calculated interest amount: " + calculatedInterest);

        ContractVisitor complianceVisitor = new ComplianceVisitor();
        contract.accept(complianceVisitor);

        IContract decoratedContract = new NotarySignedDecorator(contract);
        decoratedContract.printDetails();

        System.out.println("--------------------------------------------------");
        return decoratedContract;
    }
}