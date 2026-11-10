public class Contract {
    private String first_Name;
    private String last_Name;
    private String  IIN;
    private double sum_Of_Contract;

    public void setFirst_Name(String first_Name) {
        if (first_Name == null || first_Name.isBlank()) {
            throw new IllegalArgumentException("Your first name cannot blank or null");
        }
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        if (last_Name == null || last_Name.isBlank()) {
            throw new IllegalArgumentException("Your last name cannot blank or null");
        }
        this.last_Name = last_Name;
    }

    public void setIIN(String IIN) {
        if (IIN == null || IIN.isBlank()) {
            throw new IllegalArgumentException("Your iin must contain exactly 12 digits");
        }
        this.IIN = IIN;
    }

    public void setSum_Of_Contract(double sum_Of_Contract) {
        if (!Double.isFinite(sum_Of_Contract) || sum_Of_Contract <= 0) {
            throw new IllegalArgumentException("Sum of contract must be positive");
        }
        this.sum_Of_Contract = sum_Of_Contract;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getIIN() {
        return IIN;
    }

    public double getSum_Of_Contract() {
        return sum_Of_Contract;
    }
}
