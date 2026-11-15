package Builder;

import model.Contract;

public interface ContractBuilder {
    ContractBuilder setFirstName(String firstName);
    ContractBuilder setLastName(String lastName);
    ContractBuilder setIIN(String IIN);
    ContractBuilder setSumOfContract(double sum);
    ContractBuilder setLoanTerm(double loanTerm);
    Contract buildContract();
}
