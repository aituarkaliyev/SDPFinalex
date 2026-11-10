package model;

import Visitor.ContractVisitor;
import java.util.Objects;

public class Contract {
    private String firstName;
    private String lastName;
    private String  IIN;
    private double sumOfContract;
    private double loanTerm;

    public void setFirst_Name(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("Your first name cannot be blank or null");
        }
        this.firstName = firstName;
    }

    public void setLast_Name(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Your last name cannot be blank or null");
        }
        this.lastName = lastName;
    }

    public void setIIN(String IIN) {
        if (IIN == null || IIN.isBlank()) {
            throw new IllegalArgumentException("Your iin cannot be blank");
        }
        if (IIN.length() != 12) {
            throw new IllegalArgumentException("Your iin must contain exactly 12 digits");
        }
        this.IIN = IIN;
    }

    public void setLoan_Term(double loanTerm) {
        if (!Double.isFinite(loanTerm) || loanTerm <= 0) {
            throw new IllegalArgumentException("Loan term must be finite and positive");
        }
        this.loanTerm = loanTerm;
    }

    public void setSum_Of_Contract(double sumOfContract) {
        if (!Double.isFinite(sumOfContract) || sumOfContract <= 0) {
            throw new IllegalArgumentException("Sum of contract must be positive");
        }
        this.sumOfContract = sumOfContract;
    }

    public String getFirst_Name() {
        return firstName;
    }

    public String getLast_Name() {
        return lastName;
    }

    public String getIIN() {
        return IIN;
    }

    public double getSum_Of_Contract() {
        return sumOfContract;
    }

    public double getLoanTerm() {
        return loanTerm;
    }

    public void accept(Visitor.ContractVisitor visitor) {
        Objects.requireNonNull(visitor, "Visitor cannot be null");
        visitor.visit(this);
    }
}
