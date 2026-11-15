import Builder.ContractTemplate;
import Builder.MortgageLoanContract;
import Builder.PersonalLoanContract;
import model.Contract;
import model.MortgageContract;
import visitor.*;

public class Main {
    static void main(String[] args) {
        /*
        BankSystemFacade bankFacade = new BankSystemFacade();

        Observer fraudLogger = new FraudAndAuditLogger();
        bankFacade.registerObserver(fraudLogger);

        System.out.println("=== PROCESSING LOAN CONTRACT ===");
        ContractBuilder loanBuilder = new MortgageLoanContract();
        InterestStrategy loanStrategy = new LoanInterestStrategy();

        bankFacade.processNewContract(
                loanBuilder,
                "Aituar",
                "Kaliyev",
                "050112350123",
                3500000.0,
                loanStrategy
        );

        System.out.println("\n=== PROCESSING CREDIT CONTRACT ===");
        ContractBuilder creditBuilder = new CreditContract();
        InterestStrategy creditStrategy = new CreditInterestStrategy();

        bankFacade.processNewContract(
                creditBuilder,
                "Dias",
                "Sarsenov",
                "040518450987",
                6200000.0,
                creditStrategy
        );*/
        ContractTemplate director = new ContractTemplate();

        // Personal Loan
        PersonalLoanContract personalBuilder =
                new PersonalLoanContract();

        Contract personalContract =
                director.personalLoanContract(personalBuilder);

        // Mortgage Loan
        MortgageLoanContract mortgageBuilder =
                new MortgageLoanContract();

        MortgageContract mortgageContract =
                director.mortgageLoanContract(mortgageBuilder);

        // Output
        System.out.println("=== PERSONAL LOAN ===");
        System.out.println("Client: " + personalContract.getClientName());
        System.out.println("Sum: " + personalContract.getSumOfContract());
        System.out.println("Duration: " + personalContract.getDurationMonths());

        System.out.println("\n=== MORTGAGE LOAN ===");
        System.out.println("Client: " + mortgageContract.getClientName());
        System.out.println("Duration: " + mortgageContract.getDurationMonths());
        System.out.println("Address: " + mortgageContract.getAddress());
        System.out.printf("Down payment: %,.0f%n", mortgageContract.getDownPayment());
        System.out.printf("Property price: %,.0f%n", mortgageContract.getPropertyPrice());
        System.out.printf("Loan amount: %,.0f%n", mortgageContract.getSumOfContract());
        System.out.println("\n");


    }
}