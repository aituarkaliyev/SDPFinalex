public class Contract {
    private String first_Name;
    private String last_Name;
    private int IIN;
    private double sum_Of_Contract;

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public void setIIN(int IIN) {
        this.IIN = IIN;
    }

    public void setSum_Of_Contract(double sum_Of_Contract) {
        this.sum_Of_Contract = sum_Of_Contract;
    }

    public int getIIN() {
        return IIN;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public double getSum_Of_Contract() {
        return sum_Of_Contract;
    }
}
