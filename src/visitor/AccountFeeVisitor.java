package visitor;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class AccountFeeVisitor implements AccountVisitor {
    private static final BigDecimal SAVINGS_MONTHLY_FEE = new BigDecimal("1000");
    private static final BigDecimal MORTGAGE_FEE_RATE = new BigDecimal("0.01");
    private AccountFeeResult result;

    @Override
    public void visitSavingsAccount(SavingsAccount account) {

        BigDecimal fee = SAVINGS_MONTHLY_FEE;

        result = new AccountFeeResult(
                "Savings Account",
                fee,
                "Monthly maintenance fee: 1000 KZT"
        );
    }

    @Override
    public void visitLoanAccount(LoanAccount account) {

        BigDecimal propertyPrice =
                BigDecimal.valueOf(account.getPropertyPrice());

        BigDecimal fee = propertyPrice
                .multiply(MORTGAGE_FEE_RATE)
                .setScale(2, RoundingMode.HALF_UP);

        result = new AccountFeeResult(
                "Mortgage Account",
                fee,
                "1% of property price"
        );
    }
    public AccountFeeResult getResult() {
        if (result == null) {
            throw new IllegalStateException("No account has been processed yet");
        }
        return result;
    }
}
