package Builder;

import model.Contract;
import model.MortgageContract;

public class ContractTemplate {
    public MortgageContract mortgageLoanContract(MortgageLoanContract mortgageLoanContract) {
        return mortgageLoanContract
                .setClientName("John Smith")
                .setDurationMonths(12)
                .setAddress("Saryarka 4")
                .setDownPayment(10_000_000)
                .setPropertyPrice(40_000_000)
                .buildContract();
    }

    public Contract personalLoanContract(PersonalLoanContract contractBuilder) {
        return contractBuilder
                .setClientName("John Smith")
                .setSumOfContract(500000)
                .setDurationMonths(12)
                .buildContract();
    }
}
