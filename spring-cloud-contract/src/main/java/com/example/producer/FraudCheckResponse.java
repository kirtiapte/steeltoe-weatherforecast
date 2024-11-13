package com.example.contractTest;

public class FraudCheckResponse {
    private String fraudCheckStatus;
    private String rejectionReason;

    public FraudCheckResponse(String fraudCheckStatus, String rejectionReason) {
        this.fraudCheckStatus = fraudCheckStatus;
        this.rejectionReason = rejectionReason;
    }

    // Getters and setters
}
