public class ComplianceVisitor implements ContractVisitor {
    @Override
    public void visit(Contract contract) {
        System.out.println("[Compliance Visitor] Checking contract for IIN: " + contract.getIIN());

        if (contract.getIIN().length() != 12) {
            System.out.println("[Compliance ALERT] Invalid IIN length! Must be 12 digits.");
        }

        if (contract.getSum_Of_Contract() > 5000000.0) {
            System.out.println("[Compliance ALERT] High-value contract (" + contract.getSum_Of_Contract() + ") requires National Bank financial monitoring report!");
        } else {
            System.out.println("[Compliance OK] Contract amount is within standard limits.");
        }
    }
}