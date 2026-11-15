package Decorator;

import model.Contract;

public class NotarySignedDecorator extends ContractWrapper {

    public NotarySignedDecorator(Contract contract) {
        super(contract);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Notary status: Simulated signature applied.");
    }
}