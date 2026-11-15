package Facade;

import Builder.MortgageLoanContract;
import Builder.PersonalLoanContract;
import Decorator.InsuranceFeeDecorator;
import Decorator.ServiceFeeDecorator;
import Observer.ContractProcessor;
import Observer.FraudDetectionAlert;
import Observer.FraudObserver;
import model.Contract;
import model.MortgageContract;
import strategy.InterestCalculationStrategy;
import strategy.InterestContext;
import strategy.MortgageInterestStrategy;
import strategy.PersonalLoanInterestStrategy;
import visitor.ContractReportVisitor;

import java.util.Objects;

public class BankSystemFacade {
    private final ContractProcessor contractProcessor;

    public BankSystemFacade() {
        this.contractProcessor = new ContractProcessor();

        this.contractProcessor.registerObserver(new FraudDetectionAlert());
    }

    public Contract createPersonalLoan(String clientName, double amount, int durationMonths) {
        PersonalLoanContract builder = new PersonalLoanContract();

        return builder
                .setClientName(clientName)
                .setSumOfContract(amount)
                .setDurationMonths(durationMonths)
                .buildContract();
    }

    public MortgageContract createMortgage(String clientName, String address, double propertyPrice, double downPayment, int durationMonths) {
        MortgageLoanContract builder = new MortgageLoanContract();

        return builder
                .setClientName(clientName)
                .setAddress(address)
                .setPropertyPrice(propertyPrice)
                .setDownPayment(downPayment)
                .setDurationMonths(durationMonths)
                .buildContract();
    }

    // =========================
    // OBSERVER
    // =========================

    public void registerFraudObserver(FraudObserver observer) {
        contractProcessor.registerObserver(observer);
    }

    public void removeFraudObserver(FraudObserver observer) {
        contractProcessor.removeObserver(observer);
    }

    public void processContract(Contract contract) {
        Objects.requireNonNull(contract, "Contract cannot be null");

        contractProcessor.processContract(contract);
    }

    // =========================
    // STRATEGY
    // =========================

    private InterestCalculationStrategy getInterestStrategy(
            Contract contract
    ) {
        if (contract instanceof MortgageContract) {
            return new MortgageInterestStrategy();
        }

        return new PersonalLoanInterestStrategy();
    }

    public double calculateInterest(Contract contract) {
        Objects.requireNonNull(contract, "Contract cannot be null");

        InterestContext context = new InterestContext();
        context.setStrategy(getInterestStrategy(contract));

        return context.executeCalculation(contract);
    }

    // =========================
    // DECORATOR
    // =========================

    public double calculateInterestWithServices(
            Contract contract,
            boolean includeInsurance,
            boolean includeServiceFee
    ) {
        Objects.requireNonNull(contract, "Contract cannot be null");

        InterestCalculationStrategy strategy =
                getInterestStrategy(contract);

        if (includeInsurance) {
            strategy = new InsuranceFeeDecorator(strategy);
        }

        if (includeServiceFee) {
            strategy = new ServiceFeeDecorator(strategy);
        }

        InterestContext context = new InterestContext();
        context.setStrategy(strategy);

        return context.executeCalculation(contract);
    }

    // =========================
    // VISITOR
    // =========================

    public String generateContractReport(Contract contract) {
        Objects.requireNonNull(contract, "Contract cannot be null");

        ContractReportVisitor visitor = new ContractReportVisitor();

        contract.accept(visitor);

        return visitor.getReport();
    }


}
