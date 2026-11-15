package visitor;

public interface AccountVisitor {
    void visitSavingsAccount(SavingsAccount account);
    void visitLoanAccount(LoanAccount account);
}
