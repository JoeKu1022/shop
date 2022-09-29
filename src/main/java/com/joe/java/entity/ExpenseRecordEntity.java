package com.joe.java.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "EXPENSE_RECORD")
public class ExpenseRecordEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="DATAIL")
	private String detail;
	
	@Column(name="EXPENSES")
	private float expenses;
	
	@Column(name="EXPENSES_DAY")
	private Date expenseDay;
	
	@Column(name="CREATED_AT")
	private Date createdAt;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_AT")
	private Date updatedAt;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;

    @Column(name = "USER_ID")
    @NonNull
    private String userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public float getExpenses() {
		return expenses;
	}

	public void setExpenses(float expenses) {
		this.expenses = expenses;
	}

	public Date getExpenseDay() {
		return expenseDay;
	}

	public void setExpenseDay(Date expenseDay) {
		this.expenseDay = expenseDay;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
