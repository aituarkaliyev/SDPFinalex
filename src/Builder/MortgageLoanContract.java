package Builder;

import model.MortgageContract;


public class MortgageLoanContract implements ContractBuilder {
    private MortgageContract mortgageLoanContract;

    public MortgageLoanContract() {
        this.reset();
    }

    public ContractBuilder reset() {
        this.mortgageLoanContract = new MortgageContract(); return this;
    }

    public MortgageLoanContract setAddress(String address) {
        mortgageLoanContract.setAddress(address);
        return this;
    }

    public MortgageLoanContract setDownPayment(double downPayment) {
        mortgageLoanContract.setDownPayment(downPayment);
        return this;
    }

    public MortgageLoanContract setPropertyPrice(double propertyPrice) {
        mortgageLoanContract.setPropertyPrice(propertyPrice);
        return this;
    }


    @Override
    public MortgageLoanContract setClientName(String clientName) {
        mortgageLoanContract.setClientName(clientName); return this;
    }

    @Override
    public MortgageLoanContract setSumOfContract(double sum) {
        mortgageLoanContract.setSumOfContract(sum); return this;
    }

    @Override
    public MortgageLoanContract setDurationMonths(int durationMonths) {
        mortgageLoanContract.setDurationMonths(durationMonths); return this;
    }

    @Override
    public MortgageContract buildContract() {
        double loanAmount = mortgageLoanContract.calculateLoanAmount();
        mortgageLoanContract.setSumOfContract(loanAmount);
        return mortgageLoanContract;
    }
}
