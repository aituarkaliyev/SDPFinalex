package visitor;

public interface BankAccount {
    void accept(AccountVisitor visitor);
}
