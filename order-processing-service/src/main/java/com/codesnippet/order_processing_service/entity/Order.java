package com.codesnippet.order_processing_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Table(name = "`order`")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerEmail;
    private String status; // PENDING, PROCESSING, COMPLETED
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.status = "PENDING";
        this.createdAt = LocalDateTime.now();
    }

}
