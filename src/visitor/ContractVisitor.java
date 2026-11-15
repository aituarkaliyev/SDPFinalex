package visitor;

import model.Contract;
import model.MortgageContract;

public interface ContractVisitor {

    void visitContract(Contract contract);

    void visitMortgageContract(MortgageContract contract);
}
