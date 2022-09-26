package com.joe.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joe.java.entity.ExpenseRecordEntity;

public interface ExpenseRecordRepository extends JpaRepository<ExpenseRecordEntity, Long> {

}
