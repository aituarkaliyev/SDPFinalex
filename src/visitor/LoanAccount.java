package visitor;

import java.util.Objects;

public class LoanAccount implements BankAccount {
    private double remainingDebt;
    private double propertyPrice;

    public LoanAccount(double remainingDebt, double propertyPrice) {
        if (!Double.isFinite(remainingDebt) || remainingDebt < 0) {
            throw new IllegalArgumentException("Remaining debt must be positive and finite");
        }
        if (!Double.isFinite(propertyPrice) || propertyPrice <= 0) {
            throw new IllegalArgumentException("Property price must be positive and finite");
        }
        this.remainingDebt = remainingDebt;
        this.propertyPrice = propertyPrice;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getRemainingDebt() {
        return remainingDebt;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        Objects.requireNonNull(visitor, "Visitor cannot be null");
        visitor.visitLoanAccount(this);
    }
}
