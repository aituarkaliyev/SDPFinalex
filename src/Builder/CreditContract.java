package Builder;

import model.Contract;

public class CreditContract implements ContractBuilder {
    private Contract creditContract;

    public CreditContract() {
        this.reset();
    }

    public ContractBuilder reset() {
        this.creditContract = new Contract(); return this;
    }

    @Override
    public ContractBuilder setFirst_Name(String firstName) {
        creditContract.setFirst_Name(firstName); return this;
    }

    @Override
    public ContractBuilder setLast_Name(String lastName) {
        creditContract.setLast_Name(lastName); return this;
    }

    @Override
    public ContractBuilder setIIN(String IIN) {
        creditContract.setIIN(IIN); return this;
    }

    @Override
    public ContractBuilder setSum(double sum) {
        creditContract.setSum_Of_Contract(sum); return this;
    }

    @Override
    public ContractBuilder setLoanTerm(double loanTerm) {
        creditContract.setLoan_Term(loanTerm); return this;
    }

    @Override
    public Contract buildContract() {
        return creditContract;
    }
}
