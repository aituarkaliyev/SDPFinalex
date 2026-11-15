package model;

import visitor.ContractVisitor;

import java.util.Objects;


public class MortgageContract extends Contract {
    private String address;
    private double downPayment;
    private double propertyPrice;

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address cannot be blank");
        }
        this.address = address;
    }

    public void setDownPayment(double downPayment) {
        if (!Double.isFinite(downPayment) || downPayment <= 0) {
            throw new IllegalArgumentException("Down payment must be positive and finite");
        }
        this.downPayment = downPayment;
    }

    public void setPropertyPrice(double propertyPrice) {
        if (!Double.isFinite(propertyPrice) || propertyPrice <= 0) {
            throw new IllegalArgumentException("Property price must be positive and finite");
        }
        this.propertyPrice = propertyPrice;
    }

    public double calculateLoanAmount() {
        if (downPayment >= propertyPrice) {
            throw new IllegalStateException("Down payment must be less than property price");
        }
        return propertyPrice - downPayment;
    }
    public String getAddress() {
        return address;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public void accept(ContractVisitor visitor) {
        Objects.requireNonNull(visitor, "Visitor cannot be null");
        visitor.visitMortgageContract(this);
    }
}
