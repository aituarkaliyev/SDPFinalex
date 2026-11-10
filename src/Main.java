import Builder.ContractBuilder;
import Builder.CreditContract;
import Builder.LoanContract;
import Observer.FraudAndAuditLogger;
import Observer.Observer;
import facade.BankSystemFacade;
import strategy.CreditInterestStrategy;
import strategy.InterestStrategy;
import strategy.LoanInterestStrategy;

public class Main {
    public static void main(String[] args) {
        BankSystemFacade bankFacade = new BankSystemFacade();

        Observer fraudLogger = new FraudAndAuditLogger();
        bankFacade.registerObserver(fraudLogger);

        System.out.println("=== PROCESSING LOAN CONTRACT ===");
        ContractBuilder loanBuilder = new LoanContract();
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
        );
    }
}