public class ContractWrapper implements IContract {
    protected Contract contract;

    public ContractWrapper(Contract contract) {
        this.contract = contract;
    }

    @Override
    public void printDetails() {
        System.out.println("Contract: " + contract.getFirst_Name() + " " + contract.getLast_Name() + ", Sum: " + contract.getSum_Of_Contract());
    }

    @Override
    public double getSum() {
        return contract.getSum_Of_Contract();
    }
}