package com.example.institute1.entity;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
    private String paymentId;
    private String adminId;
    private String studentId;
    private LocalDate paymentDate;
    private Double amount;
}
