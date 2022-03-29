package com.datagrokr.multitenant.repository.primary;

import com.datagrokr.multitenant.entity.primary.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
