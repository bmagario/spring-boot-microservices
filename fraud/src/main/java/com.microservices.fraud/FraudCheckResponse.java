package com.microservices.fraud;

public record FraudCheckResponse(
        Boolean isFraud
) {
}
