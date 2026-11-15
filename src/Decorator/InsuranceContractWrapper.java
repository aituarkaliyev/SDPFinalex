package Decorator;

import model.Contract;

public class InsuranceContractWrapper implements IContract {
    protected Contract contract;

    public InsuranceContractWrapper(Contract contract) {
        this.contract = contract;
    }

    @Override
    public void getDescription() {
        System.out.println("model.Contract: " + contract.getFirst_Name() + " " + contract.getLast_Name() + ", Sum: " + contract.getSum_Of_Contract());
    }

    @Override
    public double getSum() {
        return contract.getSum_Of_Contract();
    }
}