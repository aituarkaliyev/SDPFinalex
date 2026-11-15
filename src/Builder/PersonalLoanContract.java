package Builder;

import model.Contract;

public class PersonalLoanContract implements ContractBuilder {
    private Contract personalLoanContract;

    public PersonalLoanContract() {
        this.reset();
    }

    public ContractBuilder reset() {
        this.personalLoanContract = new Contract(); return this;
    }

    @Override
    public ContractBuilder setClientName(String clientName) {
        personalLoanContract.setClientName(clientName); return this;
    }


    @Override
    public ContractBuilder setSumOfContract(double sum) {
        personalLoanContract.setSumOfContract(sum); return this;
    }

    @Override
    public ContractBuilder setDurationMonths(int durationMonths) {
        personalLoanContract.setDurationMonths(durationMonths); return this;
    }

    @Override
    public Contract buildContract() {
        Contract finishedContract = this.personalLoanContract;
        this.reset();
        return finishedContract;
    }
}
