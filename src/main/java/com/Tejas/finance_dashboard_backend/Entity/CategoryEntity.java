package com.Tejas.finance_dashboard_backend.Entity;

import com.Tejas.finance_dashboard_backend.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @OneToMany(mappedBy = "category")
    private List<FinancialRecord> records;
}


