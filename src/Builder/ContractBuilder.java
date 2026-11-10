package Builder;

public interface ContractBuilder {
    ContractBuilder setFirst_Name(String firstName);
    ContractBuilder setLast_Name(String lastName);
    ContractBuilder setIIN(String IIN);
    ContractBuilder setSum(double sum);
    Contract buildContract();
}
