package com.Tejas.finance_dashboard_backend.Repository;

import com.Tejas.finance_dashboard_backend.Entity.FinancialRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialRecordRepo extends JpaRepository<FinancialRecord,Long> {
}
