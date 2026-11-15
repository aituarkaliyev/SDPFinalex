package visitor;


import model.Contract;
import model.MortgageContract;
import strategy.InterestCalculationStrategy;

public class ContractReportVisitor implements ContractVisitor {
    private final InterestCalculationStrategy personalStrategy;
    private final InterestCalculationStrategy mortgageStrategy;

    private String report;

    public ContractReportVisitor(
            InterestCalculationStrategy personalStrategy,
            InterestCalculationStrategy mortgageStrategy
    ) {
        this.personalStrategy = personalStrategy;
        this.mortgageStrategy = mortgageStrategy;
    }

    @Override
    public void visitContract(Contract contract) {

        double amount = contract.getSumOfContract();
        double interest = personalStrategy.calculateInterest(contract);
        double rate = 20.0;

        report = """
                ===== CONTRACT REPORT =====
                Contract Type: Personal Loan
                Client: %s
                Loan Amount: %.2f KZT
                Interest Rate: %.2f%%
                Duration: %d months
                Interest: %.2f KZT
                Total Payment: %.2f KZT
                ===========================
                """.formatted(
                contract.getClientName(),
                amount,
                rate,
                contract.getDurationMonths(),
                interest,
                amount + interest
        );
    }

    @Override
    public void visitMortgageContract(MortgageContract contract) {

        double amount = contract.getSumOfContract();
        double interest = mortgageStrategy.calculateInterest(contract);
        double rate = 12.0;

        report = """
                ===== CONTRACT REPORT =====
                Contract Type: Mortgage
                Client: %s
                Property Address: %s
                Property Price: %.2f KZT
                Down Payment: %.2f KZT
                Loan Amount: %.2f KZT
                Interest Rate: %.2f%%
                Duration: %d months
                Interest: %.2f KZT
                Total Payment: %.2f KZT
                ===========================
                """.formatted(
                contract.getClientName(),
                contract.getAddress(),
                contract.getPropertyPrice(),
                contract.getDownPayment(),
                amount,
                rate,
                contract.getDurationMonths(),
                interest,
                amount + interest
        );
    }

    public String getReport() {
        if (report == null) {
            throw new IllegalStateException(
                    "No contract has been processed"
            );
        }

        return report;
    }
}
