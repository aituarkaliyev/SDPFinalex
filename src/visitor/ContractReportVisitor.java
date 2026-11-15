package visitor;


import model.Contract;
import model.MortgageContract;

public class ContractReportVisitor implements ContractVisitor {

    private String report;

    @Override
    public void visitContract(Contract contract) {

        double amount = contract.getSumOfContract();
        double interest = amount * contract.getInterestRate() / 100
                * contract.getDurationMonths() / 12;

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
                contract.getInterestRate(),
                contract.getDurationMonths(),
                interest,
                amount + interest
        );
    }

    @Override
    public void visitMortgageContract(MortgageContract contract) {

        double amount = contract.getSumOfContract();
        double interest = amount * contract.getInterestRate() / 100
                * contract.getDurationMonths() / 12;

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
