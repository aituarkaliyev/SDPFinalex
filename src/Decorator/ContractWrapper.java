package Decorator;

import model.Contract;
import java.util.Objects;

public class ContractWrapper implements IContract {

    protected final Contract contract;

    public ContractWrapper(Contract contract) {
        this.contract = Objects.requireNonNull(
                contract,
                "Contract cannot be null"
        );
    }

    @Override
    public void printDetails() {
        System.out.println("First name: " + contract.getFirst_Name());
        System.out.println("Last name: " + contract.getLast_Name());
        System.out.println("Contract sum: " + contract.getSum_Of_Contract());
        System.out.println("Loan term: " + contract.getLoanTerm());
    }

    @Override
    public double getSum() {
        return contract.getSum_Of_Contract();
    }
}