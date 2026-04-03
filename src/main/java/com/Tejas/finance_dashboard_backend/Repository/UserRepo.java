package com.Tejas.finance_dashboard_backend.Repository;

import com.Tejas.finance_dashboard_backend.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Long> {
}
