package com.Tejas.finance_dashboard_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatgeoryRepo extends JpaRepository<CatgeoryRepo,Long> {
}
