public class ComplianceVisitor implements ContractVisitor {
    @Override
    public void visit(Contract contract) {
        System.out.println("[Visitor] Checking contract for IIN: " + contract.getIIN() + ", Sum: " + contract.getSum_Of_Contract());
        if (contract.getSum_Of_Contract() > 5000000) {
            System.out.println("[Visitor ALERT] High-value contract requires National Bank notification!");
        }
    }
}