package com.app.orderService.Entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.app.orderService.Enum.PaymentMethod;
import com.app.orderService.Enum.PaymentStatus;
import com.app.orderService.Enum.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Order {
@Id
@GeneratedValue
private UUID id;
// we have commnet userID as I do not have created 
//private UUID userId;
private List<Item> items;
private BigDecimal totalAmount;
@Enumerated(EnumType.STRING)
private Status status;
@Enumerated(EnumType.STRING)
private PaymentMethod paymentMethod;
@Enumerated(EnumType.STRING)
private PaymentStatus paymentStatus;
private String shippingAddress;
private String createdAt;
private String updatedAt;


    
}
