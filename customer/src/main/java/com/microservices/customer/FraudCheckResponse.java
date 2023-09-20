package com.microservices.customer;

public record FraudCheckResponse(
        Boolean isFraud
) {
}
