package com.joe.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joe.java.entity.BudgetEntity;

public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {

}
