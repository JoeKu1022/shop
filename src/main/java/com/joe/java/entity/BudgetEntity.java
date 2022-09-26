package com.joe.java.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUDGET")
public class BudgetEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="BUDGET")
	private float budget;
	
	@Column(name="BUDGET_MONTH")
	private Date budgetMonth;
	
	@Column(name="CREATED_AT")
	private Date createdAt;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_AT")
	private Date updatedAt;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public Date getBudgetMonth() {
		return budgetMonth;
	}

	public void setBudgetMonth(Date budgetMonth) {
		this.budgetMonth = budgetMonth;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
