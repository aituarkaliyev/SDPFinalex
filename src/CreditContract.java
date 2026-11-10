public class CreditContract implements ContractBuilder {
    private Contract contract = new Contract();

    @Override
    public ContractBuilder setFirst_Name(String firstName) {
        return null;
    }

    @Override
    public ContractBuilder setLast_Name(String lastName) {
        return null;
    }

    @Override
    public ContractBuilder setIIN(int IIN) {
        return null;
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
