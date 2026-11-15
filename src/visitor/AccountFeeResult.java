package visitor;

import java.math.BigDecimal;

public class AccountFeeResult {
    private String accountType;
    private BigDecimal fee;
    private String description;

    public AccountFeeResult(String accountType, BigDecimal fee, String description) {
        if (accountType == null || accountType.isBlank()) {
            throw new IllegalArgumentException("Account type cannot be blank");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be blank");
        }
        if (fee == null || fee.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Fee cannot be null or negative");
        }
        this.accountType = accountType;
        this.description = description;
        this.fee = fee;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getDescription() {
        return description;
    }
}
