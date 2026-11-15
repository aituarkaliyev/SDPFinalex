import Builder.MortgageLoanContract;
import Builder.PersonalLoanContract;
import Facade.BankSystemFacade;
import model.Contract;
import model.MortgageContract;
import visitor.*;

public class Main {
    static void main(String[] args) {
        BankSystemFacade bank = new BankSystemFacade();

        // 1. Create personal loan
        Contract personalLoan = bank.createPersonalLoan(
                "John Smith",
                500_000,
                12
        );

        // 2. Create mortgage
        MortgageContract mortgage = bank.createMortgage(
                "John Smith",
                "Saryarka 4",
                40_000_000,
                10_000_000,
                120
        );

        // 3. Process contracts (Observer)
        bank.processContract(personalLoan);
        bank.processContract(mortgage);

        // 4. Calculate interest (Strategy)
        double personalInterest =
                bank.calculateInterest(personalLoan);

        double mortgageInterest =
                bank.calculateInterest(mortgage);

        System.out.printf("Personal loan interest: %.2f KZT%n",
                personalInterest);

        System.out.printf("Mortgage interest: %.2f KZT%n",
                mortgageInterest);

        // 5. Calculate interest with additional services (Decorator)
        double decoratedInterest =
                bank.calculateInterestWithServices(
                        personalLoan,
                        true,
                        true
                );

        System.out.println("Interest with additional services: "
                + decoratedInterest);

        // 6. Generate report (Visitor)
        System.out.println(
                bank.generateContractReport(mortgage)
        );

    }
}