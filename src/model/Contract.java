package model;

import visitor.ContractReportVisitor;

import java.util.Objects;

public class Contract {
    private String clientName;
    private double sumOfContract;
    private int durationMonths;

    public void setClientName(String clientName) {
        if (clientName == null || clientName.isBlank()) {
            throw new IllegalArgumentException("Your name cannot be blank or null");
        }
        this.clientName = clientName;
    }

    public void setDurationMonths(int durationMonths) {
        if (durationMonths <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }
        this.durationMonths = durationMonths;
    }

    public void setSumOfContract(double sumOfContract) {
        if (!Double.isFinite(sumOfContract) || sumOfContract <= 0) {
            throw new IllegalArgumentException("Sum of contract must be positive and finite");
        }
        this.sumOfContract = sumOfContract;
    }

    public String getClientName() {
        return clientName;
    }

    public double getSumOfContract() {
        return sumOfContract;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void accept(ContractReportVisitor visitor) {
        Objects.requireNonNull(visitor, "Visitor cannot be null");
        visitor.visitContract(this);
    }
}
