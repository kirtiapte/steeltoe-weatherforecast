package com.example.contractTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fraudcheck")
public class FraudController {

    @Autowired
    private FraudService fraudService;

    @PostMapping
    public ResponseEntity<FraudCheckResponse> checkFraud(@RequestBody FraudCheckRequest request) {
        return ResponseEntity.ok(fraudService.checkFraud(request));
    }
}