package com.app.orderService.Entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue
    private UUID productId;
    private String productName;
    private BigInteger quantity;
    private BigDecimal price;

}
