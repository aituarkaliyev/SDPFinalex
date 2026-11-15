package Builder;

import model.Contract;

public class LoanContract implements ContractBuilder {
    private Contract loan_Contract;

    public LoanContract() {
        this.reset();
    }

    public ContractBuilder reset() {
        this.loan_Contract = new Contract(); return this;
    }

    @Override
    public ContractBuilder setFirstName(String first_Name) {
        loan_Contract.setFirst_Name(first_Name); return this;
    }

    @Override
    public ContractBuilder setLastName(String last_Name) {
        loan_Contract.setLast_Name(last_Name); return this;
    }

    @Override
    public ContractBuilder setIIN(String IIN) {
        loan_Contract.setIIN(IIN); return this;
    }

    @Override
    public ContractBuilder setSumOfContract(double sum) {
        loan_Contract.setSum_Of_Contract(sum); return this;
    }

    @Override
    public ContractBuilder setLoanTerm(double loanTerm) {
        loan_Contract.setLoan_Term(loanTerm); return this;
            }

    @Override
    public Contract buildContract() {
        return loan_Contract;
    }
}
