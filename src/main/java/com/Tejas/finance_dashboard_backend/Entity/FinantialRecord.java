package com.Tejas.finance_dashboard_backend.Entity;

import com.Tejas.finance_dashboard_backend.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class FinantialRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String notes;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
