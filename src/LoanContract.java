public class LoanContract implements ContractBuilder {
    private Contract contract = new Contract();

    @Override
    public ContractBuilder setFirst_Name(String first_Name) {
        contract.setFirst_Name(first_Name); return this;
    }

    @Override
    public ContractBuilder setLast_Name(String last_Name) {
        contract.setLast_Name(last_Name); return this;
    }

    @Override
    public ContractBuilder setIIN(int IIN) {
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
