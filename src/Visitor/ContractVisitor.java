package Visitor;

import model.Contract;

public interface ContractVisitor {
    void visit(Contract contract);
}