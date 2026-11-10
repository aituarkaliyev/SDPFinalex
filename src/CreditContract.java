public class CreditContract implements ContractBuilder {
    private Contract contract = new Contract();

    @Override
    public ContractBuilder setFirst_Name(String firstName) {
        contract.setFirst_Name(firstName); return this;
    }

    @Override
    public ContractBuilder setLast_Name(String lastName) {
        contract.setLast_Name(lastName); return this;
    }

    @Override
    public ContractBuilder setIIN(String IIN) {
        contract.setIIN(IIN); return this;
    }

    @Override
    public ContractBuilder setSum(double sum) {
        contract.setSum_Of_Contract(sum); return this;
    }

    @Override
    public Contract buildContract() {
        return contract;
    }
}
