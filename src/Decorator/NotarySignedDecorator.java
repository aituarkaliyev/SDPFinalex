package Decorator;


public class NotarySignedDecorator extends ContractWrapper {
    public NotarySignedDecorator(Contract contract) {
        super(contract);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("   [✔] Status: Verified and signed by Certified Notary.");
    }
}
