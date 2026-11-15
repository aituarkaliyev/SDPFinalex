package Builder;

import model.Contract;

public interface ContractBuilder {
    ContractBuilder setClientName(String firstName);
    ContractBuilder setSumOfContract(double sum);
    ContractBuilder setDurationMonths(int durationMonths);
    Contract buildContract();
}
