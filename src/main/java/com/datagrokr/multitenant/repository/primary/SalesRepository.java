package com.datagrokr.multitenant.repository.primary;

import com.datagrokr.multitenant.entity.primary.Sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer> {
    
}
