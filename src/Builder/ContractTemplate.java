package Builder;

import model.Contract;

public class ContractTemplate {
    public Contract LoanContract(ContractBuilder contractBuilder) {
        return contractBuilder
                .setSumOfContract(10000000)
                .setLoanTerm(10)
                .buildContract();
    }

    public Contract CreditContract(ContractBuilder contractBuilder) {
        return contractBuilder
                .setSumOfContract(500000)
                .setLoanTerm(1)
                .buildContract();
    }
}
