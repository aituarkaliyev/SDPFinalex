package visitor;

import java.util.Objects;

public class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount(double balance) {
        if (!Double.isFinite(balance)) {
            throw new IllegalArgumentException("Balance must be finite");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        Objects.requireNonNull(visitor, "Visitor cannot be null");
        visitor.visitSavingsAccount(this);
    }
}
