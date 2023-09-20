package com.microservices.fraud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class FraudCheckHistory {
     @Id
     @SequenceGenerator(
             name = "fraud_id_sequence",
             sequenceName = "fraud_id_sequence"
     )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fraud_id_sequence"
    )
    private Integer id;
     private Integer customerId;
     private Boolean isFraud;
     private LocalDateTime createdAt;

}
