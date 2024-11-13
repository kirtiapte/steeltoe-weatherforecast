package com.example.contractTest;

import org.springframework.stereotype.Service;

@Service
public class FraudService {

    public FraudCheckResponse checkFraud(FraudCheckRequest request) {
        if (request.getLoanAmount() > 10000) {
            return new FraudCheckResponse("FRAUD", "Amount too high");
        }
        return new FraudCheckResponse("OK", null);
    }
}
