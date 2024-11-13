package com.example.contractTest;

public class FraudCheckRequest {
    private String clientId;
    private int loanAmount;

    // Getters and setters

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getClientId() {
        return clientId;
    }

    public int getLoanAmount() {
        return loanAmount;
    }
}
