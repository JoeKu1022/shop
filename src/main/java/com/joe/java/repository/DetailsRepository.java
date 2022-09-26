package com.joe.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joe.java.entity.DetailsEntity;

public interface DetailsRepository extends JpaRepository<DetailsEntity, Long> {

}
