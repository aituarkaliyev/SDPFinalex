public class Contract {
    private String firstName;
    private String lastName;
    private String  IIN;
    private double sumOfContract;
    private double loanTerm;

    public void setFirst_Name(String first_Name) {
        if (first_Name == null || first_Name.isBlank()) {
            throw new IllegalArgumentException("Your first name cannot be blank or null");
        }
        this.firstName = first_Name;
    }

    public void setLast_Name(String last_Name) {
        if (last_Name == null || last_Name.isBlank()) {
            throw new IllegalArgumentException("Your last name cannot be blank or null");
        }
        this.lastName = last_Name;
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
}
