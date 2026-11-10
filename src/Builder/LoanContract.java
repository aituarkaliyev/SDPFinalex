package Builder;

public class LoanContract implements ContractBuilder {
    private Contract loan_Contract;

    public LoanContract() {
        this.reset();
    }

    public ContractBuilder reset() {
        this.loan_Contract = new Contract(); return this;
    }


    @Override
    public ContractBuilder setFirst_Name(String first_Name) {
        loan_Contract.setFirst_Name(first_Name); return this;
    }

    @Override
    public ContractBuilder setLast_Name(String last_Name) {
        loan_Contract.setLast_Name(last_Name); return this;
    }

    @Override
    public ContractBuilder setIIN(String IIN) {
        loan_Contract.setIIN(IIN); return this;
    }

    @Override
    public ContractBuilder setSum(double sum) {
        loan_Contract.setSum_Of_Contract(sum); return this;
    }

    @Override
    public Contract buildContract() {
        return loan_Contract;
    }
}
